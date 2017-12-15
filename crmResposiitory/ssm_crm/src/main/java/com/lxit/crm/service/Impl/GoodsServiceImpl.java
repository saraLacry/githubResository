package com.lxit.crm.service.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.GoodsDao;
import com.lxit.crm.entity.Goods;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.GoodsService;

@Service("goodService")
public class GoodsServiceImpl implements GoodsService{

	@Resource
	GoodsDao goodsDao;
	@Override
	public Pager<Goods> getGoodslist() {
		List<Goods> list=  goodsDao.getGoodslist();
		Pager<Goods> pager = new Pager<Goods>();
		pager.setData(list);
		pager.setSumCount(getGoodsCount());
		return pager;
	}
	
	@Override
	public int getGoodsCount() {
		return goodsDao.getGoodsCount();
	}

	@Override
	public Pager<Goods> getGoodstotal(Object[] str) {
		List<Goods> list = new ArrayList<>();
		for (int i = 0; i < str.length; i=i+2) {
			Object object = str[i];
			Map<String, Object> map = new HashMap<>();
			map.put("totalGoodsid", str[i]);
			map.put("totalnumber", str[i+1]);
			Goods goods=  goodsDao.getGoodstotal(map);
			list.add(goods);
		}
		
		Pager<Goods> pager = new Pager<Goods>();
		pager.setData(list);
		pager.setSumCount((str.length)/2);
		return pager;
	}

	@Override
	public List<Goods> Listgoodsname(int indentid) {
		return goodsDao.Listgoodsname(indentid);
	}

	@Override
	public int updateGoods(Goods goods) {
		return goodsDao.updateGoods(goods);
	}
}