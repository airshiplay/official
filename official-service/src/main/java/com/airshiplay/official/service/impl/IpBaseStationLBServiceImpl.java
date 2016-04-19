package com.airshiplay.official.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.official.mybatis.mapper.OfIpBsLbMapper;
import com.airshiplay.official.mybatis.model.OfIpBsLb;
import com.airshiplay.official.mybatis.model.OfIpBsLbExample;
import com.airshiplay.official.service.IpBaseStationLBService;
import com.google.protobuf.ServiceException;

@Service("ipBaseStationLBService")
public class IpBaseStationLBServiceImpl implements IpBaseStationLBService {
	@Autowired
	OfIpBsLbMapper ofIpBsLbMapper;

	@Override
	public void addObject(OfIpBsLb base) throws ServiceException {
		base.setCreateTime(new Date());
		ofIpBsLbMapper.insert(base);
	}

	@Override
	public OfIpBsLb getObjectByIp(String ip) throws ServiceException {
		OfIpBsLbExample example = new OfIpBsLbExample();
		example.createCriteria().andIpEqualTo(ip);
		List<OfIpBsLb> list = ofIpBsLbMapper.selectByExample(example);
		return list.isEmpty() ? null : list.get(0);
	}

}
