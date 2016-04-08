package com.airshiplay.official.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.airshiplay.official.config.GlobalObject;


public class BaseController {
	@Autowired
	private GlobalObject globalObject;

	@ModelAttribute
	public void populateModel(Model model) {
		model.addAttribute("company", globalObject.getCompany());
		model.addAttribute("navbar", globalObject.getNavbar());
	}

}
