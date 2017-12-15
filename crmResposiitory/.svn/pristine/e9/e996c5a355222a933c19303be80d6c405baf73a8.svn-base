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

import com.lxit.crm.dao.RatioDao;
import com.lxit.crm.entity.Chance;
import com.lxit.crm.entity.Contend;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.Ratio;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.OrganizationService;
import com.lxit.crm.service.RatioService;

@Controller
public class RatioController {
	@Resource
	RatioService ratioService;
	
	@Resource
	OrganizationService organizationService;
	
	@RequestMapping("/ratio")
	public void ratio(){}
	
	@ResponseBody
	@RequestMapping("/ratioPager")
	public Map<String,Object> ratioPager(HttpServletRequest request,@RequestParam(value = "page", required = false) Integer pageIndex,
			@RequestParam(value = "rows", required = false) Integer pageSize,
			@RequestParam(value = "ratio", required = false) String userName){
		User user = (User) request.getSession().getAttribute("user");
		Pager<Ratio> page = ratioService.getPager(pageIndex, pageSize, userName, user.getUserId());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", page.getSumCount());
		map.put("rows", page.getData());
		return map;
	}
	
	@RequestMapping("ratio_update_add")
	public String contend_update_add(HttpServletRequest request,Ratio ratio,Map<String,Object> map){
		User user = (User) request.getSession().getAttribute("user");
		if(ratio.getId()>0){
			ratio = ratioService.getRatio(ratio.getId());
			map.put("ratio", ratio);
		}
		List<User> lists = organizationService.organctionSelectAssign(user.getUserId());
		map.put("list", lists);
		return "handleRatio";
	}
	
	@ResponseBody
	@RequestMapping("/saveRatio")
	public boolean saveRatio(HttpServletRequest request,Ratio ratio){
		User user = (User) request.getSession().getAttribute("user");
		ratio.setLastUserName(user.getUserId()+"");
		return ratioService.insert(ratio)>0;
		
	}
	@ResponseBody
	@RequestMapping("/updateRatio")
	public boolean updateChance(HttpServletRequest request,Ratio ratio){
		User user = (User) request.getSession().getAttribute("user");
		ratio.setLastUserName(user.getUserId()+"");
		return ratioService.update(ratio)>0;
	}
	
	@ResponseBody
	@RequestMapping("/deleteRatio")
	public boolean updateChance(int id){
		return ratioService.delete(id)>0;
	}
	
	@RequestMapping("/ratioQuery")
	public String ratioQuery(HttpServletRequest request,Map<String,Object> map,@RequestParam("id")Integer id){
		User user = (User) request.getSession().getAttribute("user");
	    Ratio ratio = ratioService.getRatio(id);
		map.put("ratio", ratio);
		List<User> lists = organizationService.organctionSelectAssign(user.getUserId());
		map.put("list", lists);
		return "ratioQuery";
	}
}
