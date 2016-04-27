package com.airshiplay.official.web.admin;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airshiplay.common.constants.SessionConstants;
import com.airshiplay.common.util.IpUtil;
import com.airshiplay.official.mybatis.model.OfUser;
import com.airshiplay.official.service.UserService;
import com.airshiplay.official.service.model.ServiceRole;
import com.airshiplay.official.service.model.ServiceUser;
import com.airshiplay.official.web.BaseController;
import com.airshiplay.official.web.model.DataTable;
import com.airshiplay.official.web.model.ResultMessage;
import com.airshiplay.official.web.model.WebUser;
import com.google.protobuf.ServiceException;

@Controller
@RequestMapping("/admin/system")
public class AdminSystemManageController extends BaseController {
	private final static Logger logger = LoggerFactory
			.getLogger(AdminSystemManageController.class);
	@Autowired
	UserService userService;

	@RequestMapping("/usermanage")
	public String userManage(Model model) {
		return "admin/system-user-manage";
	}

	@RequestMapping("user/list/ajax")
	public @ResponseBody DataTable<ServiceUser> userList(
			@RequestParam int start, @RequestParam int length,
			@RequestParam int draw) {
		return new DataTable<ServiceUser>(userService.getUsers(start, length),
				draw + 1);
	}

	@RequestMapping("/user/role/list/ajax")
	public @ResponseBody ResultMessage<Object> getRoles() {
		return new ResultMessage<Object>(userService.getRoles());
	}

	@RequestMapping("/user/merge/ajax")
	public @ResponseBody ResultMessage<Object> mergeUser(
			@RequestBody WebUser webUser, HttpServletRequest req) {
		String ip = IpUtil.getIpAddr(req);
		Long regUid = ((OfUser) req.getSession().getAttribute(
				SessionConstants.SESSION_USER)).getId();
		try {
			return new ResultMessage<Object>(userService.mergeUser(
					webUser.getId(), webUser.getUsername(), webUser.getEmail(),
					webUser.getMobile(), webUser.getNickname(),
					webUser.getPassword(), webUser.getRoles(), ip, regUid));
		} catch (ServiceException e) {
			logger.error(e.getMessage(), e);
			return ResultMessage.fail(e.getMessage());
		}
	}

	@RequestMapping("/rolemanage")
	public String roleManage(Model model) {
		return "admin/system-role-manage";
	}

	@RequestMapping("role/list/ajax")
	public @ResponseBody DataTable<ServiceRole> roleList(
			@RequestParam int start, @RequestParam int length,
			@RequestParam int draw) {
		return new DataTable<ServiceRole>(userService.getRoles(start, length),
				draw + 1);
	}
}
