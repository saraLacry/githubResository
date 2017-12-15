package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.CareSchemeDao;
import com.lxit.crm.entity.CareScheme;

@Repository("careSchemeDao")
public class CareSchemeDaoImpl implements CareSchemeDao {
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}



	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}



	@Override
	public List<CareScheme> getList() {
		return this.sqlSessionTemplate.selectList("CareScheme.getList");
	}



	@Override
	public int insertScheme(CareScheme careScheme) {
		return this.sqlSessionTemplate.insert("CareScheme.insertScheme", careScheme);
	}



	@Override
	public int updateScheme(CareScheme careScheme) {
		return this.sqlSessionTemplate.update("CareScheme.updateScheme", careScheme);
	}



	@Override
	public int deleteScheme(int id) {
		return this.sqlSessionTemplate.delete("CareScheme.deleteScheme", id);
	}



	@Override
	public CareScheme getScheme(int id) {
		return this.sqlSessionTemplate.selectOne("CareScheme.getListbyId", id);
	}

}