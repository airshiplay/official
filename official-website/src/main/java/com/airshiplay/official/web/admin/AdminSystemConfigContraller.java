package com.airshiplay.official.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airshiplay.official.mybatis.model.CfgCompany;
import com.airshiplay.official.service.CompanyService;
import com.airshiplay.official.web.BaseController;
import com.google.protobuf.ServiceException;

@Controller
@RequestMapping("/admin/config")
public class AdminSystemConfigContraller extends BaseController {
	@Autowired
	CompanyService companyService;

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
}
