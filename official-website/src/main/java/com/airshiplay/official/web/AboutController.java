package com.airshiplay.official.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController extends BaseController{

	@RequestMapping("/aboutus")
	public String aboutUs() {
		return "about-us";
	}
}
