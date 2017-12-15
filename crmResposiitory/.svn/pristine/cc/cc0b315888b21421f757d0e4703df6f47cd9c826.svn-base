package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.Impl.StatisticsDaoImpl;
import com.lxit.crm.entity.ClienteleRunOff;
import com.lxit.crm.service.StatisticsService;
/**
 * 统计
 * @author Administrator
 *
 */
@Service("statisticsService")
public class StatisticsServiceImpl implements StatisticsService{
@Resource
 private StatisticsDaoImpl  statisticsDao;

public StatisticsDaoImpl getStatisticsDao() {
	return statisticsDao;
}

public void setStatisticsDao(StatisticsDaoImpl statisticsDao) {
	this.statisticsDao = statisticsDao;
}

@Override
public List<ClienteleRunOff> runOff() {
	// TODO Auto-generated method stub
	return statisticsDao.runOff();
}
 
}
