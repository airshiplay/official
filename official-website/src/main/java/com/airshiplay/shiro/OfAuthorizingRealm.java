package com.airshiplay.shiro;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAccount;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.SimpleByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.airshiplay.official.mybatis.model.OfUser;
import com.airshiplay.official.service.UserService;

public class OfAuthorizingRealm extends AuthorizingRealm {
	@Autowired
	UserService userService;

	/**
	 * 权限认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principal) {
		SimplePrincipalCollection per= (SimplePrincipalCollection)(principal);
		
		principal.getRealmNames();
		SecurityUtils.getSubject().getPrincipal();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRole("admin");
		info.addStringPermission("/admin");
		return info;
	}

	/**
	 * 登录认证;
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		token.getCredentials();
		token.getPrincipal();
		if (token instanceof UsernamePasswordToken) {
			UsernamePasswordToken utoken = (UsernamePasswordToken) token;
			utoken.getUsername();
			OfUser user = userService.findUserByUsername(utoken.getUsername());
			SimpleAccount account = new SimpleAccount(user.getUsername(),
					user.getPassword(), new SimpleByteSource(user.getSalt()),
					getName());
			Set<String> roles = new HashSet<String>();
			roles.add("");
			account.setRoles(roles);
			Set<String> permissions = new HashSet<String>();
			permissions.add("");
			account.setStringPermissions(permissions);
			return account;
		}
		return null;
	}

	@Override
	public CredentialsMatcher getCredentialsMatcher() {
		return super.getCredentialsMatcher();
	}
}
