package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.OrganizationDao;
import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.OrganizationService;

@Service("organizationService")
public class OrganizationServiceImpl implements OrganizationService {
	
	@Resource
	private OrganizationDao organizationDao;

	@Override
	public List<Dept> organctionDeptSelectAll() {
		return organizationDao.organctionDeptSelectAll();
	}

	@Override
	public List<User> organctionSelectAssign(int id) {
		return organizationDao.organctionSelectAssign(id);
	}

	@Override
	public List<Dept> selectDeptCountSpan() {
		return organizationDao.selectDeptCountSpan();
	}

	@Override
	public Dept selectUnderDeptCountSpan(Dept dept) {
		return organizationDao.selectUnderDeptCountSpan(dept);
	}

	@Override
	public Dept AddUnderDeptCountSpan(Dept dept) {
		return organizationDao.AddUnderDeptCountSpan(dept);
	}

	@Override
	public Dept UpdateUnderDeptCountSpan(Dept dept) {
		return organizationDao.UpdateUnderDeptCountSpan(dept);
	}

	@Override
	public Dept DelUnderDeptCountSpan(Dept dept) {
		return organizationDao.DelUnderDeptCountSpan(dept);
	}

}