package com.airshiplay.official.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.OfUserQqMapper;
import com.airshiplay.official.mybatis.mapper.custom.CustomOfUserQqMapper;
import com.airshiplay.official.mybatis.model.OfUser;
import com.airshiplay.official.service.ThirdAccountService;
import com.airshiplay.official.service.model.ServiceUser;

@Service("thirdAccountService")
public class ThirdAccountServiceImpl implements ThirdAccountService {
	@Autowired
	OfUserQqMapper ofUserQqMapper;

	@Autowired
	CustomOfUserQqMapper customOfUserQqMapper;

	@Override
	public ServiceUser getUserByQQOpenId(String openid) {
		OfUser user = customOfUserQqMapper.getUser(openid);
		return new ServiceUser(user);
	}

	@Override
	public ServiceUser getUserByWechatOpenId(String openid) {
		return null;
	}

}
