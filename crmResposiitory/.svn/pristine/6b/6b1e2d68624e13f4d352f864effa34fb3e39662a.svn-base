package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.CommonServiceDao;
import com.lxit.crm.entity.CommonIssue;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.CommonServiceDaoService;

@Service("CommonServiceDaoService")
public class CommonServiceDaoServiceImpl implements CommonServiceDaoService{

	@Resource
	private CommonServiceDao commonServiceDao;
	@Override
	public boolean CommonInsert(CommonIssue Common) {
		return commonServiceDao.CommonInsert(Common);
	}

	@Override
	public boolean Commondelete(CommonIssue Common) {
		return commonServiceDao.Commondelete(Common);
	}

	@Override
	public boolean Commondupdate(CommonIssue Common) {
		return commonServiceDao.Commondupdate(Common);
	}

	@Override
	public List<CommonIssue> Commondmap(CommonIssue commonIssue) {
		return commonServiceDao.Commondmap(commonIssue);
	}

	@Override
	public Pager<CommonIssue> getByEasyui_Commond(int pageIndex, int pageSize, String IssueName, String IssueType) {
		return commonServiceDao.getByEasyui_Commond(pageIndex, pageSize, IssueName, IssueType);
	}

	@Override
	public int pagerCount() {
		return commonServiceDao.pagerCount();
	}

	public CommonServiceDao getCommonServiceDao() {
		return commonServiceDao;
	}

	public void setCommonServiceDao(CommonServiceDao commonServiceDao) {
		this.commonServiceDao = commonServiceDao;
	}

	@Override
	public CommonIssue commonissueBycmId(CommonIssue commonIssue) {
		return commonServiceDao.commonissueBycmId(commonIssue);
	}
	
	
    
}
