package com.airshiplay.official.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.airshiplay.common.constants.SessionConstants;
import com.airshiplay.official.config.GlobalObject;


public class BaseController {
	@Autowired
	private GlobalObject globalObject;

	@ModelAttribute
	public void populateModel(Model model,HttpSession session) {
		model.addAttribute("company", globalObject.getCompany());
		model.addAttribute("navbar", globalObject.getNavbar());
		model.addAttribute("currentUser", session.getAttribute(SessionConstants.SESSION_USER));
	}

}
