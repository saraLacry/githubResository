package com.lxit.crm.entity;

import java.io.Serializable;
/**
 * 联系人表
 * @author Administrator
 *
 */
public class Linkman implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int id;//主键
	
	private String linkmannumber;//编号
	
	private String linkmansex;//性别
	
	private String linkmanName;//姓名
	
	private String linkmanbirth;//生日
	
	private String linkmanphone;//手机号
	
	private String linkmanworkphone;//办公电话
	
	private String linakmanhousephone;//家庭电话
	
	private String linkmanemail;//邮箱
	
	private String linkmanaddress;//地址
	
	private String linkmanremoek;//备注
	
	private String startDate;//录入时间
	
	private int userId;//录入人id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLinkmannumber() {
		return linkmannumber;
	}

	public void setLinkmannumber(String linkmannumber) {
		this.linkmannumber = linkmannumber;
	}

	public String getLinkmansex() {
		return linkmansex;
	}

	public void setLinkmansex(String linkmansex) {
		this.linkmansex = linkmansex;
	}

	public String getLinkmanName() {
		return linkmanName;
	}

	public void setLinkmanName(String linkmanName) {
		this.linkmanName = linkmanName;
	}

	public String getLinkmanbirth() {
		return linkmanbirth;
	}

	public void setLinkmanbirth(String linkmanbirth) {
		this.linkmanbirth = linkmanbirth;
	}

	public String getLinkmanphone() {
		return linkmanphone;
	}

	public void setLinkmanphone(String linkmanphone) {
		this.linkmanphone = linkmanphone;
	}

	public String getLinkmanworkphone() {
		return linkmanworkphone;
	}

	public void setLinkmanworkphone(String linkmanworkphone) {
		this.linkmanworkphone = linkmanworkphone;
	}

	public String getLinakmanhousephone() {
		return linakmanhousephone;
	}

	public void setLinakmanhousephone(String linakmanhousephone) {
		this.linakmanhousephone = linakmanhousephone;
	}

	public String getLinkmanemail() {
		return linkmanemail;
	}

	public void setLinkmanemail(String linkmanemail) {
		this.linkmanemail = linkmanemail;
	}

	public String getLinkmanaddress() {
		return linkmanaddress;
	}

	public void setLinkmanaddress(String linkmanaddress) {
		this.linkmanaddress = linkmanaddress;
	}

	public String getLinkmanremoek() {
		return linkmanremoek;
	}

	public void setLinkmanremoek(String linkmanremoek) {
		this.linkmanremoek = linkmanremoek;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	
}
