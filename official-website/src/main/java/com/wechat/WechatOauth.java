package com.wechat;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import com.wechat.config.WechatConfig;

public class WechatOauth {

	public String getAuthorizeURL() {
		return "https://open.weixin.qq.com/connect/qrconnect?appid=wxbdc5610cc59c1631&redirect_uri=https%3A%2F%2Fpassport.yhd.com%2Fwechat%2Fcallback.do&response_type=code&scope=snsapi_login&state=3d6be0a4035d839573b04816624a415e#wechat_redirect";
	}

	public String getAuthorizeURL(HttpServletRequest request) {

		WechatConfig.getValue("");

		// https://open.weixin.qq.com/connect/qrconnect?
		// appid=APPID&
		// redirect_uri=REDIRECT_URI&
		// response_type=code&
		// scope=SCOPE&
		// state=STATE#wechat_redirect
		String scope = "snsapi_login";
		String state = "1111";
		return WechatConfig.getValue("authorizeURL").trim() + "?appid="
				+ WechatConfig.getValue("app_ID").trim() + "&redirect_uri="
				+URLEncoder.encode( WechatConfig.getValue("redirect_URI").trim())
				+ "&response_type=" + "code" + "&scope=" + scope + "&state="
				+ state + "#wechat_redirect";
	}
}
