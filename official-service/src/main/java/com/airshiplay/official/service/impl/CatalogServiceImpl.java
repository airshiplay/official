package com.airshiplay.official.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.model.OfCatalogDetail;
import com.airshiplay.official.service.CatalogService;

@Service("catalogService")
public class CatalogServiceImpl implements CatalogService {

	@Override
	public OfCatalogDetail getDetail(Long catalogId) {
		return null;
	}

	@Override
	public List<OfCatalogDetail> getDetailList(Long catalogId) {
		return null;
	}

}
