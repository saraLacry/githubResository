package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.ServiceDao;
import com.lxit.crm.service.ServiceService;

@Service("ServiceService")
public class ServiceServiceImpl implements ServiceService {

	@Resource
    private ServiceDao serviceDao;

	@Override
	public boolean insertService(com.lxit.crm.entity.Service service) {
		// TODO Auto-generated method stub
		return serviceDao.insertService(service);
	}

	@Override
	public boolean updateService(com.lxit.crm.entity.Service service) {
		// TODO Auto-generated method stub
		return serviceDao.updateService(service);
	}

	@Override
	public boolean deleteService(int serviceId) {
		// TODO Auto-generated method stub
		return serviceDao.deleteService(serviceId);
	}

	@Override
	public com.lxit.crm.entity.Service ServiceBy(int serviceId) {
		// TODO Auto-generated method stub
		return serviceDao.ServiceBy(serviceId);
	}

	@Override
	public List<com.lxit.crm.entity.Service> ServiceList() {
		return serviceDao.ServiceList();
	}

	public ServiceDao getServiceDao() {
		return serviceDao;
	}

	public void setServiceDao(ServiceDao serviceDao) {
		this.serviceDao = serviceDao;
	}

	@Override
	public boolean submitService(com.lxit.crm.entity.Service service) {
		// TODO Auto-generated method stub
		return serviceDao.submitService(service);
	}

	@Override
	public boolean lastoperation(com.lxit.crm.entity.Service service) {
		// TODO Auto-generated method stub
		return serviceDao.lastoperation(service);
	}

	@Override
	public boolean disposeupdaet(com.lxit.crm.entity.Service service) {
		// TODO Auto-generated method stub
		return serviceDao.disposeupdaet(service);
	}

	@Override
	public boolean feedbackService(com.lxit.crm.entity.Service service) {
		// TODO Auto-generated method stub
		return serviceDao.feedbackService(service);
	}

	@Override
	public boolean pigeonholeService(com.lxit.crm.entity.Service service) {
		// TODO Auto-generated method stub
		return serviceDao.pigeonholeService(service);
	}

	@Override
	public boolean AllocationService(com.lxit.crm.entity.Service service) {
		// TODO Auto-generated method stub
		return serviceDao.AllocationService(service);
	}

}
