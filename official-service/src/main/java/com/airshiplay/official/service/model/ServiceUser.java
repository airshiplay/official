package com.airshiplay.official.service.model;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.CfgRole;
import com.airshiplay.official.mybatis.model.CfgUser;

public class ServiceUser extends CfgUser {
	private List<CfgRole> roles;

	public ServiceUser() {
	}

	public ServiceUser(CfgUser user) {
		BeanUtils.copyProperties(user, this);
	}

	public List<CfgRole> getRoles() {
		return roles;
	}

	public ServiceUser setRoles(List<CfgRole> roles) {
		this.roles = roles;
		return this;
	}
}
