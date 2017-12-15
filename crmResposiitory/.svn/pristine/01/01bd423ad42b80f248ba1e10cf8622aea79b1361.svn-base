package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.CommonIssue;
import com.lxit.crm.entity.Pager;

public interface CommonServiceDao {
	//insert一条常见服务
    public boolean  CommonInsert(CommonIssue Common);
    //删除
    public boolean Commondelete(CommonIssue Common);
    
    //修改一条常见问题
    public boolean Commondupdate(CommonIssue Common);
    
    public CommonIssue commonissueBycmId(CommonIssue commonIssue);
    //查询常见问题
    public List<CommonIssue> Commondmap(CommonIssue commonIssue);
    
    public Pager<CommonIssue> getByEasyui_Commond(int pageIndex, int pageSize,String IssueName
    		,String IssueType);
	
    public int pagerCount ();
}
