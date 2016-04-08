package com.airshiplay.official.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/catalog")
public class AdminCatalogDetailController {

	@RequestMapping("/detail/edit")
	public ModelAndView detailEdit(){
		return new ModelAndView("/admin/detail_edit");
	}
}
