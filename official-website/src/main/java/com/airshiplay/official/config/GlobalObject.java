package com.airshiplay.official.config;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.airshiplay.official.mybatis.model.CfgCompany;
import com.airshiplay.official.service.CompanyService;
import com.airshiplay.official.service.IndexService;
import com.airshiplay.official.service.model.Navbar;
import com.google.protobuf.ServiceException;

@Singleton
@Component("globalObject")
public class GlobalObject {
	Logger logger = LoggerFactory.getLogger(GlobalObject.class);
	private CfgCompany company;
	private List<Navbar> navbar;
	@Autowired
	private IndexService indexService;
	@Autowired
	private CompanyService companyService;

	
	public GlobalObject() {
	}

	@PostConstruct
	public void initData() {
		try {
			company = companyService.getCompany();
			navbar = indexService.getCatalogs();
		} catch (ServiceException e) {
			logger.error("GlobalObject", e);
		}catch (Exception e) {
			logger.error("GlobalObject", e);
		}
	}

	public CfgCompany getCompany() {
		return company;
	}

	public void setCompany(CfgCompany company) {
		this.company = company;
	}

	public List<Navbar> getNavbar() {
		return navbar;
	}

	public void setNavbar(List<Navbar> navbar) {
		this.navbar = navbar;
	}
}
