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
import com.lxit.crm.entity.Forecast;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.DictionaryService;
import com.lxit.crm.service.ForecastService;

@Controller
public class ForecastController {

	@Resource
	ForecastService forecastService;
	
	@Resource
	DictionaryService dictionaryService;
	
	@RequestMapping("/forecast")
	public void forecast(){}
	
	@ResponseBody
	@RequestMapping("/forecastPager")
	public Map<String,Object> contendPager(HttpServletRequest request ,@RequestParam(value = "page", required = false) Integer pageIndex,
			@RequestParam(value = "rows", required = false) Integer pageSize,
			@RequestParam(value = "forecast", required = false) String date){
		Pager<Forecast> page =null;
		User user = (User) request.getSession().getAttribute("user");
		if(user.getRole().getRoleName().equals("销售总监")){
			page =forecastService.getPager(pageIndex, pageSize, date, 0);
		}else{
			page = forecastService.getPager(pageIndex, pageSize, date, user.getDept().getDeptId());
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("rows", page.getData());
		map.put("total", page.getSumCount());
		return map;
	}
	
	@RequestMapping("/forecastInsert")
	public String forecastInsert(Forecast forecast,Map<String,Object> map){
		List<Dictionary> list = dictionaryService.getClientStates("FORECAST_TYPE");
		map.put("list", list);
		return "forecastInsert";
	}
	
	@RequestMapping("/forecastQuery")
	public String forecastQuery(Forecast forecast,Map<String,Object> map){
		map.put("forecast", forecastService.getForecast(forecast.getId()));
		return "forecastQuery";
	}
}
