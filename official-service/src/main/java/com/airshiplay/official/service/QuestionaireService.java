package com.airshiplay.official.service;

import java.util.List;

import com.airshiplay.common.util.ServiceException;
import com.airshiplay.official.mybatis.model.QuSubjectAnswer;
import com.airshiplay.official.mybatis.model.QuTopic;
import com.airshiplay.official.mybatis.model.QuTopicAnswer;
import com.airshiplay.official.service.model.ServiceTopic;
import com.github.pagehelper.PageInfo;

public interface QuestionaireService {
	public PageInfo<QuTopic> getTopic(int pageNum, int pageSize, Integer status);

	public PageInfo<ServiceTopic> getTopicDetail(int pageNum, int pageSize,
			Integer status);

	public QuTopic createTopic(ServiceTopic topic) throws ServiceException;

	public QuTopicAnswer submitTopic(Long uid, Long topicId,
			List<QuSubjectAnswer> answer) throws ServiceException;
}
