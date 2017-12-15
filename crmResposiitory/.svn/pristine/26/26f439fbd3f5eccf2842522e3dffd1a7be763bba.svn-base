package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.ForecastDao;
import com.lxit.crm.entity.Forecast;

@Repository("forecastDao")
public class ForecastDaoImpl implements ForecastDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Forecast> getList(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Forecast.getList", map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Forecast.getCount",map);
	}

	@Override
	public int insert(Forecast forecast) {
		return sqlSessionTemplate.insert("Forecast.insert", forecast);
	}

	@Override
	public Forecast getForecast(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Forecast.getList",map);
	}

}
