package com.lxit.crm.entity;

import java.io.Serializable;

/**
 * 员工属性类
 * 
 * @author Administrator
 *
 */
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int userId;// 员工主键
	private String userNumber;// 员工编码
	private String userName;// 员工姓名
	private Dictionary state;// 1表示启用0表示停用
	private String createTime;// 创建时间
	private String loginId;// 登录Id,是'名.姓'的组成
	private String phone;// 联系电话
	private Dictionary sex;// 0表示男，1表示女
	private String remark;// 备注
	private String passWord;// 密码,默认123123
	private int count;// 用户名修改次数，只能修改一次
	private String lastTime;// 最后一次修改时间
	private String lastUserName;// 最后操作人
	private int leaduserId;// 上一级领导
	private int outstandinggrade;// 绩效等级
	private Role role;// 角色id
	private Dept dept;// 所在部门

	private String sexs;// 性别
	private String states;// 状态
	private int deptIds;//部门Id
	private int roleIds;//角色Id

	public User() {
		super();
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Dictionary getState() {
		return state;
	}

	public void setState(Dictionary state) {
		this.state = state;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Dictionary getSex() {
		return sex;
	}

	public void setSex(Dictionary sex) {
		this.sex = sex;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

	public String getLastUserName() {
		return lastUserName;
	}

	public void setLastUserName(String lastUserName) {
		this.lastUserName = lastUserName;
	}

	public int getLeaduserId() {
		return leaduserId;
	}

	public void setLeaduserId(int leaduserId) {
		this.leaduserId = leaduserId;
	}

	public int getOutstandinggrade() {
		return outstandinggrade;
	}

	public void setOutstandinggrade(int outstandinggrade) {
		this.outstandinggrade = outstandinggrade;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getSexs() {
		return sexs;
	}

	public void setSexs(String sexs) {
		this.sexs = sexs;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public int getDeptIds() {
		return deptIds;
	}

	public void setDeptIds(int deptIds) {
		this.deptIds = deptIds;
	}

	public int getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(int roleIds) {
		this.roleIds = roleIds;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userNumber=" + userNumber + ", userName=" + userName + ", state=" + state
				+ ", createTime=" + createTime + ", loginId=" + loginId + ", phone=" + phone + ", sex=" + sex
				+ ", remark=" + remark + ", passWord=" + passWord + ", count=" + count + ", lastTime=" + lastTime
				+ ", lastUserName=" + lastUserName + ", leaduserId=" + leaduserId + ", outstandinggrade="
				+ outstandinggrade + ", role=" + role + ", dept=" + dept + ", sexs=" + sexs + ", states=" + states
				+ ", deptIds=" + deptIds + ", roleIds=" + roleIds + "]";
	}
}