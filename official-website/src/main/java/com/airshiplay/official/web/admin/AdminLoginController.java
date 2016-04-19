package com.airshiplay.official.web.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.airshiplay.common.constants.SessionConstants;
import com.airshiplay.common.util.IpUtil;
import com.airshiplay.official.mybatis.model.CfgUser;
import com.airshiplay.official.service.UserService;
import com.airshiplay.official.service.model.ServiceUser;
import com.airshiplay.official.web.BaseController;
import com.airshiplay.official.web.model.ReqLogin;
import com.airshiplay.official.web.model.ResultMessage;
import com.airshiplay.official.web.model.WebUser;
import com.google.protobuf.ServiceException;
import com.octo.captcha.service.image.ImageCaptchaService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController extends BaseController {
	private static final Logger logger = LoggerFactory.getLogger(AdminLoginController.class);
	@Autowired
	private ImageCaptchaService imageCaptchaService;
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() {
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody ResultMessage<Object> loginPost(
			@RequestBody ReqLogin login, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String ip = IpUtil.getIpAddr(request);
		ServiceUser user;
		try {
			user = userService.loginUser(login.getUsername(), login.getPassword(), ip,login.getDisplay());
			HttpSession session = request.getSession();
			session.setAttribute("online", true);
			session.setAttribute(SessionConstants.SESSION_USER, user);
			Object location = session
					.getAttribute(SessionConstants.SESSION_LATEST_URL);
			if (location != null && !location.equals("")) {
				session.removeAttribute(SessionConstants.SESSION_LATEST_Servlet_Path);
				session.removeAttribute(SessionConstants.SESSION_LATEST_URL);
				return new ResultMessage<Object>(new WebUser(user).setRedirectUrl(location.toString()));
			}
			return new ResultMessage<Object>(user);
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			return ResultMessage.fail(e.getMessage());
		}
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public ModelAndView login(String username, String password, String captcha,
			HttpServletRequest request) {
		Boolean result = Boolean.FALSE;
		HttpSession session = request.getSession();
		Boolean isResponseCorrect = imageCaptchaService.validateResponseForID(
				request.getSession().getId(), captcha);
		if (isResponseCorrect) {
			// 继续校验用户名密码等..
		}
		session.setAttribute("online", true);
		return new ModelAndView("redirect:/admin/home");
	}
}
