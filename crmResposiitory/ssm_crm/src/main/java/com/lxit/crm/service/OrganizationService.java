package com.lxit.crm.service;

import java.util.List;

import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.User;

public interface OrganizationService {

	/**
	 * 查询所有部门
	 * 
	 * @return
	 */
	List<Dept> organctionDeptSelectAll();

	/**
	 * 查询部门下的所有员工
	 * 
	 * @return
	 */
	List<User> organctionSelectAssign(int id);

	/**
	 * 查询部门
	 * 
	 * @return
	 */
	List<Dept> selectDeptCountSpan();

	/**
	 * 查询所属部门
	 * 
	 * @return
	 */
	Dept selectUnderDeptCountSpan(Dept dept);

	/**
	 * 增加部门
	 * 
	 * @return
	 */
	Dept AddUnderDeptCountSpan(Dept dept);

	/**
	 * 修改部门
	 * 
	 * @return
	 */
	Dept UpdateUnderDeptCountSpan(Dept dept);

	/**
	 * 删除部门
	 * 
	 * @return
	 */
	Dept DelUnderDeptCountSpan(Dept dept);
}
