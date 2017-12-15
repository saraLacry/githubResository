package com.lxit.crm.dao.Impl;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.PersonalInformationControllerDao;
import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.User;

@Repository("personalInformationControllerDao")
public class PersonalInformationControllerDaoImpl implements PersonalInformationControllerDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public User loginIdUpdate(User user) {
		return sqlSessionTemplate.selectOne("personlMapper.personlLoginUpdate",user);
	}

	@Override
	public User userPhoneUpdate(User user) {
		return sqlSessionTemplate.selectOne("personlMapper.personPhoneUpdate",user);
	}

	@Override
	public User userLoginPassUpdate(User user) {
		return sqlSessionTemplate.selectOne("personlMapper.personLoginPassUpdate",user);
	}

	@Override
	public Dept userLoginDeptSelect(User user) {
		return sqlSessionTemplate.selectOne("personlMapper.personLoginDeptSelect",user);
	}

}
