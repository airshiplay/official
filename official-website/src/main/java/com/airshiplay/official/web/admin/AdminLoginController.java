package com.airshiplay.official.web.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.octo.captcha.service.image.ImageCaptchaService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController {
	@Autowired
	private ImageCaptchaService imageCaptchaService;

	@RequestMapping({ "/login" })
	public void login() {

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
