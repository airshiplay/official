package com.airshiplay.official.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 加盟商
 * 
 * @author lig
 *
 */
@Controller
@RequestMapping("/business")
public class BusinessController extends BaseController {
	@RequestMapping("")
	public String index() {
		return "business";
	}
}
