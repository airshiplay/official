package com.airshiplay.official.web.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airshiplay.official.mybatis.model.CfgUser;
import com.airshiplay.official.service.UserService;
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
	public @ResponseBody DataTable<CfgUser> userList(@RequestParam int start,
			@RequestParam int length) {
		return new DataTable<CfgUser>(userService.getUsers(start, length));
	}
}
