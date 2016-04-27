package com.airshiplay.official.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController extends BaseController{
	@RequestMapping("")
	public String index() {
		return "product/index";
	}

	@RequestMapping("/{id}")
	public String productDetail(@PathVariable Long id, Model model) {
		return "product/product-detail";
	}

	@RequestMapping("/list")
	public String productList(@PathVariable Long id, Model model) {
		return "product/product-list";
	}
}
