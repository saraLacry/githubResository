package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.User;

/**
 * 用户Dao
 * 
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * 登录
	 * 
	 * @param name
	 * @param pass
	 * @return
	 */
	User loginCheck(String name, String pass);
	/**
	 * 根据权限查询
	 * @param roleid
	 * @return
	 */
	List<User> getRoleUserName(int roleid);
	
}