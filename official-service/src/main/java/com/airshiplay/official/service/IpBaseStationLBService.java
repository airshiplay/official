package com.airshiplay.official.service;

import com.airshiplay.official.mybatis.model.IpBsLb;
import com.google.protobuf.ServiceException;

public interface IpBaseStationLBService {

	void addObject(IpBsLb base) throws ServiceException;

	IpBsLb getObjectByIp(String ip) throws ServiceException;

}
