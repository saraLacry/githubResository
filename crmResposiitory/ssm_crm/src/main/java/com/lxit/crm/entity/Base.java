package com.lxit.crm.entity;

import java.io.Serializable;

/**
 * 基础信息属性类
 * 
 * @author Administrator
 *
 */
public class Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int baseId;// 基础关键字id
	private String baseKey;// 基础关键字
	private String basevalue;// 参数值
	private User user;// 添加人(user对象)
	private String basedescribe;// 参数描述
	private String userName;// 添加人

	// public Base(int baseId, String baseKey, String basevalue, User user,
	// String basedescribe) {
	// super();
	// this.baseId = baseId;
	// this.baseKey = baseKey;
	// this.basevalue = basevalue;
	// this.user = user;
	// this.basedescribe = basedescribe;
	// }

	public Base() {
		super();
	}

	public int getBaseId() {
		return baseId;
	}

	public void setBaseId(int baseId) {
		this.baseId = baseId;
	}

	public String getBaseKey() {
		return baseKey;
	}

	public void setBaseKey(String baseKey) {
		this.baseKey = baseKey;
	}

	public String getBasevalue() {
		return basevalue;
	}

	public void setBasevalue(String basevalue) {
		this.basevalue = basevalue;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getBasedescribe() {
		return basedescribe;
	}

	public void setBasedescribe(String basedescribe) {
		this.basedescribe = basedescribe;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Base [baseId=" + baseId + ", baseKey=" + baseKey + ", basevalue=" + basevalue + ", user=" + user
				+ ", basedescribe=" + basedescribe + ", userName=" + userName + "]";
	}
}