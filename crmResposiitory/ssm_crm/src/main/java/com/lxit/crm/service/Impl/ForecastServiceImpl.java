package com.lxit.crm.service.Impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.ForecastDao;
import com.lxit.crm.entity.Forecast;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.ForecastService;

@Service("forecastService")
public class ForecastServiceImpl implements ForecastService {
	@Resource
	ForecastDao forecastDao;
	
	@Override
	public Pager<Forecast> getPager(int pageIndex, int pageSize, String date, int id) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("date", date);
		if(id>0){
			map.put("id", id);
		}
		
		Pager<Forecast> page = new Pager<Forecast>();
		page.setData(forecastDao.getList(map));
		page.setSumCount(forecastDao.getCount(map));
		return page;
	}

	@Override
	public Forecast getForecast(int id) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("fid", id);
		return forecastDao.getForecast(map);
	}

	@Override
	public int insert(Forecast forecast) {
		// TODO Auto-generated method stub
		return forecastDao.insert(forecast);
	}

}
