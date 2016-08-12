package com.airshiplay.official.service.model;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.QuOption;
import com.airshiplay.official.mybatis.model.QuSubject;

public class ServiceSubject extends QuSubject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<QuOption> optins;

	public ServiceSubject() {
	}

	public ServiceSubject(QuSubject sub) {
		BeanUtils.copyProperties(sub, this);
	}

	public List<QuOption> getOptins() {
		return optins;
	}

	public ServiceSubject setOptins(List<QuOption> optins) {
		this.optins = optins;
		return this;
	}
}
