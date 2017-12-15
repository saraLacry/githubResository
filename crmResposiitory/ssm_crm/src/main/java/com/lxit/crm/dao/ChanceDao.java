package com.lxit.crm.dao;

import java.util.List;
import java.util.Map;

import com.lxit.crm.entity.Chance;

public interface ChanceDao {
	public int insert(Chance chance);
	
	public int update(Chance chance);
	
	public int getCount(Map<String,Object> map);
	
	public List<Chance> getLists(Map<String,Object> map);
	
	public Chance getChance(Map<String, Object> map);
}
