package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.concurrent.TimeoutException;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.DictionaryDao;
import com.lxit.crm.entity.Dictionary;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

@Repository("dictionaryDao")
public class DictionaryDaoImpl implements DictionaryDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	// 写入缓存用的
	@Resource
	private MemcachedClient memcachedClient;

	@Override
	public List<Dictionary> getClientStates(String dictionarycoding) {
		try {
			// List<Dictionary> obj = (List<Dictionary>)
			if (null != memcachedClient.get("listStates")) {
				// 说明缓存中存在需要的数据,返回缓存中的数据
				List<Dictionary> obj = (List<Dictionary>) memcachedClient.get("listStates");
				return obj;
			} else {
				// 如果不存在需从数据库中获取
				List<Dictionary> distList = sqlSessionTemplate.selectList("Dictionary.getDictionary", dictionarycoding);
				memcachedClient.set("distList", 100, distList);
				return distList;
			}
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Dictionary getClientStatesById(int id) {
		try {
			Dictionary dictionarys = (Dictionary) memcachedClient.get("listStates");
			if (null != dictionarys) {
				// 说明缓存中存在需要的数据,返回缓存中的数据
				return dictionarys;
			} else {
				// 如果不存在需从数据库中获取
				return this.sqlSessionTemplate.selectOne("Dictionary.getClientStatesById", id);
			}
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Dictionary getCoumpant(String parms) {
		try {
			// 查询缓存中是否存在数据
			Dictionary dicObj = (Dictionary) memcachedClient.get("dicCacheCoupant");
			if (null != dicObj) {
				return dicObj;
			} else {
				return null;
			}
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			e.printStackTrace();
		}
		return null;
	}
}