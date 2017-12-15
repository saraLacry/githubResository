package com.lxit.crm.entity;

import java.io.Serializable;

/**
 * 订单表indent
 * @author Administrator
 *
 */
public class Indent  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int indentid;//订单id
	private String indentNumber;//订单类型/订单号
	private int indentdelivery;//配送方式（1.邮件 2.自取）
	private int paymentId;//支付方式(1,在线支付，2.线下支付)
	private String indentTime;//下单时间
	private String indentState;//状态(等待收货，已完成，失败)
	private String clientresourceName;//客户名字
	private String userName;//处理订单人
	private String goodsNameall;//所有商品名字
	private String goodsIndentallmoney;//订单商品总价格
	
	private ClientResource clientresource;//客户id,收货人
	private User user;//当前登录的订单操作人
	
	
	
	public String getGoodsIndentallmoney() {
		return goodsIndentallmoney;
	}
	public void setGoodsIndentallmoney(String goodsIndentallmoney) {
		this.goodsIndentallmoney = goodsIndentallmoney;
	}
	public String getGoodsNameall() {
		return goodsNameall;
	}
	public void setGoodsNameall(String goodsNameall) {
		this.goodsNameall = goodsNameall;
	}
	public String getClientresourceName() {
		return clientresourceName;
	}
	public void setClientresourceName(String clientresourceName) {
		this.clientresourceName = clientresourceName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getIndentid() {
		return indentid;
	}
	public void setIndentid(int indentid) {
		this.indentid = indentid;
	}
	public String getIndentNumber() {
		return indentNumber;
	}
	public void setIndentNumber(String indentNumber) {
		this.indentNumber = indentNumber;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public int getIndentdelivery() {
		return indentdelivery;
	}
	public void setIndentdelivery(int indentdelivery) {
		this.indentdelivery = indentdelivery;
	}
	public String getIndentTime() {
		return indentTime;
	}
	public void setIndentTime(String indentTime) {
		this.indentTime = indentTime;
	}
	public String getIndentState() {
		return indentState;
	}
	public void setIndentState(String indentState) {
		this.indentState = indentState;
	}
	public ClientResource getClientresource() {
		return clientresource;
	}
	public void setClientresource(ClientResource clientresource) {
		this.clientresource = clientresource;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Indent [indentid=" + indentid + ", indentNumber=" + indentNumber + ", indentdelivery=" + indentdelivery
				+ ", paymentId=" + paymentId + ", indentTime=" + indentTime + ", indentState=" + indentState
				+ ", clientresourceName=" + clientresourceName + ", userName=" + userName + ", goodsNameall="
				+ goodsNameall + ", goodsIndentallmoney=" + goodsIndentallmoney + ", clientresource=" + clientresource
				+ ", user=" + user + "]";
	}
	

	
	

	
	
	
	
	
	
}
