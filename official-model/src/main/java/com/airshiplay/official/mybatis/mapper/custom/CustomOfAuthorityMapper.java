package com.airshiplay.official.mybatis.mapper.custom;

import java.util.List;

import com.airshiplay.official.mybatis.model.OfPermission;

public interface CustomOfAuthorityMapper {

	public List<OfPermission> getAuthoritiesByRoleId(Long roleId);

}