package com.airshiplay.official.service;

import com.airshiplay.official.mybatis.model.CfgWebSite;
import com.google.protobuf.ServiceException;

public interface WebSiteService {
	public CfgWebSite getWebSite() throws ServiceException;

	public CfgWebSite updateWebSite(CfgWebSite company);
}
