package com.airshiplay.official.mybatis.mapper.custom;

import java.util.List;

import com.airshiplay.official.mybatis.model.OfRole;

public interface CustomOfRoleMapper {
	public List<OfRole> getRolesByUid(Long uid);
}