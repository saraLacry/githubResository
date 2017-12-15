package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.ServiceDao;
import com.lxit.crm.entity.Service;

@Repository("ServiceDao")
public class ServiceDaoImpl implements ServiceDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public boolean insertService(Service service) {
		return sqlSessionTemplate.insert("ServiceMapper.insertServiceinto", service)>0;
	}

	@Override
	public boolean updateService(Service service) {
		sqlSessionTemplate.update("ServiceMapper.updateService", service);
		return true;
	}

	@Override
	public boolean deleteService(int serviceId) {
		Service servic  = new Service();
		servic.setServiceId(serviceId);
		sqlSessionTemplate.delete("ServiceMapper.deleteService", servic);
		return true;
	}

	@Override
	public Service ServiceBy(int serviceId) {
		Service servic  = new Service();
		servic.setServiceId(serviceId);
		Service service = sqlSessionTemplate.selectOne("ServiceMapper.selectServiceById",servic); 
		return service;
	}

	@Override
	public List<Service> ServiceList() {
		List<Service> list = sqlSessionTemplate.selectList("ServiceMapper.listService");
		return list;
	}

	@Override
	public boolean submitService(Service service) {
		 sqlSessionTemplate.update("ServiceMapper.submitService",service);
		 return true;
	}
	
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public boolean lastoperation(Service service) {
		sqlSessionTemplate.update("ServiceMapper.lastoperation", service);
		return true;
	}

	@Override
	public boolean disposeupdaet(Service service) {
		sqlSessionTemplate.update("ServiceMapper.disposeupdaet",service);
		return true;
	}

	@Override
	public boolean feedbackService(Service service) {
		sqlSessionTemplate.update("ServiceMapper.feedbackService",service);
		return true;
	}

	@Override
	public boolean pigeonholeService(Service service) {
		sqlSessionTemplate.update("ServiceMapper.pigeonholeService",service);
		return true;
	}

	@Override
	public boolean AllocationService(Service service) {
		return sqlSessionTemplate.update("ServiceMapper.AllocationService",service)>0;
	}

	

}
