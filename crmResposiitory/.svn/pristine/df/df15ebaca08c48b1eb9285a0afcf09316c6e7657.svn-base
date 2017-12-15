package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.ClientDevelopDao;
import com.lxit.crm.entity.ClientDevelop;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.ClientDevelopService;

@WebService
@Service("clientDevelopService")
public class ClientDevelopServiceImpl implements ClientDevelopService {

	@Resource
	ClientDevelopDao clientDevelopDao;
	
	
	public ClientDevelopDao getClientDevelopDao() {
		return clientDevelopDao;
	}


	public void setClientDevelopDao(ClientDevelopDao clientDevelopDao) {
		this.clientDevelopDao = clientDevelopDao;
	}


	@Override
	public Pager<ClientDevelop> getListPage(Object[] array) {
		Pager<ClientDevelop> pager=new Pager<ClientDevelop>();
		List<ClientDevelop> Develist=clientDevelopDao.getListPage(array);
		pager.setData(Develist);
		pager.setSumCount(getDevelopCount(array));
		System.out.println(Develist+".........");
		return pager;
	}


	@Override
	public int getDevelopCount(Object[] array) {
		// TODO Auto-generated method stub
		//memcachedClient.get(array.toString());
		return clientDevelopDao.getDevelopCount(array);
	}


	@Override
	public int insertPlan(ClientDevelop clientDevelop) {
		return clientDevelopDao.insertPlan(clientDevelop);
	}


	@Override
	public int updatePlan(ClientDevelop clientDevelop) {
		return clientDevelopDao.updatePlan(clientDevelop);
	}


	@Override
	public int delectPlan(int id) {
		return clientDevelopDao.delectPlan(id);
	}


	@Override
	public ClientDevelop getPlanById(int id) {
		return clientDevelopDao.getPlanById(id);
	}

}
