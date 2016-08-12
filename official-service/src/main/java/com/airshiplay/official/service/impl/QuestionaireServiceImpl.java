package com.airshiplay.official.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airshiplay.common.util.ServiceException;
import com.airshiplay.official.mybatis.mapper.QuOptionMapper;
import com.airshiplay.official.mybatis.mapper.QuSubjectAnswerMapper;
import com.airshiplay.official.mybatis.mapper.QuSubjectMapper;
import com.airshiplay.official.mybatis.mapper.QuTopicAnswerMapper;
import com.airshiplay.official.mybatis.mapper.QuTopicMapper;
import com.airshiplay.official.mybatis.model.QuOption;
import com.airshiplay.official.mybatis.model.QuOptionExample;
import com.airshiplay.official.mybatis.model.QuSubject;
import com.airshiplay.official.mybatis.model.QuSubjectAnswer;
import com.airshiplay.official.mybatis.model.QuSubjectExample;
import com.airshiplay.official.mybatis.model.QuTopic;
import com.airshiplay.official.mybatis.model.QuTopicAnswer;
import com.airshiplay.official.mybatis.model.QuTopicExample;
import com.airshiplay.official.service.QuestionaireService;
import com.airshiplay.official.service.model.ServiceSubject;
import com.airshiplay.official.service.model.ServiceTopic;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("questionaireService")
public class QuestionaireServiceImpl implements QuestionaireService {
	@Autowired
	QuTopicMapper topicMapper;
	@Autowired
	QuSubjectMapper subjectMapper;
	@Autowired
	QuTopicAnswerMapper topicAnswerMapper;
	@Autowired
	QuOptionMapper optionMapper;
	@Autowired
	QuSubjectAnswerMapper subjectAnswerMapper;

	@Override
	public PageInfo<QuTopic> getTopic(int pageNum, int pageSize, Integer status) {
		PageHelper.startPage(pageNum, pageSize);
		QuTopicExample example = new QuTopicExample();
		if (status != null) {
			example.createCriteria().andStatusEqualTo(status);
		}
		example.setOrderByClause("create_time desc");
		List<QuTopic> result = topicMapper.selectByExample(example);
		return new PageInfo<QuTopic>(result);
	}

	@Override
	public PageInfo<ServiceTopic> getTopicDetail(int pageNum, int pageSize,
			Integer status) {
		PageHelper.startPage(pageNum, pageSize);
		QuTopicExample example = new QuTopicExample();
		if (status != null) {
			example.createCriteria().andStatusEqualTo(status);
		}
		example.setOrderByClause("create_time desc");
		List<QuTopic> result = topicMapper.selectByExample(example);
		Page<ServiceTopic> page = new Page<ServiceTopic>(pageNum, pageSize);
		page.setTotal(((Page<QuTopic>) result).getTotal());
		for (QuTopic topic : result) {
			QuSubjectExample subjectExample = new QuSubjectExample();
			subjectExample.createCriteria().andTopicIdEqualTo(topic.getId());
			List<QuSubject> re = subjectMapper.selectByExample(subjectExample);
			List<ServiceSubject> subjects = new ArrayList<ServiceSubject>();
			for (QuSubject sub : re) {
				QuOptionExample optionExample = new QuOptionExample();
				optionExample.createCriteria().andSubjectIdEqualTo(sub.getId());
				List<QuOption> optionResult = optionMapper
						.selectByExample(optionExample);
				subjects.add(new ServiceSubject(sub).setOptins(optionResult));
			}
			page.add(new ServiceTopic(topic).setSubjects(subjects));
		}
		return new PageInfo<ServiceTopic>(page);
	}

	@Override
	public QuTopic createTopic(ServiceTopic topic)
			throws ServiceException {
		topic.setCreateTime(new Date());
		topic.setId(null);
		topicMapper.insert(topic);

		for (ServiceSubject sub : topic.getSubjects()) {
			sub.setTopicId(topic.getId());
			sub.setId(null);
			subjectMapper.insert(sub);
			for (QuOption opt : sub.getOptins()) {
				opt.setId(null);
				opt.setSubjectId(sub.getId());
				optionMapper.insert(opt);
			}
		}
		return topic;
	}

	@Override
	public QuTopicAnswer submitTopic(Long uid, Long topicId,
			List<QuSubjectAnswer> answer) throws ServiceException {
		return null;
	}

}
