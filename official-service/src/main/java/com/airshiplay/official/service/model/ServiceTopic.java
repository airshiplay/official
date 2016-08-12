package com.airshiplay.official.service.model;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.airshiplay.official.mybatis.model.QuTopic;

public class ServiceTopic extends QuTopic {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ServiceSubject> subjects;

	public ServiceTopic() {
	}

	public ServiceTopic(QuTopic topic) {
		BeanUtils.copyProperties(topic, this);
	}

	public List<ServiceSubject> getSubjects() {
		return subjects;
	}

	public ServiceTopic setSubjects(List<ServiceSubject> subjects) {
		this.subjects = subjects;
		return this;
	}
}
