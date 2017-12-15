package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.Dictionary;

public interface DictionaryDao {

	/**
	 * 查询客户状态
	 * @return
	 */
	public List<Dictionary> getClientStates(String dictionarycoding);
	/**
	 * 根据主键查询参数值
	 * @return
	 */
	public Dictionary getClientStatesById(int id);
	
	/**
	 * 查询数据字典的参数名
	 * @param parms
	 * @return
	 */
	public Dictionary getCoumpant(String parms);
}
