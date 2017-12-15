package com.lxit.crm.service;

import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.Plan;
import com.lxit.crm.entity.User;

public interface SellService {
	public Pager<Plan> getPage(int pageIndex,int pageSize,String query,User user);
	
	public int save(Plan plan);
	
	public int delete(int id);
	
	public int update(Plan plan);
}
