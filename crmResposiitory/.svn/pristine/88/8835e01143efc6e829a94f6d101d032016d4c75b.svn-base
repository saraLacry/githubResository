package com.lxit.crm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Analyze;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.AnalyzeService;

@Controller
public class AnalyzeConttroller {

	@Resource
	AnalyzeService analyzeService;

	@RequestMapping("/analyze")
	public void analyze() {
	}

	@ResponseBody
	@RequestMapping("/analyzePager")
	public Map<String, Object> analyzePager(HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer pageIndex,
			@RequestParam(value = "rows", required = false) Integer pageSize,
			@RequestParam(value = "analyze", required = false) String analyze) {
		User user = (User) request.getSession().getAttribute("user");
		Pager<Analyze> page = null;
		Map<String, Object> map = new HashMap<String, Object>();
		if (user.getRole().getRoleName().equals("销售总监")) {
			
			page = analyzeService.getPager(pageIndex, pageSize, analyze, 0);
		} else {
			page = analyzeService.getPager(pageIndex, pageSize, analyze, user.getDept().getDeptId());
		}
		map.put("total", page.getSumCount());

		map.put("rows", page.getData());

		return map;
	}
	
	@ResponseBody
	@RequestMapping("/queryAnalyze")
	public Map<String, Object> queryPager(HttpServletRequest request,
			@RequestParam(value = "page", required = false) Integer pageIndex,
			@RequestParam(value = "rows", required = false) Integer pageSize,
			@RequestParam(value = "analyze", required = false) String analyze,
			@RequestParam(value="deptId", required = false)	Integer deptId){
		Pager<Analyze> page = analyzeService.queryPager(pageIndex, pageSize, analyze, deptId);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", page.getSumCount());
		map.put("rows", page.getData());
		return map;
	}
	
	@RequestMapping("/analyzeQuery")
	public void analyzeQuery(Analyze analyze){
	}
}
