package com.airshiplay.official.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.airshiplay.official.service.QuestionaireService;
import com.airshiplay.official.service.model.ServiceTopic;
import com.airshiplay.official.web.model.DataTable;

@Controller
@RequestMapping("/quest")
public class QuestionaireController {
	@Autowired
	QuestionaireService questionaireService;

	@RequestMapping("/topic/list")
	public @ResponseBody DataTable<ServiceTopic> getTopicList(Model model,
			@RequestParam int start, @RequestParam int length,
			@RequestParam int draw) {
		return new DataTable<ServiceTopic>(questionaireService.getTopicDetail(
				start, length, null), draw + 1);
	}
}
