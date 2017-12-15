package com.lxit.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatisticsController {
	/**
	 * 进入客户构成统计页面
	 * 
	 * @return
	 */
	@RequestMapping("/StatisticsClienteleForm")
	public String StatisticsClienteleForm() {
		return "StatisticsClienteleForm";
	}

	/**
	 * 进入客户流失统计页面
	 * 
	 * @return
	 */
	@RequestMapping("/StatisticsAwayForm")
	public String StatisticsAwayForm() {
		return "StatisticsAwayForm";
	}

	/**
	 * 进入客户贡献统计页面
	 * 
	 * @return
	 */
	@RequestMapping("/StatisticsContributionorm")
	public String StatisticsContributionorm() {
		return "StatisticsContributionorm";
	}

	/**
	 * 进入客户服务统计页面
	 * 
	 * @return
	 */
	@RequestMapping("/StatisticsServiceForm")
	public String StatisticsServiceForm() {
		return "StatisticsServiceForm";
	}
}
