package com.lxit.crm.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.StatisticsIndent;

public interface IndentSerivce {
	/**
	 * 查询所有的订单信息
	 * 
	 * @return
	 */
	public Pager<Indent> getIndentList(Object[] array);
	
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
	public Pager<StatisticsIndent> getListstatistics(int page,int rows,String data1,String data2);

}
