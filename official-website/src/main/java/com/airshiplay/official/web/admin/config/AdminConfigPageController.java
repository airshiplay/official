package com.airshiplay.official.web.admin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airshiplay.official.mybatis.model.CfgPage;
import com.airshiplay.official.service.ConfigService;
import com.airshiplay.official.web.BaseController;
import com.airshiplay.official.web.model.DataTable;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/admin/config/page")
public class AdminConfigPageController extends BaseController {
	@Autowired
	ConfigService configService;

	@RequestMapping("")
	public String index() {
		return "admin/system_config/config_page";
	}

	@RequestMapping("/list/ajax")
	public @ResponseBody DataTable<CfgPage> navAjax(Model model,
			@RequestParam int start, @RequestParam int length,
			@RequestParam int draw) {
		PageInfo<CfgPage> list = configService.getConfigWebPage(start, length);
		return new DataTable<CfgPage>(list, draw + 1);
	}
}
