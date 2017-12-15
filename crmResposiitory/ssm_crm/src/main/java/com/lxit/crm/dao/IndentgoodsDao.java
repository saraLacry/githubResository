package com.lxit.crm.dao;

import java.util.List;
import com.lxit.crm.entity.Indentgoods;

public interface IndentgoodsDao {
	/**
	 * 订单中获取价格和数量
	 * @param indentId
	 * @return
	 */
	public List<Indentgoods> getListIndentallmoney(int indentId);
	
	/**
	 * 订单中获取价格
	 * @param indentId
	 * @return
	 */
	public Indentgoods getmoney(int clientresourceid);
	
	/**
	 * 增加订单商品
	 * @param indentgoods
	 * @return
	 */
	public int insertIndentgoods(Indentgoods indentgoods);
	
	/**
	 * 查询商品信息
	 * @param indentnumber
	 * @return
	 */
	public List<Indentgoods> getindentGoodsxixi(String indentnumber);
}
