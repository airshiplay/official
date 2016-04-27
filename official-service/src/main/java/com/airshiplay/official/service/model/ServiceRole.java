package com.airshiplay.official.service.model;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.OfAuthority;
import com.airshiplay.official.mybatis.model.OfRole;

public class ServiceRole extends OfRole {
	private List<OfAuthority> authorities;

	public ServiceRole(OfRole role) {
		BeanUtils.copyProperties(role, this);
	}

	public List<OfAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<OfAuthority> authorities) {
		this.authorities = authorities;
	}

}
