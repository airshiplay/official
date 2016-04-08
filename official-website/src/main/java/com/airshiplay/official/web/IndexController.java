package com.airshiplay.official.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airshiplay.official.service.IndexService;

@Controller
public class IndexController extends BaseController {
	static Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	private IndexService indexService;

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
}
