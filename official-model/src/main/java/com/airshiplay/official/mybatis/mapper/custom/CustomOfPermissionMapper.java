package com.airshiplay.official.mybatis.mapper.custom;

import java.util.List;

import com.airshiplay.official.mybatis.model.OfPermission;

public interface CustomOfPermissionMapper {

	public List<OfPermission> getAuthoritiesByRoleId(Long roleId);

}