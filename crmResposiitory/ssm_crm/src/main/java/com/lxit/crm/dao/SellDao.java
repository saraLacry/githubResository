package com.lxit.crm.dao;

import java.util.List;
import java.util.Map;

import com.lxit.crm.entity.Plan;

public interface SellDao {
	public int getCount(Map<String,Object> map);
	
	public List<Plan> geteLists(Map<String,Object> map);
	
	public int save(Plan plan); 
	
	public int delete(int id);
	
	public int update(Plan plan);
	
}
