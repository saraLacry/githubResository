package com.lxit.crm.service;

import com.lxit.crm.entity.Forecast;
import com.lxit.crm.entity.Pager;

public interface ForecastService {
	public Pager<Forecast> getPager(int pageIndex,int pageSize,String date,int id);
	
	public Forecast getForecast(int id);
	
	public int insert(Forecast forecast);	
}
