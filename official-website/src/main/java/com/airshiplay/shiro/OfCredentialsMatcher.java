package com.airshiplay.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;

public class OfCredentialsMatcher implements CredentialsMatcher {

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token,
			AuthenticationInfo info) {
		Object tokenCredentials = getCredentials(token);
		Object accountCredentials = getCredentials(info);
		return true;
	}

	private Object getCredentials(AuthenticationInfo info) {
		return info.getCredentials();
	}

	private Object getCredentials(AuthenticationToken token) {
		return token.getCredentials();
	}

}
