package com.airshiplay.official.mybatis.mapper.custom;

import org.apache.ibatis.annotations.Param;

import com.airshiplay.official.mybatis.model.OfUser;

public interface CustomOfUserQqMapper {
	public OfUser getUser(@Param("openid")String openid);
}