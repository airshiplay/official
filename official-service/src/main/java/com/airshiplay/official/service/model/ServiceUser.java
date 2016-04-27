package com.airshiplay.official.service.model;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.OfAccessToken;
import com.airshiplay.official.mybatis.model.OfRole;
import com.airshiplay.official.mybatis.model.OfUser;

public class ServiceUser extends OfUser {
	private List<OfRole> roles;
	private String accessToken;
	private Date expires;
	private int expiresIn;

	public ServiceUser() {
	}

	public ServiceUser(OfUser user) {
		BeanUtils.copyProperties(user, this);
	}

	public List<OfRole> getRoles() {
		return roles;
	}

	public ServiceUser setRoles(List<OfRole> roles) {
		this.roles = roles;
		return this;
	}

	// access_token接口调用凭证超时时间，单位（秒）
	public long getExpiresIn() {
		if (getExpires() == null) {
			return 0L;
		} else {
			long currInMs = System.currentTimeMillis();
			return Math.round((getExpires().getTime() - currInMs) / 1000.0);
		}
	}

	public void setExpiresIn(int expiresIn) {
		this.expiresIn = expiresIn;
	}

	public Date getExpires() {
		return expires;
	}

	public void setExpires(Date expires) {
		this.expires = expires;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public ServiceUser setAccessToken(OfAccessToken accessToken) {
		this.accessToken = accessToken.getAccessToken();
		this.expires = accessToken.getExpires();
		return this;
	}

}
