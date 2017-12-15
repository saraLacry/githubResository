package com.lxit.crm.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.lxit.crm.entity.ClientDevelop;
import com.lxit.crm.entity.Pager;

@WebService
public interface ClientDevelopService {

	/**
	 * 查询所有的销售计划
	 * @return
	 */
	@WebMethod
	public Pager<ClientDevelop> getListPage(Object[] array);
	/**
	 * 根据角色查询的销售计划的条数
	 * @return
	 */
	public int getDevelopCount(Object[] array);
	/**
	 * 增加一项发展计划
	 * @param clientDevelop
	 * @return
	 */
	public int insertPlan(ClientDevelop clientDevelop);
	/**
	 * 修改一项发展计划
	 * @param clientDevelop
	 * @return
	 */
	public int updatePlan(ClientDevelop clientDevelop);
	/**
	 * 删除发展计划
	 * @param id
	 * @return
	 */
	public int delectPlan(int id);
	/**
	 * 查询一项计划
	 * @param id
	 * @return
	 */
	public ClientDevelop getPlanById(int id);
}
