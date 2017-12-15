package com.lxit.crm.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 部门属性类
 * 
 * @author Administrator
 *
 */
public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int deptId;// 部门主键
	private String deptNumber;// 部门编号
	private String deptName;// 部门简称
	private String deptBeneluxName;// 部门全称
	private String deptSynopsis;// 部门简介
	private String deptRemark;// 部门备注
	private Dept dept;// 所属部门
	private String lasttime;// 最后修改时间
	private String lastuser;// 操作人,根据user主键生成
	private List<User> user;// 员工集合
	private String superiorDept;// 所属部门

	// public Dept(int deptId, String deptNumber, String deptName, String
	// deptBeneluxName, String deptSynopsis,
	// String deptRemark, Dept dept, String lasttime, String lastuser,
	// List<User> user) {
	// super();
	// this.deptId = deptId;
	// this.deptNumber = deptNumber;
	// this.deptName = deptName;
	// this.deptBeneluxName = deptBeneluxName;
	// this.deptSynopsis = deptSynopsis;
	// this.deptRemark = deptRemark;
	// this.dept = dept;
	// this.lasttime = lasttime;
	// this.lastuser = lastuser;
	// this.user = user;
	// }

	public Dept() {
		super();
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(String deptNumber) {
		this.deptNumber = deptNumber;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptBeneluxName() {
		return deptBeneluxName;
	}

	public void setDeptBeneluxName(String deptBeneluxName) {
		this.deptBeneluxName = deptBeneluxName;
	}

	public String getDeptSynopsis() {
		return deptSynopsis;
	}

	public void setDeptSynopsis(String deptSynopsis) {
		this.deptSynopsis = deptSynopsis;
	}

	public String getDeptRemark() {
		return deptRemark;
	}

	public void setDeptRemark(String deptRemark) {
		this.deptRemark = deptRemark;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getLasttime() {
		return lasttime;
	}

	public void setLasttime(String lasttime) {
		this.lasttime = lasttime;
	}

	public String getLastuser() {
		return lastuser;
	}

	public void setLastuser(String lastuser) {
		this.lastuser = lastuser;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public String getSuperiorDept() {
		return superiorDept;
	}

	public void setSuperiorDept(String superiorDept) {
		this.superiorDept = superiorDept;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", deptNumber=" + deptNumber + ", deptName=" + deptName + ", deptBeneluxName="
				+ deptBeneluxName + ", deptSynopsis=" + deptSynopsis + ", deptRemark=" + deptRemark + ", dept=" + dept
				+ ", lasttime=" + lasttime + ", lastuser=" + lastuser + ", user=" + user + ", superiorDept="
				+ superiorDept + "]";
	}
}