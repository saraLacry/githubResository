package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.CareSchemeDao;
import com.lxit.crm.entity.CareScheme;
import com.lxit.crm.service.CareSchemeService;

@Service("careSchemeService")
public class CareSchemeServiceImpl implements CareSchemeService {

	@Resource
	CareSchemeDao careSchemeDao;

	public CareSchemeDao getCareSchemeDao() {
		return careSchemeDao;
	}

	public void setCareSchemeDao(CareSchemeDao careSchemeDao) {
		this.careSchemeDao = careSchemeDao;
	}

	@Override
	public List<CareScheme> getList() {
		List<CareScheme> list = careSchemeDao.getList();
		return careSchemeDao.getList();
	}

	@Override
	public int insertScheme(CareScheme careScheme) {
		return careSchemeDao.insertScheme(careScheme);
	}

	@Override
	public int updateScheme(CareScheme careScheme) {
		return careSchemeDao.updateScheme(careScheme);
	}

	@Override
	public int deleteScheme(int id) {
		return careSchemeDao.deleteScheme(id);
	}

	@Override
	public CareScheme getScheme(int id) {
		return careSchemeDao.getScheme(id);
	}
}