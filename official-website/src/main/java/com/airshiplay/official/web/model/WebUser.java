package com.airshiplay.official.web.model;

import com.airshiplay.official.mybatis.model.CfgUser;
import com.airshiplay.official.service.model.ServiceUser;

public class WebUser extends ServiceUser {
	private String redirectUrl;

	public WebUser() {
	}

	public WebUser(ServiceUser user) {
		super(user);
	}

	public WebUser(CfgUser user) {
		super(user);
	}

	public String getRedirectUrl() {
		return redirectUrl;
	}

	public WebUser setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
		return this;
	}

}
