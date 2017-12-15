package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.ClientResource;

public interface CilentResourceDao {

	/**
	 * 查询所有的客户信息
	 * 
	 * @return
	 */
	public List<ClientResource> getList();

	/**
	 * 客户信息分页（代下订单）
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	
	List<ClientResource> listClientResource(Object[] array);
	
	/**
	 * 客户信息分页（订单，满意度）
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	
	List<ClientResource> listClientResource2(Object[] array);
	
	/**
	 * 客户信息分页总数（代下订单）
	 * @return
	 */
	public int getClientResourceCount(Object[] array);
	/**
	 * 客户信息分页总数（客户信息）
	 * @param array
	 * @return
	 */
	public int getClientResourceCount2(Object[] array);
	
	/**
	 * 根据主键查询客户对象
	 * @param id
	 * @return
	 */
	public ClientResource getClientResourceById(int id);
	
	/**
	 * 根据主键查询客户对象,订单，满意度
	 * @param id
	 * @return
	 */
	public ClientResource getClientResourceById2(int id);
	/**
	 * 客户信息分页（客户资源管理）
	 * @param page
	 * @param rows
	 * @return
	 */
	List<ClientResource> getResourcePage(Object[] array);
	/**
	 * 客户增加
	 * @param clientResource
	 * @return
	 */
	public int addClient(ClientResource clientResource);
	/**
	 * 客户修改
	 * @param clientResource
	 * @return
	 */
	public int updateClient(ClientResource clientResource);
	/**
	 * 用户删除
	 * @param clientResource
	 * @return
	 */
	public int deleteClient(int id);
	/**
	 * 模糊查询
	 * @param str
	 * @return
	 */
	public List<ClientResource> getLike(int page,int rows,String str);
	/**
	 * 根据主键查询所有的数据
	 * @param id
	 * @return
	 */
	public ClientResource getResoureceById(int id);
	/**
	 * 通过唯一标识去修改userid
	 * @param id
	 * @return
	 */
	public int updateUserId(int userId,String clientCode);
	
	
	/**
	 * 客户订单修改
	 * @param clientResource
	 * @return
	 */
	public int updateClientIndent(ClientResource clientResource);
	
}
