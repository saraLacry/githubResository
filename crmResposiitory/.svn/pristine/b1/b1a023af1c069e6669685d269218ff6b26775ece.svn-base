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

import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Linkman;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.DictionaryService;
import com.lxit.crm.service.LinkmanService;

@Controller
public class LinkmanController {

	@Resource
	private DictionaryService dictionaryService;
	
	@Resource
	private LinkmanService linkmanService;
	
	
	@ResponseBody
	@RequestMapping("linkmanPager")
	public Map<String,Object> linkmanPager(HttpServletRequest request ,@RequestParam(value="page",required=false) Integer pageIndex,@RequestParam(value="rows",required=false) Integer pageSize,@RequestParam(value="linkman",required=false) String linkman){
		Map<String,Object> map = new HashMap<String,Object>();
		
		User user = (User) request.getSession().getAttribute("user");
		
		Pager page = linkmanService.getPage(pageIndex, pageSize, linkman, user.getUserId());
		
		map.put("total", page.getSumCount());
		
		map.put("rows", page.getData());
		
		return map;
	}
	
	
	@RequestMapping("/linkman")
	public void linkmanPager(HttpServletRequest request,Linkman linkman,Map<String,Object> map){
		
	}
	
	@RequestMapping("/linkman_update_add")
	public String linkman(HttpServletRequest request,Linkman linkman,Map<String,Object> map){
		List<Dictionary> list = dictionaryService.getClientStates("sex");
		System.out.println(list);
		map.put("list", list);
		if(linkman.getId()>0){
			
			linkman = linkmanService.getLinkman(linkman.getId());
			map.put("linkman", linkman);
		}
		
		return "handleLinkman";
	}
	@ResponseBody
	@RequestMapping("/saveLinkman")
	public boolean saveLinkman(HttpServletRequest request,Linkman linkman){
		User user = (User) request.getSession().getAttribute("user");
		linkman.setUserId(user.getUserId());
		return linkmanService.save(linkman)>0;
		
	}
	@ResponseBody
	@RequestMapping("/updateLinkman")
	public boolean updateLinkman(Linkman linkman){
		return linkmanService.update(linkman)>0;
	}
	
	@ResponseBody
	@RequestMapping("/deleteLinkman")
	public boolean deleteLinkman(@RequestParam("id")Integer id){

		return linkmanService.delete(id)>0;
	}

	@RequestMapping("/linkmanQuery")
	public String linkmanQuery(HttpServletRequest request,Linkman linkman,Map<String,Object> map){
		List<Dictionary> list = dictionaryService.getClientStates("sex");
		map.put("list", list);
		linkman = linkmanService.getLinkman(linkman.getId());
		map.put("linkman", linkman);
		return "linkmanQuery";
	}
}
