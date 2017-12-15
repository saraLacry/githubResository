package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.BasicsmessageDao;
import com.lxit.crm.entity.Base;
import com.lxit.crm.service.BasicsmessageService;

@Service("basicsmessageService")
public class BasicsmessageServiceImpl implements BasicsmessageService {

	@Resource
	private BasicsmessageDao basicsmessageDao;

	@Override
	public List<Base> basicsmessageSelectAll() {
		return basicsmessageDao.basicsmessageSelectAll();
	}

	@Override
	public Base basicsmessageAdd(Base base) {
		return basicsmessageDao.basicsmessageAdd(base);
	}

	@Override
	public Base basicsmessageUpdate(Base base) {
		return basicsmessageDao.basicsmessageUpdate(base);
	}

	@Override
	public Base basicsmessageDel(Base base) {
		return basicsmessageDao.basicsmessageDel(base);
	}
}