package com.lxit.crm.dao;

import java.util.List;
import java.util.Map;

import com.lxit.crm.entity.Ratio;

public interface RatioDao {
	public List<Ratio> getList(Map<String, Object> map);

	
	public int getCount(Map<String, Object> map);

	
	public Ratio getRatio(int id);
	    
	public int update(Ratio ratio);
	
	public int insert(Ratio ratio);
	
	public int delete(int id);
}
