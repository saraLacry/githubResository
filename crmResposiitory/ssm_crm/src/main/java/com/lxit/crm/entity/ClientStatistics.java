package com.lxit.crm.entity;

import java.io.Serializable;

public class ClientStatistics implements Serializable {

	/**
	 * 统计分析通用表
	 */
	private static final long serialVersionUID = 1L;

	
	private int count; //数量
	
	private String date;//月份
	
	private String with;//同比
	
	private String loop;//环比
	
}
