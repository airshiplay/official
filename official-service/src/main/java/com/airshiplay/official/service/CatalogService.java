package com.airshiplay.official.service;

import java.util.List;

import com.airshiplay.official.mybatis.model.OfCatalogDetail;

public interface CatalogService {
	OfCatalogDetail getDetail(Long catalogId);

	List<OfCatalogDetail> getDetailList(Long catalogId);
}
