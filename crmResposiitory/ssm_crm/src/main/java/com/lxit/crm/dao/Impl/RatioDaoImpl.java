package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.RatioDao;
import com.lxit.crm.entity.Ratio;

@Repository("ratioDao")
public class RatioDaoImpl implements RatioDao {
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<Ratio> getList(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Ratio.getList",map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Ratio.getCount",map);
	}

	@Override
	public Ratio getRatio(int id) {
		return sqlSessionTemplate.selectOne("Ratio.getRatio",id);
	}

	@Override
	public int update(Ratio ratio) {
		return sqlSessionTemplate.update("Ratio.update",ratio);
	}

	@Override
	public int insert(Ratio ratio) {
		return sqlSessionTemplate.insert("Ratio.insert",ratio);
	}

	@Override
	public int delete(int id) {
		return sqlSessionTemplate.delete("Ratio.delete",id);
	}

}
