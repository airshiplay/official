package com.airshiplay.official.mybatis.mapper.custom;

import java.util.List;

import com.airshiplay.official.mybatis.model.OfAuthority;

public interface CustomOfAuthorityMapper {

	public List<OfAuthority> getAuthoritiesByRoleId(Long roleId);

}