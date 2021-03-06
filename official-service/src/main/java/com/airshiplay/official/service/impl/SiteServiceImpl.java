package com.airshiplay.official.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.CfgTagsMapper;
import com.airshiplay.official.mybatis.mapper.OfBannerMapper;
import com.airshiplay.official.mybatis.mapper.OfCatalogMapper;
import com.airshiplay.official.mybatis.mapper.custom.CustomOfCatalogMapper;
import com.airshiplay.official.mybatis.model.CfgTags;
import com.airshiplay.official.mybatis.model.CfgTagsExample;
import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.mybatis.model.OfBannerExample;
import com.airshiplay.official.mybatis.model.OfCatalog;
import com.airshiplay.official.service.SiteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.protobuf.ServiceException;

@Service("siteService")
public class SiteServiceImpl implements SiteService {

	@Autowired
	OfCatalogMapper catalogMapper;
	@Autowired
	CustomOfCatalogMapper customOfCatalogMapper;
	@Autowired
	OfBannerMapper cfgBannerMapper;
	@Autowired
	CfgTagsMapper  cfgTagsMapper;
	public List<OfCatalog> storedProcedureCatalogs() {
		List<OfCatalog> list = customOfCatalogMapper.getCatalogTree(0, null);
		return list;
	}

	@Override
	public PageInfo<OfBanner> getBanners(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<OfBanner> list = cfgBannerMapper
				.selectByExample(new OfBannerExample());
		return new PageInfo<OfBanner>(list);
	}

	@Override
	public PageInfo<CfgTags> getTags(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<CfgTags> list = cfgTagsMapper
				.selectByExample(new CfgTagsExample());
		return new PageInfo<CfgTags>(list);
	}

	@Override
	public CfgTags getTag(Long id) {
		return cfgTagsMapper.selectByPrimaryKey(id);
	}

	@Override
	public CfgTags mergeTag(CfgTags tag) {
		if(tag.getId()!=null){
			cfgTagsMapper.updateByPrimaryKey(tag);
		}else{
			cfgTagsMapper.insert(tag);
		}
		return tag;
	}

	@Override
	public void delTag(Long id) throws ServiceException {
		cfgTagsMapper.deleteByPrimaryKey(id);
	}
}
