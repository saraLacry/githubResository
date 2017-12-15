package com.lxit.crm.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.Plan;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.SellService;

@Controller
public class SellController {
	@Autowired
	private SellService sellService;
	
	
	
	public SellService getSellService() {
		return sellService;
	}

	public void setSellService(SellService sellService) {
		this.sellService = sellService;
	}

	@RequestMapping("/sellPlan")
	public String sellPlan(){
		return "sellPlan";
	}

	@ResponseBody
	@RequestMapping("/sellQuery")
	public Map<String,Object> sellQuery(HttpServletRequest request ,@RequestParam(value="page",required=false) Integer pageIndex,@RequestParam(value="rows",required=false) Integer pageSize,@RequestParam(value="query",required=false) String query){
		User user = (User) request.getSession().getAttribute("user");
		Map<String,Object> map = new HashMap<>();
		pageIndex = pageIndex==null?1:pageIndex;
		pageSize = pageSize==null?10:pageSize;
		query = query==null?query:query.substring(0, 7);
		Pager<Plan> page = sellService.getPage(pageIndex, pageSize, query,user);		
		map.put("total",page.getSumCount());
		map.put("rows",page.getData());
		return map;
	}
	
	@RequestMapping("/addPlan")
	public String addSellPlan(){
		return "addPlan";
	}
	
	@ResponseBody
	@RequestMapping("/savePlan")
	public boolean savePlan(Plan plan){
		int count = sellService.save(plan);
		return count>0;
	}
	
	@ResponseBody
	@RequestMapping("/deletePlan")
	public boolean deletePlan(@RequestParam("id") int id){
		return sellService.delete(id)>0;
	}
	
	@RequestMapping("/updatePlan")
	public void updatePlan(Plan plan) throws UnsupportedEncodingException{
		
		plan.setPlanText(new String(plan.getPlanText().getBytes("ISO-8859-1"),"utf-8"));
		plan.getCreateUser().setUserName(new String(plan.getCreateUser().getUserName().getBytes("ISO-8859-1"),"utf-8"));
		plan.setState(new String(plan.getState().getBytes("ISO-8859-1"),"utf-8"));
	}
	@ResponseBody
	@RequestMapping("/planUpdate")
	public boolean planUpdate(Plan plan){
		System.out.println(plan);
		int count = sellService.update(plan);
		return count>0;
	}
	
	@ResponseBody
	@RequestMapping("/submitPlan")
	public boolean submitPlan(Plan plan){
		System.out.println(plan);
		int count = sellService.update(plan);
		return count>0;
	}
	
	@RequestMapping("/queryPlan")
	public void queryPlan(Plan plan) throws UnsupportedEncodingException{
		plan.setPlanText(new String(plan.getPlanText().getBytes("ISO-8859-1"),"utf-8"));
		plan.getCreateUser().setUserName(new String(plan.getCreateUser().getUserName().getBytes("ISO-8859-1"),"utf-8"));
		plan.setState(new String(plan.getState().getBytes("ISO-8859-1"),"utf-8"));
	}
}
