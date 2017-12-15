package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.LinkmanDao;
import com.lxit.crm.entity.Linkman;

@Repository("linkmanDao")
public class LinkmanDaoImpl implements LinkmanDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Linkman> getList(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Linkman.getList", map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Linkman.getCount", map);
	}

	@Override
	public Linkman getLinkman(Map<String, Object> map) {
		
		return sqlSessionTemplate.selectOne("Linkman.getList", map);
	}

	@Override
	public int save(Linkman linkman) {
		return sqlSessionTemplate.insert("Linkman.insert", linkman);
	}

	@Override
	public int update(Linkman linkman) {
		return sqlSessionTemplate.insert("Linkman.update", linkman);
	}

	@Override
	public int delete(int id) {
		return sqlSessionTemplate.insert("Linkman.delete", id);
	}

}
