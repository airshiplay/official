package com.airshiplay.official.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.CfgCompanyMapper;
import com.airshiplay.official.mybatis.model.CfgCompany;
import com.airshiplay.official.mybatis.model.CfgCompanyExample;
import com.airshiplay.official.service.CompanyService;
import com.google.protobuf.ServiceException;

@Service("cmpanyService")
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	CfgCompanyMapper companyMapper;

	@Override
	public CfgCompany getCompany() throws ServiceException {
		List<CfgCompany> list = companyMapper
				.selectByExample(new CfgCompanyExample());
		if (list.isEmpty())
			throw new ServiceException("company is empty, not setting");
		if (list.size() > 1)
			throw new ServiceException("company more than one ,data error!");
		return list.get(0);
	}

	@Override
	public CfgCompany updateCompany(CfgCompany company) {
		companyMapper.updateByPrimaryKeySelective(company);
		company=companyMapper.selectByPrimaryKey(company.getId());
		return company;
	}

}
