package com.airshiplay.official.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airshiplay.common.util.IpUtil;
import com.airshiplay.official.mybatis.model.OfIpBsLb;
import com.airshiplay.official.service.IpBaseStationLBService;
import com.airshiplay.official.web.model.ResultMessage;
import com.google.protobuf.ServiceException;

@Controller
@RequestMapping("/ip")
public class IpBaseStationLBController {
	@Autowired
	IpBaseStationLBService ipBaseStationLBService;

	@RequestMapping("/real")
	public ResultMessage<String> getRealIp(HttpServletRequest request,
			HttpServletResponse response) {
		String ip = IpUtil.getIpAddr(request);
		return new ResultMessage<String>(ip);
	}

	@RequestMapping("/add")
	public ResultMessage<Object> addRealIp(@RequestBody OfIpBsLb base) {
		try {

			if (base.getIp() != null) {
				ipBaseStationLBService.addObject(base);
			}

		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return  ResultMessage.success("");
	}
}
