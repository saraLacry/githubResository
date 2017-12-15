package com.lxit.crm.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crm.entity.ClientDevelop;

public interface ClientDevelopDao {

	/**
	 * 根据角色查询的销售计划
	 * @return
	 */
	public List<ClientDevelop> getListPage(Object[] array);
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