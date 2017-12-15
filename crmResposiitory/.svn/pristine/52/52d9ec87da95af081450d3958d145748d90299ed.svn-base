package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.CilentResourceDao;
import com.lxit.crm.entity.ClientResource;
import com.lxit.crm.entity.Pager;

@Repository("cilentResourceDao")
public class CilentResourceDaoImpl implements CilentResourceDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}



	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<ClientResource> getList() {
		
		return this.sqlSessionTemplate.selectList("CilentResource.getList");
	}

	@Override
	public List<ClientResource> listClientResource(Object[] array) {
		return this.sqlSessionTemplate.selectList("CilentResource.getclientindent",array);
	}
	
	@Override
	public List<ClientResource> listClientResource2(Object[] array) {
		return this.sqlSessionTemplate.selectList("CilentResource.getclientindent2",array);
	}

	@Override
	public int getClientResourceCount(Object[] array) {
		return this.sqlSessionTemplate.selectOne("CilentResource.getClientResourceCount",array);
	}


	@Override
	public List<ClientResource> getResourcePage(Object[] array) {
		System.out.println("array===="+array.toString());
		return this.sqlSessionTemplate.selectList("CilentResource.getResourcePage",array);
	}



	@Override
	public ClientResource getClientResourceById(int id) {
		System.out.println("getClientResourceById+++++++id===="+id);
		return this.sqlSessionTemplate.selectOne("CilentResource.getindentResourceById",id);
	}
	
	@Override
	public ClientResource getClientResourceById2(int id) {
		System.out.println("getClientResourceById+++++++id===="+id);
		return this.sqlSessionTemplate.selectOne("CilentResource.getindentResourceById2",id);
	}



	@Override
	public int addClient(ClientResource clientResource) {
		return this.sqlSessionTemplate.insert("CilentResource.insertClientResource", clientResource);
	}



	@Override
	public int updateClient(ClientResource clientResource) {
		return this.sqlSessionTemplate.insert("CilentResource.updateClientResource", clientResource);
	}



	@Override
	public int deleteClient(int id) {
		return this.sqlSessionTemplate.insert("CilentResource.deleteClientResource", id);
	}



	@Override
	public List<ClientResource> getLike(int page,int rows,String str) {
		return this.sqlSessionTemplate.selectList("CilentResource.getClientResoureceMohu", str);
	}
	
	
	@Override
	public ClientResource getResoureceById(int id) {
		return this.sqlSessionTemplate.selectOne("CilentResource.getResourceById", id);
	}



	@Override
	public int updateUserId(int userId,String clientCode) {
		ClientResource resource=new ClientResource();
		resource.setUserId(userId);
		resource.setClientCode(clientCode);
		return this.sqlSessionTemplate.update("CilentResource.updateUserId", resource);
	}



	@Override
	public int getClientResourceCount2(Object[] array) {
		return this.sqlSessionTemplate.selectOne("CilentResource.getClientResourceCount2", array);
	}



	@Override
	public int updateClientIndent(ClientResource clientResource) {
		return this.sqlSessionTemplate.update("CilentResource.updateClientResourceIndent", clientResource);
	}

}