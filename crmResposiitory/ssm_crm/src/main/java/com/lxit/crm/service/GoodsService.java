package com.lxit.crm.service;

import java.util.List;

import com.lxit.crm.entity.Goods;
import com.lxit.crm.entity.Pager;

public interface GoodsService {
	/**
	 * 加载所有商品
	 * @return
	 */
	public Pager<Goods> getGoodslist();
	
	/**
	 * 所有商品总数
	 * @return
	 */
	public int getGoodsCount();
	
	public Pager<Goods> getGoodstotal(Object[] str);
	
	/**
	 * 查询订单中所有的商品名字
	 * @param indentid
	 * @return
	 */
	public List<Goods> Listgoodsname(int indentid);
	
	/**
	 * 修改
	 * @param indent
	 * @return
	 */
	public int updateGoods(Goods goods);
}
