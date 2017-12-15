package com.lxit.crm.dao.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.SellDao;
import com.lxit.crm.entity.Plan;

@Repository("sellDao")
public class SellDaoImpl implements SellDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	@Override
	public int getCount(Map<String,Object> map) {
		int count =sqlSessionTemplate.selectOne("Sell.getCount",map);	
		return count;
	}

	@Override
	public List<Plan> geteLists(Map<String,Object> map) {
		List<Plan> lists = sqlSessionTemplate.selectList("Sell.getList",map);
		return lists;
	}

	@Override
	public int save(Plan plan) {
		 
		return sqlSessionTemplate.insert("Sell.save", plan);
	}

	@Override
	public int delete(int id) {
		return sqlSessionTemplate.delete("Sell.delete", id);
	}

	@Override
	public int update(Plan plan) {
		return sqlSessionTemplate.update("Sell.update", plan);
	}
 
	
	

}
