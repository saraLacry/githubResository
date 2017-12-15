package com.lxit.crm.service.Impl;

import java.util.List;
import java.util.concurrent.TimeoutException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.ClientSatisfiedDao;
import com.lxit.crm.entity.ClientSatisfied;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.ClientSatisfiedService;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

@Service("clientSatisfiedService")
public class ClientSatisfiedServiceImpl implements ClientSatisfiedService {

	@Resource
	ClientSatisfiedDao clientSatisfiedDao;
	@Resource
	MemcachedClient memcachedClient;
	
	
	public ClientSatisfiedDao getClientSatisfiedDao() {
		return clientSatisfiedDao;
	}


	public void setClientSatisfiedDao(ClientSatisfiedDao clientSatisfiedDao) {
		this.clientSatisfiedDao = clientSatisfiedDao;
	}


	@Override
	public Pager<ClientSatisfied> getListPage(Object[] array) {
		Pager<ClientSatisfied> pager=null;
		try {
			Object list=memcachedClient.get("satisList");
			Object like=memcachedClient.get("like");
			Object count=memcachedClient.get("count");
			if (list==null&&count==null||like!=null) {
				pager=new Pager<ClientSatisfied>();
				List<ClientSatisfied> satisList=clientSatisfiedDao.getListPage(array);
				pager.setData(satisList);
				pager.setSumCount(getListCount(array));
				if (satisList==null) {
					
				} else {
					memcachedClient.set("list", 240,satisList);
					memcachedClient.set("count", 240,getListCount(array));
				}
				System.out.println("count22222"+count);
			}else{
				memcachedClient.get("list");
				memcachedClient.get("count");
				System.out.println("count11111"+count);
			}
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			e.printStackTrace();
		}
		
		
		return pager;
	}


	@Override
	public int insertSatisfied(ClientSatisfied clientSatisfied) {
		return clientSatisfiedDao.insertSatisfied(clientSatisfied);
	}


	@Override
	public int updateSatisfied(ClientSatisfied clientSatisfied) {
		return clientSatisfiedDao.updateSatisfied(clientSatisfied);
	}


	@Override
	public int deleteSatisfied(int id) {
		return clientSatisfiedDao.deleteSatisfied(id);
	}


	@Override
	public ClientSatisfied querySatisfied(int id) {
		return clientSatisfiedDao.querySatisfied(id);
	}


	@Override
	public int getListCount(Object[] array) {
		// TODO Auto-generated method stub
		return clientSatisfiedDao.getListCount(array);
	}


	

}
