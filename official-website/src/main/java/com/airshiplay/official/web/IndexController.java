package com.airshiplay.official.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.service.IndexService;
import com.google.common.base.Optional;

@Controller
public class IndexController extends BaseController {
	static Logger logger = LoggerFactory.getLogger(IndexController.class);
	@Autowired
	private IndexService indexService;

	@RequestMapping(value = { "/", "/index", "index.jsp" })
	public String index(Model model) {
		Optional<List<OfBanner>> banners = indexService.getBanners();
		model.addAttribute("banners", banners.get());
		return "index";
	}
}
