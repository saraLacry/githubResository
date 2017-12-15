package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.ChanceDao;
import com.lxit.crm.entity.Chance;

@Repository("chanceDao")
public class ChanceDaoImpl implements ChanceDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int insert(Chance chance) {
		return sqlSessionTemplate.insert("Chance.insert",chance);
	}

	@Override
	public int update(Chance chance) {
		
		return sqlSessionTemplate.update("Chance.update",chance);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		int count = sqlSessionTemplate.selectOne("Chance.getCount",map);
		return count;
	}

	@Override
	public List<Chance> getLists(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Chance.getList",map);
	}

	@Override
	public Chance getChance(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Chance.getList",map);
	}

}
