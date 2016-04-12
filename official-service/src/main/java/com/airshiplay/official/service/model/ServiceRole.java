package com.airshiplay.official.service.model;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.CfgAuthority;
import com.airshiplay.official.mybatis.model.CfgRole;

public class ServiceRole extends CfgRole {
	private List<CfgAuthority> authorities;

	public ServiceRole(CfgRole role) {
		BeanUtils.copyProperties(role, this);
	}

	public List<CfgAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<CfgAuthority> authorities) {
		this.authorities = authorities;
	}

}
