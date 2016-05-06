package com.airshiplay.official.web.admin;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.airshiplay.common.constants.SessionConstants;
import com.airshiplay.official.config.ConfigInfo;
import com.airshiplay.official.web.model.ResultMessage;
import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.util.Config;

@Controller
@RequestMapping("/file")
public class FileController {
	static final Logger logger = LoggerFactory.getLogger(FileController.class);
	@Autowired
	ConfigInfo configInfo;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	private Producer kaptchaProducer;

	@RequestMapping(value = "/upload", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Object uploadfile(
			@RequestParam("file") MultipartFile[] files,
			@RequestHeader(required = false, value = "User-Agent") String userAgent,
			@RequestHeader(required = false, value = "Authorization") String authorization,
			MultipartHttpServletRequest request) throws IOException {
		String objectKey = request.getParameter("objectkey");
		List<String> list = new ArrayList<String>();
		for (MultipartFile file : files) {
			if (file.isEmpty()) {
				request.getFileMap();
				System.out.println("文件未上传");
			} else {
				String fileDir = configInfo.getFileSaveDir().getFile()
						.getAbsolutePath();
				configInfo.getFileSaveDir().isReadable();
				if (fileDir == null) {
					fileDir = request.getSession().getServletContext()
							.getRealPath("/WEB-INF/files");
				}
				StringBuffer relativePath = new StringBuffer();
				relativePath.append("/").append(objectKey).append("/")
						.append(sdf.format(new Date())).append("/")
						.append(RandomStringUtils.randomNumeric(5)).append("/")
						.append(file.getOriginalFilename());
				String fullPath = fileDir + relativePath.toString();
				// 这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的
				FileUtils.copyInputStreamToFile(file.getInputStream(),
						new File(fullPath));
				list.add("files/" + relativePath.toString());
			}
		}
		return new ResultMessage<List<String>>(list);
	}

	@RequestMapping("/image")
	public void fileImage(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
			if (this.kaptchaProducer == null) {
				Config config = new Config(new Properties());
				this.kaptchaProducer = config.getProducerImpl();
			}
			String c = kaptchaProducer.createText();
			request.getSession(true).setAttribute(
					SessionConstants.SESSION_CAPTCHA, c);
			BufferedImage challenge = kaptchaProducer.createImage(c);

			response.setHeader("Cache-Control", "no-store");
			response.setHeader("Pragma", "no-cache");
			response.setDateHeader("Expires", 0L);
			response.setContentType("image/jpeg");
			ImageIO.write(challenge, "jpeg", jpegOutputStream);
			byte[] captchaChallengeAsJpeg = jpegOutputStream.toByteArray();

			ServletOutputStream respOs = response.getOutputStream();
			respOs.write(captchaChallengeAsJpeg);
			respOs.flush();
			respOs.close();
		} catch (IOException e) {
			logger.error("generate captcha image error: {}", e.getMessage());
		}
	}

}
