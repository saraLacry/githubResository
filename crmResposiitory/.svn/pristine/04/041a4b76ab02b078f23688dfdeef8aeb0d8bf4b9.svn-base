package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.StaffDao;
import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.Role;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.StaffService;

@Service("staffService")
public class StaffServiceImpl implements StaffService {

	@Resource
	StaffDao staffDao;

	@Override
	public User InsertsaveIdsAdd(User user) {
		return staffDao.InsertsaveIdsAdd(user);
	}

	@Override
	public List<Dept> getDeptSelect() {
		return staffDao.getDeptSelect();
	}

	@Override
	public List<Role> getRoleSelect() {
		return staffDao.getRoleSelect();
	}

	public StaffDao getStaffDao() {
		return staffDao;
	}

	public void setStaffDao(StaffDao staffDao) {
		this.staffDao = staffDao;
	}

	@Override
	public List<User> getStaffSelect() {
		return staffDao.getStaffSelect();
	}

	@Override
	public Role getUserUpateSelect(int userId) {
		return staffDao.getUserUpateSelect(userId);
	}

	@Override
	public User staffManagerUpdateSpan(User user) {
		return staffDao.staffManagerUpdateSpan(user);
	}

	@Override
	public User staffManagerDelSpan(User user) {
		return staffDao.staffManagerDelSpan(user);
	}

	@Override
	public Dept getDeptSelects(User user) {
		return staffDao.getDeptSelects(user);
	}

	@Override
	public User staffManagerSaveInsert(User user) {
		return staffDao.staffManagerSaveInsert(user);
	}
}