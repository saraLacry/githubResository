package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.Role;
import com.lxit.crm.entity.User;

/**
 * 角色管理dao
 * 
 * @author Administrator
 *
 */
public interface RoleManagerDao {
	/**
	 * 查询角色管理
	 * 
	 * @param loginId
	 * @return
	 */
	List<User> roleSelectAll();

	/**
	 * 增加角色
	 * 
	 * @return
	 */
	Role roleAdd(String roleName);

	/**
	 * 增加角色前的查询
	 * 
	 * @return
	 */
	Role roleAddSelect(Role role);
	
	/**
	 * 修改角色
	 * 
	 * @return
	 */
	Role roleUpdate(Role role);
	
	/**
	 * 删除角色
	 * 
	 * @return
	 */
	Role roleDel(int userId);
}