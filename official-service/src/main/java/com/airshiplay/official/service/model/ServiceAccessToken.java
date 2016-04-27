package com.airshiplay.official.service.model;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.OfAccessToken;

public class ServiceAccessToken extends OfAccessToken {

	public ServiceAccessToken(OfAccessToken OfAccessToken) {
		BeanUtils.copyProperties(OfAccessToken, this);
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
}
