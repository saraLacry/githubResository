package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.Role;
import com.lxit.crm.entity.User;

/**
 * 员工dao
 * 
 * @author Administrator
 *
 */
public interface StaffDao {
	/**
	 * 增加员工
	 * 
	 * @param user
	 * @return
	 */
	User InsertsaveIdsAdd(User user);

	/**
	 * 获取部门
	 * 
	 * @param user
	 * @return
	 */
	List<Dept> getDeptSelect();
	
	/**
	 * 获取指定部门
	 * 
	 * @param user
	 * @return
	 */
	Dept getDeptSelects(User user);

	/**
	 * 获取角色
	 * 
	 * @param user
	 * @return
	 */
	List<Role> getRoleSelect();
	
	/**
	 * 查询员工
	 * 
	 * @param user
	 * @return
	 */
	List<User> getStaffSelect();
	
	/**
	 * 修改员工前查询
	 * 
	 * @return
	 */
	Role getUserUpateSelect(int userId);
	
	/**
	 * 修改员工
	 * 
	 * @return
	 */
	User staffManagerUpdateSpan(User user);
	
	/**
	 * 删除员工
	 * 
	 * @return
	 */
	User staffManagerDelSpan(User user);
	
	/**
	 * 状态修改
	 * 
	 * @return
	 */
	User staffManagerSaveInsert(User user);
}
