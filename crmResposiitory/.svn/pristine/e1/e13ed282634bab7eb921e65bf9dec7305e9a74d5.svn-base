package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.ClientCareDao;
import com.lxit.crm.entity.ClientCare;

@Repository("clientCareDao")
public class ClientCareDaoImpl implements ClientCareDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}



	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	@Override
	public List<ClientCare> getList() {
		return this.sqlSessionTemplate.selectList("ClientCare.getList");
	}



	@Override
	public int insertCare(ClientCare clientCare) {
		return this.sqlSessionTemplate.insert("ClientCare.insertCare", clientCare);
	}



	@Override
	public int updateCare(ClientCare clientCare) {
		return this.sqlSessionTemplate.update("ClientCare.updateCare", clientCare);
	}



	@Override
	public int deleteCare(int id) {
		return this.sqlSessionTemplate.delete("ClientCare.deleteCare", id);
	}



	@Override
	public ClientCare getCare(int id) {
		return this.sqlSessionTemplate.selectOne("ClientCare.getListbyId", id);
	}

}
