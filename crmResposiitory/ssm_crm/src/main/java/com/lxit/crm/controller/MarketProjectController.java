package com.lxit.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 销售管理页面进入控制层
 * 
 * @author Administrator
 *
 */
@Controller
public class MarketProjectController {

	/**
	 * 进入销售计划页面
	 * 
	 * @return
	 */
	@RequestMapping("/marketProject")
	public String marketProject() {
		return "marketProject";
	}
}