package com.lxit.crm.dao;

import java.util.List;
import java.util.Map;

import com.lxit.crm.entity.Forecast;

public interface ForecastDao {
	public List<Forecast> getList(Map<String,Object> map);
	
	public int getCount(Map<String,Object> map);
	
	public int insert(Forecast forecast);
	
	public Forecast getForecast(Map<String,Object> map);
}
