package com.airshiplay.official.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.IpBsLbMapper;
import com.airshiplay.official.mybatis.model.IpBsLb;
import com.airshiplay.official.mybatis.model.IpBsLbExample;
import com.airshiplay.official.service.IpBaseStationLBService;
import com.google.protobuf.ServiceException;

@Service("ipBaseStationLBService")
public class IpBaseStationLBServiceImpl implements IpBaseStationLBService {
	@Autowired
	IpBsLbMapper ipBsLbMapper;

	@Override
	public void addObject(IpBsLb base) throws ServiceException {
		base.setCreateTime(new Date());
		ipBsLbMapper.insert(base);
	}

	@Override
	public IpBsLb getObjectByIp(String ip) throws ServiceException {
		IpBsLbExample example = new IpBsLbExample();
		example.createCriteria().andIpEqualTo(ip);
		List<IpBsLb> list = ipBsLbMapper.selectByExample(example);
		return list.isEmpty() ? null : list.get(0);
	}

}
