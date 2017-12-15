package com.lxit.crm.entity;

import java.io.Serializable;
/**
 * 销售绩效表
 * @author Administrator
 *
 */
public class Ratio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;//绩效标识列
	
	private String ratioNumber;//绩效编码
	
	private String userName;//用户的月季考核
	
	private String rank;//绩效等级
	
	private String lastDate;//最后修改时间
	
	private String lastUserName;//最后修改人
	
	private String  text;//备注;
	
	private String deptName;//部门

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRatioNumber() {
		return ratioNumber;
	}

	public void setRatioNumber(String ratioNumber) {
		this.ratioNumber = ratioNumber;
	}

	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public String getLastUserName() {
		return lastUserName;
	}

	public void setLastUserName(String lastUserName) {
		this.lastUserName = lastUserName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
}
