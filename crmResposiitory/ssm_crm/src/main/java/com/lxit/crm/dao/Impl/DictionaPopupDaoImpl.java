package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.DictionaPopupDao;
import com.lxit.crm.entity.Dictionary;

@Repository("dictionaPopupDao")
public class DictionaPopupDaoImpl implements DictionaPopupDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Dictionary> dictionariesSelectAll(Dictionary dictionary) {
		return sqlSessionTemplate.selectList("dictionariecMapper.dictionarySelctAll",dictionary);
	}

	@Override
	public Dictionary dictionariesAdd(Dictionary dictionary) {
		return sqlSessionTemplate.selectOne("dictionariecMapper.dictionaryAdd", dictionary);
	}

	@Override
	public Dictionary dictionariesUpdate(Dictionary dictionary) {
		return sqlSessionTemplate.selectOne("dictionariecMapper.dictionaryUpdate", dictionary);
	}

	@Override
	public Dictionary dictionariesDel(Dictionary dictionary) {
		return sqlSessionTemplate.selectOne("dictionariecMapper.dictionaryDel", dictionary);
	}

	@Override
	public Integer dictionariesSelectCount() {
		return sqlSessionTemplate.selectOne("dictionariecMapper.dictionarySelectCount");
	}
}