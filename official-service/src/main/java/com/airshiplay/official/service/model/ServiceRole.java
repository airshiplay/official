package com.airshiplay.official.service.model;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.OfPermission;
import com.airshiplay.official.mybatis.model.OfRole;

public class ServiceRole extends OfRole {
	private List<OfPermission> authorities;

	public ServiceRole(OfRole role) {
		BeanUtils.copyProperties(role, this);
	}

	public List<OfPermission> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<OfPermission> authorities) {
		this.authorities = authorities;
	}

}
