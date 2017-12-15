package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.DictionaPopupDao;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.service.DictionaPopupService;

@Service("dictionaPopupService")
public class DictionaPopupServiceImpl implements DictionaPopupService {

	@Resource
	private DictionaPopupDao dictionaPopupDao;

	@Override
	public List<Dictionary> dictionariesSelectAll(Dictionary dictionary) {
		return dictionaPopupDao.dictionariesSelectAll(dictionary);
	}

	@Override
	public Dictionary dictionariesAdd(Dictionary dictionary) {
		return dictionaPopupDao.dictionariesAdd(dictionary);
	}

	@Override
	public Dictionary dictionariesUpdate(Dictionary dictionary) {
		return dictionaPopupDao.dictionariesUpdate(dictionary);
	}

	@Override
	public Dictionary dictionariesDel(Dictionary dictionary) {
		return dictionaPopupDao.dictionariesDel(dictionary);
	}

	@Override
	public Integer dictionariesSelectCount() {
		return dictionaPopupDao.dictionariesSelectCount();
	}
}