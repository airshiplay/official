package com.airshiplay.official.service;

import java.util.List;

import com.airshiplay.official.mybatis.model.CfgTags;
import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.mybatis.model.OfCatalog;
import com.github.pagehelper.PageInfo;
import com.google.protobuf.ServiceException;

public interface SiteService {
	public List<OfCatalog> getCatalogs();

	public PageInfo<OfBanner> getBanners(int pageNum, int pageSize);

	public PageInfo<CfgTags> getTags(int start, int length);

	public CfgTags getTag(Long id);

	public CfgTags mergeTag(CfgTags tag);
	public void delTag(Long id) throws ServiceException;
}
