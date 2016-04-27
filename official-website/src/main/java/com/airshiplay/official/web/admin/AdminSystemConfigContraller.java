package com.airshiplay.official.web.admin;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import rx.Observable;

import com.airshiplay.official.config.GlobalObject;
import com.airshiplay.official.mybatis.model.CfgTags;
import com.airshiplay.official.mybatis.model.CfgWebSite;
import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.mybatis.model.OfCatalog;
import com.airshiplay.official.service.WebSiteService;
import com.airshiplay.official.service.SiteService;
import com.airshiplay.official.web.BaseController;
import com.airshiplay.official.web.model.DataTable;
import com.airshiplay.official.web.model.Id;
import com.airshiplay.official.web.model.ResultMessage;
import com.github.pagehelper.PageInfo;
import com.google.protobuf.ServiceException;

@Controller
@RequestMapping("/admin/config")
public class AdminSystemConfigContraller extends BaseController {
	private final static Logger logger = LoggerFactory
			.getLogger(AdminSystemConfigContraller.class);
	@Autowired
	WebSiteService companyService;
	@Autowired
	SiteService siteService;
	@Autowired
	GlobalObject globalObject;

	@RequestMapping("/site")
	public String company(Model model) {
		try {
			CfgWebSite company = companyService.getWebSite();
			model.addAttribute("company", company);
			model.addAttribute("siteStyle", globalObject.getSiteStyle());
		} catch (ServiceException e) {
			logger.error("", e);
		}
		return "admin/system-config-site";
	}

	@RequestMapping(value = "/site", method = RequestMethod.POST)
	public String companyPost(@ModelAttribute CfgWebSite companyForm,
	/** @ModelAttribute OfCompany siteForm, */
	Model model) {
		CfgWebSite company = companyService.updateWebSite(companyForm);
		model.addAttribute("company", company);
		Observable.just(company).subscribe(globalObject.actionCompany());
		//
		//Observable.just("").subscribe(globalObject.actionSiteStyle());
		return "admin/system-config-site";
	}

	@RequestMapping("/nav")
	public String site(Model model) {
		try {
			CfgWebSite company = companyService.getWebSite();
			model.addAttribute("company", company);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return "admin/system-config-nav";
	}

	@RequestMapping("/nav/ajax")
	public @ResponseBody DataTable<OfCatalog> navAjax(Model model) {
		List<OfCatalog> list = siteService.storedProcedureCatalogs();
		return new DataTable<OfCatalog>(list);
	}

	@RequestMapping("/banner")
	public String banner(Model model) {
		try {
			CfgWebSite company = companyService.getWebSite();
			model.addAttribute("company", company);
			siteService.storedProcedureCatalogs();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		return "admin/system-config-banner";
	}

	@RequestMapping("/site/banner/ajax")
	public @ResponseBody DataTable<OfBanner> bannerAjax(Model model,
			@RequestParam int start, @RequestParam int length,
			@RequestParam int draw) {
		PageInfo<OfBanner> list = siteService.getBanners(start, length);
		return new DataTable<OfBanner>(list, draw + 1);
	}

	@RequestMapping("/tags")
	public String tags(Model model) {
		return "admin/system-config-tags";
	}

	@RequestMapping(value = "/tags", method = RequestMethod.POST)
	public String tagsPost(Model model, @ModelAttribute CfgTags tag) {
		siteService.mergeTag(tag);
		return "redirect:/admin/config/tags";
	}

	@RequestMapping("/tags/list/ajax")
	public @ResponseBody DataTable<CfgTags> tagsAjax(Model model,
			@RequestParam int start, @RequestParam int length,
			@RequestParam int draw) {
		PageInfo<CfgTags> list = siteService.getTags(start, length);
		return new DataTable<CfgTags>(list, draw + 1);
	}

	@RequestMapping("/tags/modify/{id}")
	public String tagsModify(Model model, @PathVariable Long id) {
		CfgTags tag = siteService.getTag(id);
		model.addAttribute("cfgTag", tag);
		return "admin/system-config-tags-modify";
	}

	@RequestMapping("/tags/create")
	public String tagsCreate(Model model) {
		model.addAttribute("OfTag", null);
		return "admin/system-config-tags-modify";
	}

	@RequestMapping("/tags/del/ajax")
	public @ResponseBody ResultMessage<Object> tagsDel(@RequestBody Id id) {
		try {
			siteService.delTag(id.getId());
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			return ResultMessage.fail("");
		}
		return ResultMessage.success("");
	}
}
