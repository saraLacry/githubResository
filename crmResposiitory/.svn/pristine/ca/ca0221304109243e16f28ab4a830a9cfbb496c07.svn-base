package com.lxit.crm.dao;

import java.util.List;
import java.util.Map;

import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.StatisticsIndent;

public interface IndentDao {

	/**
	 * 查询所有的订单信息
	 * 
	 * @return
	 */
	public List<Indent> getIndentList(Object[] array);
	
	/**
	 * 查询所有的订单信息总数
	 * @param array
	 * @return
	 */
	public int getIndentListCount(Object[] array);
	
	/**
	 * 根据订单id查询订单
	 * @param indentId
	 * @return
	 */
	public Indent getIndentById(int indentId);
	
	/**
	 * 增加订单
	 * @param indent
	 * @return
	 */
	public int insertIndent(Indent indent);
	
	/**
	 * 订单统计
	 * @return
	 */
	public List<StatisticsIndent> getListstatistics(Object[] array);
	/**
	 * 订单统计总数
	 * @return
	 */
	public int getStatisticsIndentCount(Map<String, Object> map);
	

}
