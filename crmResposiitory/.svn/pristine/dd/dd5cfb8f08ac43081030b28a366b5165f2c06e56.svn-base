package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.BasicsmessageDao;
import com.lxit.crm.entity.Base;

@Repository("basicsmessageDao")
public class BasicsmessageDaoImpl implements BasicsmessageDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Base> basicsmessageSelectAll() {
		
		return sqlSessionTemplate.selectList("basicmessageMapper.basicmessageSelectAll");
	}

	@Override
	public Base basicsmessageAdd(Base base) {
		System.out.println("进入增加");
		return sqlSessionTemplate.selectOne("basicmessageMapper.basicmessageAdd",base);
	}

	@Override
	public Base basicsmessageUpdate(Base base) {
		System.out.println("进入修改");
		return sqlSessionTemplate.selectOne("basicmessageMapper.basicmessageUpdate",base);
	}

	@Override
	public Base basicsmessageDel(Base base) {
		System.out.println("进入删除");
		return sqlSessionTemplate.selectOne("basicmessageMapper.basicmessageDel",base);
	}
}