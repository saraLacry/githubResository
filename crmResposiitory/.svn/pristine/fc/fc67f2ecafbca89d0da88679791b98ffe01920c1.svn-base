package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.ClientCareDao;
import com.lxit.crm.entity.ClientCare;
import com.lxit.crm.service.ClientCareService;

@Service("clientCareService")
public class ClientCareServiceImpl implements ClientCareService {

	@Resource
	ClientCareDao clientCareDao;

	public ClientCareDao getClientCareDao() {
		return clientCareDao;
	}

	public void setClientCareDao(ClientCareDao clientCareDao) {
		this.clientCareDao = clientCareDao;
	}

	@Override
	public List<ClientCare> getList() {
		List<ClientCare> careList = clientCareDao.getList();
		return careList;
	}

	@Override
	public int insertCare(ClientCare clientCare) {
		return clientCareDao.insertCare(clientCare);
	}

	@Override
	public int updateCare(ClientCare clientCare) {
		return clientCareDao.updateCare(clientCare);
	}

	@Override
	public int deleteCare(int id) {
		return clientCareDao.deleteCare(id);
	}

	@Override
	public ClientCare getCare(int id) {
		return clientCareDao.getCare(id);
	}
}