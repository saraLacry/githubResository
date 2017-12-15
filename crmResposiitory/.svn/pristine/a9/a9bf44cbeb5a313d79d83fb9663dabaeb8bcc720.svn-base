package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.DictionaryDao;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.service.DictionaryService;

@WebService(endpointInterface="com.lxit.crm.service.DictionaryService")
@Service("dictionaryService")
public class DictionaryServiceImpl implements DictionaryService {
	@Resource
	DictionaryDao dictionaryDao;

	public DictionaryDao getDictionaryDao() {
		return dictionaryDao;
	}

	public void setDictionaryDao(DictionaryDao dictionaryDao) {
		this.dictionaryDao = dictionaryDao;
	}


	@Override
	public List<Dictionary> getClientStates(String dictionarycoding) {
		List<Dictionary> dict=dictionaryDao.getClientStates(dictionarycoding);
		System.out.println(dict);
		return dictionaryDao.getClientStates(dictionarycoding);
	}


	@Override
	public Dictionary getClientStatesById(int id) {
		return dictionaryDao.getClientStatesById(id);
	}


	@Override
	public Dictionary getCoumpant(String parms) {
		return dictionaryDao.getCoumpant(parms);
	}
}