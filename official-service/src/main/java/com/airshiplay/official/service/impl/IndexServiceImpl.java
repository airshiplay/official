package com.airshiplay.official.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.OfBannerMapper;
import com.airshiplay.official.mybatis.mapper.OfCatalogMapper;
import com.airshiplay.official.mybatis.mapper.custom.CustomOfCatalogMapper;
import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.mybatis.model.OfBannerExample;
import com.airshiplay.official.mybatis.model.OfCatalog;
import com.airshiplay.official.mybatis.model.OfCatalogExample;
import com.airshiplay.official.service.IndexService;
import com.airshiplay.official.service.model.Navbar;

@Service("indexService")
public class IndexServiceImpl implements IndexService {

	@Autowired
	OfCatalogMapper catalogMapper;
	@Autowired
	CustomOfCatalogMapper customOfCatalogMapper;
	@Autowired
	OfBannerMapper ofBannerMapper;

	@Override
	public List<String> getTitles() {
		List<OfCatalog> l = catalogMapper
				.selectByExample(new OfCatalogExample());
		List<Map<String, Object>> cat = customOfCatalogMapper.getCatalogs();
		return Arrays.asList(new String[] { "aaa", "bbb" });
	}

	@Override
	public List<Navbar> getCatalogs() {
		List<OfCatalog> list = customOfCatalogMapper.getCatalogTree(0, 2l);
		List<Navbar> result = new ArrayList<Navbar>();
		for (int i = 0; i < list.size(); i++) {
			OfCatalog catalog = list.get(i);
			if (catalog.getLevel() == 1) {
				Navbar bar = new Navbar(catalog);
				result.add(bar);
			} else if (catalog.getLevel() == 2) {
				Navbar upbar = result.get(result.size() - 1);
				upbar.addSubNavbar(new Navbar(catalog));
			} else if (catalog.getLevel() == 3) {
				Navbar upbar = result.get(result.size() - 1);
				Navbar uppbar = upbar.getSubNavbar().get(
						upbar.getSubNavbar().size() - 1);
				uppbar.addSubNavbar(new Navbar(catalog));
			}
		}
		return result;
	}

	@Override
	public List<OfBanner> getBanners() {
		OfBannerExample example = new OfBannerExample();
		example.createCriteria().andStatusEqualTo(2);
		example.setOrderByClause("seq");
		List<OfBanner> list = ofBannerMapper.selectByExample(example);
		return list;
	}

}
