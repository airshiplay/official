package com.airshiplay.official.service;

import java.util.List;

import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.mybatis.model.OfCatalog;
import com.github.pagehelper.PageInfo;

public interface SiteService {
	public List<OfCatalog> getCatalogs();
	
	public PageInfo<OfBanner> getBanners(int pageNum, int pageSize);
}
