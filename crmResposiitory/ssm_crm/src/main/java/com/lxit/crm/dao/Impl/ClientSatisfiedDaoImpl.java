package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.ClientSatisfiedDao;
import com.lxit.crm.entity.ClientSatisfied;

@Repository("clientSatisfiedDao")
public class ClientSatisfiedDaoImpl implements ClientSatisfiedDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}



	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}



	@Override
	public List<ClientSatisfied> getListPage(Object[] array) {
		return this.sqlSessionTemplate.selectList("ClientSatisfied.getListPage",array);
	}



	@Override
	public int insertSatisfied(ClientSatisfied clientSatisfied) {
		return this.sqlSessionTemplate.insert("ClientSatisfied.insertSatisfied", clientSatisfied);
	}



	@Override
	public int updateSatisfied(ClientSatisfied clientSatisfied) {
		return this.sqlSessionTemplate.update("ClientSatisfied.updateSatisfied", clientSatisfied);
	}



	@Override
	public int deleteSatisfied(int id) {
		return this.sqlSessionTemplate.delete("ClientSatisfied.deleteSatisfied", id);
	}



	@Override
	public ClientSatisfied querySatisfied(int id) {
		return this.sqlSessionTemplate.selectOne("ClientSatisfied.querySatisfied", id);
	}



	@Override
	public int getListCount(Object[] array) {
		return this.sqlSessionTemplate.selectOne("ClientSatisfied.getListCount", array);
	}

}