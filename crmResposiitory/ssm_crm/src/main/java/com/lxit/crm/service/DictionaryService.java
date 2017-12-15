package com.lxit.crm.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.lxit.crm.entity.Dictionary;

@WebService
public interface DictionaryService {

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

	@WebMethod
	/**
	 * 查询数据字典的参数名
	 * @param parms
	 * @return
	 */
	public Dictionary getCoumpant(String parms);
}