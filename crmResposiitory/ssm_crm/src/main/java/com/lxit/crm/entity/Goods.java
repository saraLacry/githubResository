package com.lxit.crm.entity;

import java.io.Serializable;

/**
 * 全部商品表goods
 * @author Administrator
 *
 */
public class Goods implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int goodsId;//商品id
	private String goodsName;//商品name
	private String goodsModel;//商品型号
	private String goodsMoney;//商品金额
	private int goodsReserve;//商品库存
	
	private int number;//购买个数
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsModel() {
		return goodsModel;
	}
	public void setGoodsModel(String goodsModel) {
		this.goodsModel = goodsModel;
	}
	public String getGoodsMoney() {
		return goodsMoney;
	}
	public void setGoodsMoney(String goodsMoney) {
		this.goodsMoney = goodsMoney;
	}
	public int getGoodsReserve() {
		return goodsReserve;
	}
	public void setGoodsReserve(int goodsReserve) {
		this.goodsReserve = goodsReserve;
	}
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsModel=" + goodsModel + ", goodsMoney="
				+ goodsMoney + ", goodsReserve=" + goodsReserve + ", number=" + number + "]";
	}
	
	
	
}
