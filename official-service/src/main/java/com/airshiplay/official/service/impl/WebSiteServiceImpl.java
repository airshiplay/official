package com.airshiplay.official.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.CfgWebSiteMapper;
import com.airshiplay.official.mybatis.model.CfgWebSite;
import com.airshiplay.official.mybatis.model.CfgWebSiteExample;
import com.airshiplay.official.service.WebSiteService;
import com.google.protobuf.ServiceException;

@Service("webSiteService")
public class WebSiteServiceImpl implements WebSiteService {
	@Autowired
	CfgWebSiteMapper companyMapper;

	@Override
	public CfgWebSite getWebSite() throws ServiceException {
		List<CfgWebSite> list = companyMapper
				.selectByExample(new CfgWebSiteExample());
		if (list.isEmpty())
			throw new ServiceException("company is empty, not setting");
		if (list.size() > 1)
			throw new ServiceException("company more than one ,data error!");
		return list.get(0);
	}

	@Override
	public CfgWebSite updateWebSite(CfgWebSite company) {
		companyMapper.updateByPrimaryKeySelective(company);
		company=companyMapper.selectByPrimaryKey(company.getId());
		return company;
	}

}
