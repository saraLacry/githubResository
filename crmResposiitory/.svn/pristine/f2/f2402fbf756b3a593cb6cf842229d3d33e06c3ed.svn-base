package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.UserDao;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User loginCheck(String name, String pass) {
		return userDao.loginCheck(name, pass);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> getRoleUserName(int roleid) {
		// TODO Auto-generated method stub
		return userDao.getRoleUserName(roleid);
	}

}