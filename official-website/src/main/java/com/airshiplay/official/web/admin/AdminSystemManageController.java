package com.airshiplay.official.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airshiplay.official.mybatis.model.CfgRole;
import com.airshiplay.official.mybatis.model.CfgUser;
import com.airshiplay.official.service.UserService;
import com.airshiplay.official.service.model.ServiceRole;
import com.airshiplay.official.service.model.ServiceUser;
import com.airshiplay.official.web.BaseController;
import com.airshiplay.official.web.model.DataTable;

@Controller
@RequestMapping("/admin/system")
public class AdminSystemManageController extends BaseController {
	@Autowired
	UserService userService;

	@RequestMapping("/usermanage")
	public String userManage(Model model) {
		return "admin/system-user-manage";
	}

	@RequestMapping("user/list/ajax")
	public @ResponseBody DataTable<ServiceUser> userList(
			@RequestParam int start, @RequestParam int length) {
		return new DataTable<ServiceUser>(userService.getUsers(start, length));
	}

	@RequestMapping("/rolemanage")
	public String roleManage(Model model) {
		return "admin/system-role-manage";
	}

	@RequestMapping("role/list/ajax")
	public @ResponseBody DataTable<ServiceRole> roleList(
			@RequestParam int start, @RequestParam int length) {
		return new DataTable<ServiceRole>(userService.getRoles(start, length));
	}
}
