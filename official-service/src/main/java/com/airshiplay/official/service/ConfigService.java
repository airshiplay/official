package com.airshiplay.official.service;

import com.airshiplay.official.mybatis.model.CfgPage;
import com.github.pagehelper.PageInfo;

public interface ConfigService {
	public PageInfo<CfgPage> getConfigWebPage(int pageNum, int pageSize);

}
