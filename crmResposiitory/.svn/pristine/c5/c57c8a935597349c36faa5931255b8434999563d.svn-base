package com.lxit.crm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.ClientResource;
import com.lxit.crm.entity.Goods;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.GoodsService;

@Controller
public class GoodsController {

	@Autowired
	GoodsService goodsService;
	
	@ResponseBody
	@RequestMapping("/getGoodslist")
	public Map<String, Object> getGoodslist() {
		Map<String, Object> map = new HashMap<String, Object>();
		Pager<Goods> goodslist = goodsService.getGoodslist();
		map.put("total", goodslist.getSumCount());
		map.put("rows", goodslist.getData());
		return map;
	} 
	//订单结算前
	@ResponseBody
	@RequestMapping("/totalQian")
	public ClientResource totalGoodsQian(String voptions,HttpSession session) {
		Object[] str = voptions.split(",");
		session.setAttribute("str", str);
		ClientResource clientResource =(ClientResource) session.getAttribute("clientResource");
		return clientResource;
	} 
	//订单结算
	@ResponseBody
	@RequestMapping("/total")
	public Map<String, Object> totalGoods(HttpSession session) {
		Object[] str = (Object[]) session.getAttribute("str");
		Map<String, Object> map = new HashMap<String, Object>();
		Pager<Goods> goodslist = goodsService.getGoodstotal(str);
		session.setAttribute("indentgoodslist", goodslist.getData());
		map.put("total", goodslist.getSumCount());
		map.put("rows", goodslist.getData());
		return map;
	} 
	
	
	
}
