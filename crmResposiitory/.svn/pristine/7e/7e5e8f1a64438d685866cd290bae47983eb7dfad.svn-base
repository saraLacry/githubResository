package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.RoleManagerDao;
import com.lxit.crm.entity.Role;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.RoleManagerService;

@Service("roleManagerService")
public class RoleManagerServiceImpl implements RoleManagerService {

	@Resource
	private RoleManagerDao roleManagerDao;

	@Override
	public List<User> roleSelectAll() {
		return roleManagerDao.roleSelectAll();
	}

	@Override
	public Role roleAdd(String roleName) {
		return roleManagerDao.roleAdd(roleName);
	}

	@Override
	public Role roleAddSelect(Role role) {
		return roleManagerDao.roleAddSelect(role);
	}

	@Override
	public Role roleUpdate(Role role) {
		return roleManagerDao.roleUpdate(role);
	}

	@Override
	public Role roleDel(int userId) {
		return roleManagerDao.roleDel(userId);
	}
}