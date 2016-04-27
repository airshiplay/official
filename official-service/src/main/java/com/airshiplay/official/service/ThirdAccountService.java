package com.airshiplay.official.service;

import com.airshiplay.official.service.model.ServiceUser;

public interface ThirdAccountService {
	public ServiceUser getUserByQQOpenId(String openid);
	public ServiceUser getUserByWechatOpenId(String openid);
}
