package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.ClientCare;

public interface ClientCareDao {

	/**
	 * 查询所有的客户关怀信息
	 * 
	 * @return
	 */
	public List<ClientCare> getList();
	/**
	 * 增加客户关怀信息
	 * @param clientCare
	 * @return
	 */
	public int insertCare(ClientCare clientCare);
	/**
	 * 修改客户关怀信息
	 * @param clientCare
	 * @return
	 */
	public int updateCare(ClientCare clientCare);
	/**
	 * 删除客户关怀信息
	 * @param id
	 * @return
	 */
	public int deleteCare(int id);
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 */
	public ClientCare getCare(int id);
}