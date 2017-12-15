package com.lxit.crm.entity;

import java.io.Serializable;
import java.text.DecimalFormat;

import org.aspectj.org.eclipse.jdt.internal.compiler.apt.dispatch.RoundDispatcher;
/**
 * 销售分析表
 * @author Administrator
 *
 */
public class Analyze implements Serializable {

	 private DecimalFormat df = new DecimalFormat("#.00");
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String name;//名字
	
	private double marketSum;//销售金额
	
	private String date;//日期
	
	private String together;//同比
	
	private String loopWith;//环比
	
	private String money;//

	
	
	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarketSum() {
		return marketSum;
	}

	public void setMarketSum(double marketSum) {
		money = "￥"+marketSum;
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

	public void setTogether(double together) {
		System.out.println("marketSum="+marketSum+"    ,together="+together );
		
		if(together>0&&marketSum>together){
			this.together = df.format(100/together*(marketSum-together));
			this.together ="+"+together+"%";
		}else if(together>0&&marketSum<together){
			this.together = df.format(100/together*(together-marketSum));
			this.together ="-"+together+"%";
		}
	}

	

	public String getLoopWith() {
		return loopWith;
	}

	public void setLoopWith(double loopWith) {
		System.out.println("marketSum ==="+marketSum+",    loopWith==="+loopWith);
		if(loopWith>0&&marketSum>loopWith){
			this.loopWith = df.format(100/loopWith*(marketSum-loopWith));
			this.loopWith ="+"+loopWith+"%";
		}else if(loopWith>0&&marketSum<loopWith){
			this.loopWith = df.format(100/loopWith*(loopWith-marketSum));
			this.loopWith ="-"+loopWith+"%";
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Analyze [id=" + id + ", name=" + name + ", marketSum=" + marketSum + ", date=" + date + ", together="
				+ together + ", loopWith=" + loopWith + ", money=" + money + "]";
	}

	
	
	
	
	
}
