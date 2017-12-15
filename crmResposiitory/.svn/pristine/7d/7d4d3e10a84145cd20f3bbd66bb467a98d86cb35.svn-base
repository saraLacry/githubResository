package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.IndentDao;
import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.StatisticsIndent;

@Repository("indentDao")
public class IndentDaoImpl implements IndentDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<Indent> getIndentList(Object[] array) {
		return  this.sqlSessionTemplate.selectList("Indent.getListIndent",array);
	}

	@Override
	public int getIndentListCount(Object[] array) {
		return this.sqlSessionTemplate.selectOne("Indent.getListIndentcount",array);
		
	}

	@Override
	public Indent getIndentById(int indentId) {
		return this.sqlSessionTemplate.selectOne("Indent.getListIndentById",indentId);
	}

	@Override
	public int insertIndent(Indent indent) {
		return this.sqlSessionTemplate.insert("Indent.addIndent",indent);
	}

	@Override
	public List<StatisticsIndent> getListstatistics(Object[] array) {
		return this.sqlSessionTemplate.selectList("StatisticsIndent.getListstatistics",array);
	}

	@Override
	public int getStatisticsIndentCount(Map<String, Object> map) {
		return this.sqlSessionTemplate.selectOne("StatisticsIndent.getListstatisticsCount",map);
	}

}
