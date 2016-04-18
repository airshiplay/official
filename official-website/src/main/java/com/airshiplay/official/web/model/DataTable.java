package com.airshiplay.official.web.model;

import java.util.List;

import com.github.pagehelper.PageInfo;

public class DataTable<T> {
	private int draw;
	private long recordsTotal;
	private long recordsFiltered;
	private List<T> data;

	public DataTable(PageInfo<T> pageInfo,int draw) {
		this.data = pageInfo.getList();
		this.recordsTotal = pageInfo.getSize();
		this.recordsFiltered = pageInfo.getTotal();
		this.draw = draw;
	}
	public DataTable(List<T> all) {
		this.data = all;
		this.recordsTotal = all.size();
		this.recordsFiltered = 1;
		this.draw = 1;
	}
	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public long getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(long recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public long getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(long recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
}
