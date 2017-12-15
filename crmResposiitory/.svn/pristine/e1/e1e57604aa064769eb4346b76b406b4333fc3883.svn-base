package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.CommonServiceDao;
import com.lxit.crm.entity.CommonIssue;
import com.lxit.crm.entity.Pager;
import com.mchange.v2.sql.filter.SynchronizedFilterCallableStatement;

@Repository("CommonServiceDao")
public class CommonServiceDaoImpl implements CommonServiceDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public boolean CommonInsert(CommonIssue Common) {

		return sqlSessionTemplate.insert("CommonIssueMapper.insertCommonIssue", Common) > 0;
	}

	@Override
	public boolean Commondelete(CommonIssue Common) {
		return sqlSessionTemplate.delete("CommonIssueMapper.CommonIssuedelete", Common) > 0;
	}

	@Override
	public boolean Commondupdate(CommonIssue Common) {
		sqlSessionTemplate.update("CommonIssueMapper.CommonIssueupdate", Common);
		return true;
	}

	@Override
	public List<CommonIssue> Commondmap(CommonIssue commonIssue) {
		List<CommonIssue> list = sqlSessionTemplate.selectList("CommonIssueMapper.CommonInssquery", commonIssue);
		return list;
	}

	@Override
	public Pager<CommonIssue> getByEasyui_Commond(int pageIndex, int pageSize, String IssueName, String IssueType) {
		return sqlSessionTemplate.selectOne("CommonIssueMapper.CommonInssMap");
	}

	@Override
	public int pagerCount() {
		return (int) sqlSessionTemplate.selectOne("CommonIssueMapper.CommonInssqueryCount");

	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public CommonIssue commonissueBycmId(CommonIssue commonIssue) {

		CommonIssue commonIss = sqlSessionTemplate.selectOne("CommonIssueMapper.CommonInssqueryqyqy", commonIssue);
		return commonIss;
	}
}