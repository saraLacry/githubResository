package com.lxit.crm.dao;

import java.util.List;
import java.util.Map;

import com.lxit.crm.entity.Goods;

public interface GoodsDao {

	/**
	 * 加载所有商品
	 * @return
	 */
	public List<Goods> getGoodslist();
	
	/**
	 * 所有商品总数
	 * @return
	 */
	public int getGoodsCount();
	
	public Goods getGoodstotal(Map<String, Object> map);
	
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
