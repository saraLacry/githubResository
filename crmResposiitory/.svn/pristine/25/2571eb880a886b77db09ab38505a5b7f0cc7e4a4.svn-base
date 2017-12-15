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

import com.lxit.crm.entity.Contend;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.ContendService;
import com.lxit.crm.service.DictionaryService;

@Controller
public class ContendController {

	@Resource
	ContendService contendService;
	
	@Resource
	DictionaryService dictionaryService;
	
	@RequestMapping("/contend")
	public void contend(){
	}
	
	@ResponseBody
	@RequestMapping("/contendPager")
	public Map<String,Object> contendPager(@RequestParam(value = "page", required = false) Integer pageIndex,
			@RequestParam(value = "rows", required = false) Integer pageSize,
			@RequestParam(value = "contend", required = false) String date){
		Pager<Contend> page = contendService.getPager(pageIndex, pageSize, date);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", page.getData());
		map.put("total", page.getSumCount());
		return map;
	}
	
	@RequestMapping("/contend_update_add")
	public String contend_update_add(Contend contend,Map<String,Object> map){
		if(contend.getId()>0){
			contend = contendService.getContend(contend.getId());
			map.put("contend", contend);
		}
		List<Dictionary> list = dictionaryService.getClientStates("CONTEND_TYPE");
		map.put("list", list);
		return "handleContend";
	}
	@ResponseBody
	@RequestMapping("updatecontend")
	public boolean updateContend(Contend contend){
		return contendService.update(contend)>0;
	}
	@ResponseBody
	@RequestMapping("savecontend")
	public boolean saveContend(HttpServletRequest request,Contend contend){
		User user =  (User) request.getSession().getAttribute("user");
		contend.setUserName(user.getUserId()+"");
		return contendService.insert(contend)>0;
	}
	
	@RequestMapping("/contendQuery")
	public String contendQuery(Contend contend,Map<String,Object> map){
		contend = contendService.getContend(contend.getId());
		map.put("contend", contend);
		List<Dictionary> list = dictionaryService.getClientStates("CONTEND_TYPE");
		map.put("list", list);
		return"contendQuery";
	}
}
