package com.lxit.crm.entity;

import java.io.Serializable;

/**
 * 销售计划表
 */
public class Plan implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;// 表示列

	private String planNumber;//编码
	
	private User createUser;// 员工主键

	private String date; // 销售月份

	private String state;// 计划状态(引用数据字典)

	private String lastDate;// 最后操作时间

	private String lastUserName;// 最后修改人

	private String planText; // 计划内容

	private String manageUser;// 待处理人
	
	private User user=new User();
	
	private String createName;
	
	private String vdate;
	
	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getCreateUser() {
		return createUser;
	}

	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.vdate = date;
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getPlanText() {
		return planText;
	}

	public void setPlanText(String planText) {
		this.planText = planText;
	}

	public String getManageUser() {
		return manageUser;
	}

	public void setManageUser(String manageUser) {
		this.manageUser = manageUser;
	}

	

	public String getVdate() {
		return vdate.substring(0,7);
	}

	public void setVdate(String vdate) {
		this.vdate = vdate;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", planNumber=" + planNumber + ", createUser=" + createUser + ", date=" + date
				+ ", state=" + state + ", lastDate=" + lastDate + ", lastUserName=" + lastUserName + ", planText="
				+ planText + ", manageUser=" + manageUser + ", createName=" + createName + "]";
	}

	public String getPlanNumber() {
		return planNumber;
	}

	public void setPlanNumber(String planNumber) {
		this.planNumber = planNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
			
			this.user = user;
	}

	
	
	

}
