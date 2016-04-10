package com.airshiplay.official.web.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airshiplay.common.constants.SessionConstants;
import com.airshiplay.official.mybatis.model.CfgUser;
import com.airshiplay.official.service.UserService;
import com.airshiplay.official.web.BaseController;
import com.google.protobuf.ServiceException;
import com.octo.captcha.service.image.ImageCaptchaService;

@Controller
@RequestMapping("/admin")
public class AdminLoginController extends BaseController {
	@Autowired
	private ImageCaptchaService imageCaptchaService;
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login() {

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(String username, String password, String captcha,
			HttpServletRequest request, Model model) {
		String ip = null;
		CfgUser user;
		try {
			user = userService.loginUser("superadmin", password, ip);
			HttpSession session = request.getSession();
			session.setAttribute("online", true);
			session.setAttribute(SessionConstants.SESSION_USER, user);
			return "redirect:/admin/home";
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "/admin/login";
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
