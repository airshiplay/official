package com.airshiplay.shiro;

import org.apache.shiro.authc.UsernamePasswordToken;

public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String captcha;

	// 省略 getter 和 setter 方法

	public CaptchaUsernamePasswordToken(String username,String password,
			boolean rememberMe, String host, String captcha) {
		super(username, password, rememberMe, host);
		this.setCaptcha(captcha);
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}
