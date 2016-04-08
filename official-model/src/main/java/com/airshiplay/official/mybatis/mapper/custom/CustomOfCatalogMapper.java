package com.airshiplay.official.mybatis.mapper.custom;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.airshiplay.official.mybatis.model.OfCatalog;

public interface CustomOfCatalogMapper {
	public List<Map<String, Object>> getCatalogs();

	/**
	 * 
	 * @param cataid
	 * @param status
	 *            null 所有；不为null，按照条件查询
	 * @return
	 */
	public List<OfCatalog> getCatalogTree(
			@Param("cataid") long cataid, @Param("status") Long status);
}
