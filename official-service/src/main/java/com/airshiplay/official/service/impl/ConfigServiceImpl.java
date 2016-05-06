package com.airshiplay.official.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.CfgPageMapper;
import com.airshiplay.official.mybatis.model.CfgPage;
import com.airshiplay.official.mybatis.model.CfgPageExample;
import com.airshiplay.official.service.ConfigService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {
	@Autowired
	CfgPageMapper cfgPageMapper;

	@Override
	public PageInfo<CfgPage> getConfigWebPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		CfgPageExample example = new CfgPageExample();
		List<CfgPage> result = cfgPageMapper.selectByExample(example);
		return new PageInfo<CfgPage>(result);
	}

}
