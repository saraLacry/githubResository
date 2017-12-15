package com.lxit.crm.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.PersonalInformationControllerDao;
import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.PersonalInformationControllerService;

@Service("personalInformationControllerService")
public class PersonalInformationControllerServiceImpl implements PersonalInformationControllerService {

	@Resource
	private PersonalInformationControllerDao personalInformationControllerDao;
	
	@Override
	public User loginIdUpdate(User user) {
		return personalInformationControllerDao.loginIdUpdate(user);
	}

	@Override
	public User userPhoneUpdate(User user) {
		return personalInformationControllerDao.userPhoneUpdate(user);
	}

	@Override
	public User userLoginPassUpdate(User user) {
		return personalInformationControllerDao.userLoginPassUpdate(user);
	}

	@Override
	public Dept userLoginDeptSelect(User user) {
		return personalInformationControllerDao.userLoginDeptSelect(user);
	}
}