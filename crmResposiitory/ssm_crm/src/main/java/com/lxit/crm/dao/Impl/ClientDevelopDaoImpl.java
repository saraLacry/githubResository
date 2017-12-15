package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.ClientDevelopDao;
import com.lxit.crm.entity.ClientDevelop;

@Repository("clientDevelopDao")
public class ClientDevelopDaoImpl implements ClientDevelopDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}



	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	@Override
	public List<ClientDevelop> getListPage(Object[] array) {
		
		return this.sqlSessionTemplate.selectList("ClientDevelop.getListPage",array);
	}



	@Override
	public int getDevelopCount(Object[] array) {
		return this.sqlSessionTemplate.selectOne("ClientDevelop.getDevelopCount",array);
	}



	@Override
	public int insertPlan(ClientDevelop clientDevelop) {
		return this.sqlSessionTemplate.insert("ClientDevelop.insertDevelop", clientDevelop);
	}



	@Override
	public int updatePlan(ClientDevelop clientDevelop) {
		return this.sqlSessionTemplate.update("ClientDevelop.updateDevelop", clientDevelop);
	}



	@Override
	public int delectPlan(int id) {
		return this.sqlSessionTemplate.delete("ClientDevelop.deleteDevelop", id);
	}



	@Override
	public ClientDevelop getPlanById(int id) {
		return this.sqlSessionTemplate.selectOne("ClientDevelop.getDevelopbyId", id);
	}

}
