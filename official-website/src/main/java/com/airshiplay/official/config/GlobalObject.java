package com.airshiplay.official.config;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import rx.functions.Action1;

import com.airshiplay.official.mybatis.model.CfgWebSite;
import com.airshiplay.official.service.WebSiteService;
import com.airshiplay.official.service.IndexService;
import com.airshiplay.official.service.model.Navbar;
import com.google.protobuf.ServiceException;

@Singleton
@Component("globalObject")
public class GlobalObject {
	Logger logger = LoggerFactory.getLogger(GlobalObject.class);
	private CfgWebSite website;
	private List<Navbar> navbar;
	@Autowired
	private IndexService indexService;
	@Autowired
	private WebSiteService companyService;
	private String baiduMapAk = "7ctacWeSWz1W7UCy7rp1ACF9YAW7RTZK";
	private String siteStyle;

	public GlobalObject() {
	}

	@PostConstruct
	public void initData() {
		try {
			website = companyService.getWebSite();
			navbar = indexService.storedProcedureCatalogs();
		} catch (ServiceException e) {
			logger.error("GlobalObject", e);
		} catch (Exception e) {
			logger.error("GlobalObject", e);
		}
	}

	public CfgWebSite getWebSite() {
		return website;
	}

	public void setWebSite(CfgWebSite company) {
		this.website = company;
	}

	public List<Navbar> getNavbar() {
		return navbar;
	}

	public void setNavbar(List<Navbar> navbar) {
		this.navbar = navbar;
	}

	public String getBaiduMapAk() {
		return baiduMapAk;
	}

	public void setBaiduMapAk(String baiduMapAk) {
		this.baiduMapAk = baiduMapAk;
	}

	public String getSiteStyle() {
		return siteStyle;
	}

	public void setSiteStyle(String siteStyle) {
		this.siteStyle = siteStyle;
	}

	public Action1<CfgWebSite> actionCompany() {
		return new Action1<CfgWebSite>() {

			@Override
			public void call(CfgWebSite t) {
				website = t;
			}
		};
	}

	public Action1<String> actionSiteStyle() {
		return new Action1<String>() {

			@Override
			public void call(String t) {
				siteStyle = t;
			}
		};
	}
}
