package com.airshiplay.official.web.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airshiplay.official.mybatis.model.CfgCompany;
import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.mybatis.model.OfCatalog;
import com.airshiplay.official.service.CompanyService;
import com.airshiplay.official.service.SiteService;
import com.airshiplay.official.web.BaseController;
import com.airshiplay.official.web.model.DataTable;
import com.github.pagehelper.PageInfo;
import com.google.protobuf.ServiceException;

@Controller
@RequestMapping("/admin/config")
public class AdminSystemConfigContraller extends BaseController {
	@Autowired
	CompanyService companyService;
	@Autowired
	SiteService siteService;

	@RequestMapping("/company")
	public String company(Model model) {
		try {
			CfgCompany company = companyService.getCompany();
			model.addAttribute("company", company);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return "admin/system-config-company";
	}

	@RequestMapping("/site")
	public String site(Model model) {
		try {
			CfgCompany company = companyService.getCompany();
			model.addAttribute("company", company);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return "admin/system-config-site";
	}

	@RequestMapping("/site/nav/ajax")
	public @ResponseBody DataTable<OfCatalog> navAjax(Model model) {
		List<OfCatalog> list = siteService.getCatalogs();
		return new DataTable<OfCatalog>(list);
	}

	@RequestMapping("/banner")
	public String banner(Model model) {
		try {
			CfgCompany company = companyService.getCompany();
			model.addAttribute("company", company);
			siteService.getCatalogs();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return "admin/system-config-banner";
	}

	@RequestMapping("/site/banner/ajax")
	public @ResponseBody DataTable<OfBanner> bannerAjax(Model model,
			@RequestParam int start, @RequestParam int length) {
		PageInfo<OfBanner> list = siteService.getBanners(start, length);
		return new DataTable<OfBanner>(list);
	}

}
