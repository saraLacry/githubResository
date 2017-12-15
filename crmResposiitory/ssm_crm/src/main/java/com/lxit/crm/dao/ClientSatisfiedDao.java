package com.lxit.crm.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crm.entity.ClientSatisfied;

public interface ClientSatisfiedDao {

	/**
	 * 查询所有客户的满意度信息模糊分页
	 * @return
	 */
	public List<ClientSatisfied> getListPage(Object[] array);
	/**
	 * 查询总条数
	 * @param array
	 * @return
	 */
	public int getListCount(Object[] array);
	/**
	 * 满意度信息增加
	 * @param clientSatisfied
	 * @return
	 */
	public int insertSatisfied(ClientSatisfied clientSatisfied);
	/**
	 * 满意度信息修改
	 * @param clientSatisfied
	 * @return
	 */
	public int updateSatisfied(ClientSatisfied clientSatisfied);
	/**
	 * 满意度信息删除
	 * @param clientSatisfied
	 * @return
	 */
	public int deleteSatisfied(int id);
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 */
	public ClientSatisfied querySatisfied(int id);
}
