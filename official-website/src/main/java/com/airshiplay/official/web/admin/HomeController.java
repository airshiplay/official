package com.airshiplay.official.web.admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.airshiplay.official.service.HomeService;
import com.airshiplay.official.web.BaseController;

@Controller
@RequestMapping("/admin")
public class HomeController extends BaseController{
	@Autowired
	HomeService homeService;
	 

	@RequestMapping({ "", "/","/home" })
	public ModelAndView home(HttpSession session) {
//		if (session == null || session.getAttribute("online") == null) {
//			return new ModelAndView("redirect:/admin/login");
//		}
		homeService.hashCode();
		return new ModelAndView("admin/home");
	}


}
