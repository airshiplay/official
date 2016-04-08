package com.airshiplay.official.service.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.OfCatalog;

public class Navbar extends OfCatalog {
	private List<Navbar> subNavbar;

	public Navbar(OfCatalog catalog) {
		BeanUtils.copyProperties(catalog, this);
	}

	public List<Navbar> getSubNavbar() {
		return subNavbar;
	}

	public void addSubNavbar(Navbar subNavbar) {
		if (this.subNavbar == null) {
			this.subNavbar = new ArrayList<Navbar>();
		}
		this.subNavbar.add(subNavbar);
	}
}
