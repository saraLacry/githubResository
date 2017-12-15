package com.lxit.crm.entity;

import java.io.Serializable;
/**
 * 公司销售分析类
 * @author Administrator
 *
 */
public class CompanyAnalyze implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private double marketSum;//销售金额
	
	private String date;//日期
	
	private String together;//同比
	
	private String loop;//环比

	

	public double getMarketSum() {
		return marketSum;
	}

	public void setMarketSum(double marketSum) {
		this.marketSum = marketSum;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTogether() {
		return together;
	}

	public void setTogether(String together) {
		this.together = together;
	}

	public String getLoop() {
		return loop;
	}

	public void setLoop(String loop) {
		this.loop = loop;
	}
	
	
}
