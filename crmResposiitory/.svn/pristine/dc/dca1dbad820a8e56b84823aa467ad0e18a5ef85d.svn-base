package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.UserDao;
import com.lxit.crm.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public User loginCheck(String name, String pass) {
		User user = new User();
		user.setLoginId(name);
		user.setPassWord(pass);
		return sqlSessionTemplate.selectOne("User.login", user);

	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<User> getRoleUserName(int roleid) {
		return this.sqlSessionTemplate.selectList("User.getShare", roleid);
	}
}