package com.lxit.crm.entity;

import java.io.Serializable;
/**
 *  订单商品表indentgoods	
 * @author Administrator
 *
 */
public class Indentgoods  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private int igid;//id
	private Goods goods;//订单商品id
	private Indent indent;//订单id
	
	private String indentGoodsMoney;//订单商品价格
	private int indentGoodsNumber;//订单商品数量
	
	
	
	public int getIgid() {
		return igid;
	}
	public void setIgid(int igid) {
		this.igid = igid;
	}
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public Indent getIndent() {
		return indent;
	}
	public void setIndent(Indent indent) {
		this.indent = indent;
	}
	public String getIndentGoodsMoney() {
		return indentGoodsMoney;
	}
	public void setIndentGoodsMoney(String indentGoodsMoney) {
		this.indentGoodsMoney = indentGoodsMoney;
	}
	public int getIndentGoodsNumber() {
		return indentGoodsNumber;
	}
	public void setIndentGoodsNumber(int indentGoodsNumber) {
		this.indentGoodsNumber = indentGoodsNumber;
	}
	@Override
	public String toString() {
		return "Indentgoods [igid=" + igid + ", goods=" + goods + ", indent=" + indent + ", indentGoodsMoney="
				+ indentGoodsMoney + ", indentGoodsNumber=" + indentGoodsNumber + "]";
	}
	

}
