package com.lxit.crm.service.Impl;

import java.util.List;

import java.util.concurrent.TimeoutException;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crm.dao.IndentDao;
import com.lxit.crm.dao.IndentgoodsDao;
import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.Indentgoods;
import com.lxit.crm.service.IndentGoodsService;
import com.whalin.MemCached.MemCachedClient;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
@WebService
@Service("indentGoodsService")
public class IndentGoodsServiceImpl implements IndentGoodsService{
	@Resource
	IndentgoodsDao indentGoodDao;
	
	@Autowired
	MemcachedClient memcachedClient;
	@Override
	public List<Indentgoods> getListIndentallmoney(int indentId) {
		return indentGoodDao.getListIndentallmoney(indentId);
	}

	@Override
	public Indentgoods getmoney(int clientresourceid) {
		return indentGoodDao.getmoney(clientresourceid);
	}

	@Override
	public int insertIndentgoods(Indentgoods indentgoods) {
		return indentGoodDao.insertIndentgoods(indentgoods);
	}

	@Override
	public List<Indentgoods> getindentGoodsxixi(String indentnumber) {
		List<Indentgoods> list = null;
		try {
			List<Indentgoods> indentGoodlist=memcachedClient.get(indentnumber);
			if (indentGoodlist==null) {
				list=  indentGoodDao.getindentGoodsxixi(indentnumber);
				memcachedClient.set(indentnumber,240,list);
				System.out.println("数据库查询");
			}else{
				list=indentGoodlist;
				System.out.println("缓存查询");
			}
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			e.printStackTrace();
		}
	
		return list;
	}

}
