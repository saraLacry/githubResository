package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.AnalyzeDao;
import com.lxit.crm.entity.Analyze;

@Repository("analyzeDao")
public class AnalyzeDaoImpl implements AnalyzeDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Analyze> getList(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Analyze.getList", map);
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Analyze.getCount", map);
	}

	@Override
	public List<Analyze> getDept(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Analyze.getDept", map);
	}

	@Override
	public int getDeptCount(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Analyze.getDeptCount", map);
	}

	@Override
	public List<Analyze> getAllDept(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Analyze.getAllDept", map);
	}

	@Override
	public int getAllDeptCount(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Analyze.getAllDeptCount", map);
	}

	@Override
	public List<Analyze> getAllUser(Map<String, Object> map) {
		return sqlSessionTemplate.selectList("Analyze.getAllUser", map);
	}

	@Override
	public int getAllUserCount(Map<String, Object> map) {
		return sqlSessionTemplate.selectOne("Analyze.getAllUserCount", map);
	}

}
