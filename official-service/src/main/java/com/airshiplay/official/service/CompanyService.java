package com.airshiplay.official.service;

import com.airshiplay.official.mybatis.model.CfgCompany;
import com.google.protobuf.ServiceException;

public interface CompanyService {
	public CfgCompany getCompany() throws ServiceException;

	public CfgCompany updateCompany(CfgCompany company);
}
