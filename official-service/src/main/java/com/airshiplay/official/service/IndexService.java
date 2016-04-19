package com.airshiplay.official.service;

import java.util.List;

import com.airshiplay.official.mybatis.model.OfBanner;
import com.airshiplay.official.service.model.Navbar;
import com.google.common.base.Optional;

public interface IndexService {
	public List<String> getTitles();

	public List<Navbar> storedProcedureCatalogs();
	public Optional<List<OfBanner>> getBanners();
}
