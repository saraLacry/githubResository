package com.lxit.crm.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.CilentResourceDao;
import com.lxit.crm.dao.IndentgoodsDao;
import com.lxit.crm.entity.ClientResource;
import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.Indentgoods;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.CilentResourceService;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;

@Service("cilentResourceService")
public class CilentResourceServiceImpl implements CilentResourceService {

	@Resource
	CilentResourceDao cilentResourceDao;
	@Resource
	IndentgoodsDao indentGoodsDao;
	@Resource
	MemcachedClient memcachedClient;
	
	
	public CilentResourceDao getCilentResourceDao() {
		return cilentResourceDao;
	}


	public void setCilentResourceDao(CilentResourceDao cilentResourceDao) {
		this.cilentResourceDao = cilentResourceDao;
	}


	@Override
	public List<ClientResource> getList() {
		List<ClientResource> resourceList=cilentResourceDao.getList();
		
		return resourceList;
	}


	@Override
	public Pager<ClientResource> listClientResource(Object[] array) {
		int pageIndex = (int) array[2];
		int pageSize = (int) array[3];
		array[2]=( (pageIndex - 1) * pageSize);
		
		List<ClientResource> list=  cilentResourceDao.listClientResource(array);
		Pager<ClientResource> pager = new Pager<ClientResource>();
		pager.setData(list);
		pager.setSumCount(getSubjectCount(array));
		return pager;
		
	}
	
	@Override
	public Pager<ClientResource> listClientResource2(Object[] array) {
		
		int pageIndex = (int) array[1];
		int pageSize = (int) array[2];
		array[1]=( (pageIndex - 1) * pageSize);
		array[2] = ( pageIndex * pageSize);
		Pager<ClientResource> pager=null;
		try {
			Object satisList=memcachedClient.get("satisList");
			Object like=memcachedClient.get("like");
			Object count=memcachedClient.get("count");
			System.out.println(satisList+"//////");
			if (satisList==null&&count==null||like!=null) {
				List<ClientResource> list=  cilentResourceDao.listClientResource2(array);
				pager = new Pager<ClientResource>();
				pager.setData(list);
				pager.setSumCount(getSubjectCount(array));
				if (list!=null) {
					memcachedClient.set("satisList", 240,list);
					memcachedClient.set("count", 240,getSubjectCount(array));
				}
			}else{
				pager = new Pager<ClientResource>();
				pager.setData((List<ClientResource>) memcachedClient.get("satisList"));
				pager.setSumCount((int) memcachedClient.get("count"));
			}
		} catch (TimeoutException | InterruptedException | MemcachedException e) {
			e.printStackTrace();
		}
		
		return pager;
	}


	public int getSubjectCount(Object[] array) {
		return cilentResourceDao.getClientResourceCount(array);
	}


	@Override
	public Pager<ClientResource> getResourcePage(Object[] array) {
		List<ClientResource> list=  cilentResourceDao.getResourcePage(array);
		System.out.println("aaaaa"+list);
		for (ClientResource clientResource : list) {
			System.out.println(clientResource);
		}
		Pager<ClientResource> pager = new Pager<ClientResource>();
		pager.setData(list);
		pager.setSumCount(getClientResourceCount2(array));
		return pager;
	}


	@Override
	public ClientResource getClientResourceById(int id) {
		return cilentResourceDao.getClientResourceById(id);
	}
	
	@Override
	public ClientResource getClientResourceById2(int id) {
		
		return cilentResourceDao.getClientResourceById2(id);
	}


	@Override
	public int addClient(ClientResource clientResource) {
		return cilentResourceDao.addClient(clientResource);
	}


	@Override
	public int updateClient(ClientResource clientResource) {
		return cilentResourceDao.updateClient(clientResource);
	}


	@Override
	public int deleteClient(int id) {
		return cilentResourceDao.deleteClient(id);
	}


	@Override
	public Pager<ClientResource> getLike(int page,int rows,String str) {
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("page", (( page - 1) * rows));
		map.put("rows", page * rows);
		List<ClientResource> list=  cilentResourceDao.getLike(page, rows, str);
		System.out.println(list);
		for (ClientResource clientResource : list) {
			System.out.println(clientResource);
		}
		Pager<ClientResource> pager = new Pager<ClientResource>();
		pager.setData(list);
		pager.setPageIndex(page);
		pager.setPageSize(rows);
		pager.setSumCount(getSubjectCount(null));
		return pager;
	}
	
	
	@Override
	public ClientResource getResoureceById(int id) {
		return cilentResourceDao.getResoureceById(id);
	}


	@Override
	public int updateUserId(int userId,String clientCode) {
		return cilentResourceDao.updateUserId(userId,clientCode);
	}


	@Override
	public int getClientResourceCount2(Object[] array) {
	
		return cilentResourceDao.getClientResourceCount2(array);
	}


	@Override
	public int updateClientIndent(ClientResource clientResource) {
		return cilentResourceDao.updateClientIndent(clientResource);
	}
}
