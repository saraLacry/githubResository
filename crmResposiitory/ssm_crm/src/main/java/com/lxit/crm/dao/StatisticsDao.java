package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.ClienteleRunOff;

/**
 * 统计
 * @author Administrator
 *
 */
public interface StatisticsDao {
// 客户流失统计
public List<ClienteleRunOff> runOff();
}
