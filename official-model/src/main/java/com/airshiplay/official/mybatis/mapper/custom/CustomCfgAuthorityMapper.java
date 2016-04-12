package com.airshiplay.official.mybatis.mapper.custom;

import java.util.List;

import com.airshiplay.official.mybatis.model.CfgAuthority;

public interface CustomCfgAuthorityMapper {

	public List<CfgAuthority> getAuthoritiesByRoleId(Long roleId);

}