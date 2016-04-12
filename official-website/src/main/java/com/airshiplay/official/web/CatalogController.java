package com.airshiplay.official.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airshiplay.official.mybatis.model.OfCatalogDetail;
import com.airshiplay.official.service.CatalogService;

@Controller
@RequestMapping("/catalog")
public class CatalogController extends BaseController{

	@Autowired
	private CatalogService catalogService;

	@RequestMapping("/detail/{cid}")
	public String typeDetail(@PathVariable Long cid, Model model) {
		OfCatalogDetail detail = catalogService.getDetail(cid);
		model.addAttribute("detail", detail);
		return "catalog/detail";
	}

	@RequestMapping("/list/{cid}")
	public String typeList(@PathVariable Long cid, Model model) {
		List<OfCatalogDetail> list = catalogService.getDetailList(cid);
		model.addAttribute("list", list);
		return "catalog/list";
	}

	@RequestMapping("/{urlPath}/{cid}")
	public String urlPathDetail(@PathVariable String urlPath, Model model) {
		return "catalog/detail";
	}
}
