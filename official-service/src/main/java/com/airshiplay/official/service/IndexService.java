package com.airshiplay.official.service;

import java.util.List;

import com.airshiplay.official.service.model.Navbar;

public interface IndexService {
	public List<String> getTitles();

	public List<Navbar> getCatalogs();
}
