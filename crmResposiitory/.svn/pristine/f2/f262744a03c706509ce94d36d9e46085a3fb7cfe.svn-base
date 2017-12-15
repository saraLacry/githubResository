package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.ContendDao;
import com.lxit.crm.entity.Contend;

@Repository("contendDao")
public class ContendDaoImpl implements ContendDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Contend> getList(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Contend.getList",map);
	}

	@Override
	public int update(Contend contend) {
		return sqlSessionTemplate.update("Contend.update",contend);
	}

	@Override
	public int insert(Contend contend) {
		return sqlSessionTemplate.insert("Contend.insert",contend);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Contend.getCount",map);
	}

	@Override
	public Contend getContend(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Contend.getList",map);
	}

}
