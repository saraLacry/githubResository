package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.RoleManagerDao;
import com.lxit.crm.entity.Role;
import com.lxit.crm.entity.User;

/**
 * 角色管理daoImpl
 * 
 * @author Administrator
 *
 */
@Repository("roleManagerDao")
public class RoleManagerDaoImpl implements RoleManagerDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<User> roleSelectAll() {
		return sqlSessionTemplate.selectList("RoleManagerMapper.roleSelect");
	}

	@Override
	public Role roleAdd(String roleName) {
		Role role = new Role();
		role.setRoleName(roleName);
		return sqlSessionTemplate.selectOne("RoleManagerMapper.roleAdd", role);
	}

	@Override
	public Role roleAddSelect(Role role) {
		return sqlSessionTemplate.selectOne("RoleManagerMapper.roleAddSelect", role);
	}

	@Override
	public Role roleUpdate(Role role) {
		return sqlSessionTemplate.selectOne("RoleManagerMapper.roleUpdates", role);
	}

	@Override
	public Role roleDel(int userId) {
		Role role = new Role();
		role.setRoleId(userId);
		return sqlSessionTemplate.selectOne("RoleManagerMapper.roleDel",role);
	}
}