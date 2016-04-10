package com.airshiplay.official.web.model;

import java.util.List;

import com.github.pagehelper.PageInfo;

public class DataTable<T> {
	private int draw;
	private long recordsTotal;
	private int recordsFiltered;
	private List<T> data;

	public DataTable(PageInfo<T> pageInfo) {
		this.data = pageInfo.getList();
		this.recordsTotal = pageInfo.getTotal();
		this.recordsFiltered = pageInfo.getPageNum();
		this.draw = 3;
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

	public int getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
}
