package com.lxit.crm.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.Indentgoods;
@WebService
public interface IndentGoodsService {
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
	@WebMethod
	public List<Indentgoods> getindentGoodsxixi(String indentnumber);
}
