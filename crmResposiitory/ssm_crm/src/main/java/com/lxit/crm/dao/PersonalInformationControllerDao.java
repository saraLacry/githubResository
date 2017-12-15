package com.lxit.crm.dao;

import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.User;

/**
 * 个人信息Dao
 * @author Administrator
 *
 */
public interface PersonalInformationControllerDao {
	
	/**
	 * 修改登录Id
	 * @param user
	 * @return
	 */
	User loginIdUpdate(User user);
	
	/**
	 * 修改手机号
	 * @param user
	 * @return
	 */
	User userPhoneUpdate(User user);
	
	/**
	 * 修改密码
	 * 
	 * @param user
	 * @return
	 */
	User userLoginPassUpdate(User user);
	
	/**
	 * 查询部门
	 * 
	 * @param user
	 * @return
	 */
	Dept userLoginDeptSelect(User user);
}