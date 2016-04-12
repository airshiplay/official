package com.airshiplay.official.mybatis.mapper.custom;

import java.util.List;

import com.airshiplay.official.mybatis.model.CfgRole;

public interface CustomCfgRoleMapper {
	public List<CfgRole> getRolesByUid(Long uid);
}