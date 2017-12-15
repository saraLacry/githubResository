package com.lxit.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Chance;
import com.lxit.crm.entity.Contend;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Linkman;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.ChanceService;
import com.lxit.crm.service.DictionaryService;
import com.lxit.crm.service.OrganizationService;

@Controller
public class ChanceController {
	@Resource
	ChanceService chanceService;
	
	@Resource
	DictionaryService dictionaryService;
	
	@Resource
	OrganizationService organizationService;
	
	@RequestMapping("/chance")
	public String sellPlan(){
		return "chance";
	}
	
	@RequestMapping("/chance_update_add")
	public String chance(HttpServletRequest request,Chance chance,Map<String,Object> map){
		List<Dictionary> list = dictionaryService.getClientStates("CHANCE_TYPE");
		map.put("list", list);
		if(chance.getId()>0){
			chance = chanceService.getChance(chance.getId());
			map.put("chance", chance);
		}
		
		return "handleChance";
	}
	
	@ResponseBody
	@RequestMapping("/chancePager")
	public Map<String,Object> chancePager(HttpServletRequest request ,@RequestParam(value="page",required=false) Integer pageIndex,@RequestParam(value="rows",required=false) Integer pageSize,@RequestParam(value="chance",required=false) String chance){
		Map<String,Object> map = new HashMap<String,Object>();
		
		User user = (User) request.getSession().getAttribute("user");
		
		Pager page = null; 

		if(user.getRole().getRoleName()=="销售代表"){
			page = chanceService.getPage(pageIndex, pageSize, chance, user.getUserId(),0);
		}else{
			page = chanceService.getPage(pageIndex, pageSize, chance, 0,user.getDept().getDeptId());
		}
		
		
		map.put("total", page.getSumCount());
		
		map.put("rows", page.getData());
		
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/saveChance")
	public boolean saveChance(Chance chance){
		return chanceService.insertChance(chance)>0;
		
	}
	@ResponseBody
	@RequestMapping("/updateChance")
	public boolean updateChance(Chance chance){
		System.out.println(chance);
		return chanceService.updateChance(chance)>0;
	}
	
	@RequestMapping("/chanceQuery")
	public String linkman(Chance chance,Map<String,Object> map){
		List<Dictionary> list = dictionaryService.getClientStates("CHANCE_TYPE");
		map.put("list", list);
		chance = chanceService.getChance(chance.getId());
		map.put("chance", chance);	
		return "chanceQuery";
	}
	
	@RequestMapping("/chanceAllot")
	public String chanceAllot(HttpServletRequest request,Chance chance,Map<String,Object> map){
		User user = (User) request.getSession().getAttribute("user");
		List<User> lists = organizationService.organctionSelectAssign(user.getUserId());
		chance = chanceService.getChance(chance.getId());
		List<Dictionary> list = dictionaryService.getClientStates("CHANCE_TYPE");
		map.put("list", list);
		map.put("chance", chance);	
		map.put("lists", lists);
		return "chanceAllot";
	}
	
}
