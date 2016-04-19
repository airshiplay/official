package com.airshiplay.official.service;

import com.airshiplay.official.mybatis.model.OfIpBsLb;
import com.google.protobuf.ServiceException;

public interface IpBaseStationLBService {

	void addObject(OfIpBsLb base) throws ServiceException;

	OfIpBsLb getObjectByIp(String ip) throws ServiceException;

}
