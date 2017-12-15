package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.service.CommonServiceDaoService;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.CommonIssue;

@Controller
public class CommonIssueController {

	@Autowired
	private CommonServiceDaoService commonServiceDaoService;

	private Pager<CommonIssue> pagelist = new Pager<>();

	
	
	@RequestMapping("/commonquery")
	public void commonquery(CommonIssue com,HttpSession  session){
		CommonIssue common = (CommonIssue)commonServiceDaoService.commonissueBycmId(com);
		session.setAttribute("common",common);
	}
	
	@RequestMapping("/commonUpdate")
	public String commonUpdate(){
		return "commonUpdate";
	}
	
	@ResponseBody
	@RequestMapping("/CommonUpdateJsp")
	public boolean  CommonUpdateJsp(CommonIssue com){
		
		return commonServiceDaoService.Commondupdate(com);
	}
	@ResponseBody
	@RequestMapping("/commondelete")
	public boolean commondelete(CommonIssue com){
	    return commonServiceDaoService.Commondelete(com);
	}
	
	@RequestMapping("/commonQueryqu")
	public String commonQueryqu(){
		return "commonQuery";
	}
	
	@RequestMapping("/commonInsertcm")
	public String commonInsert(){
		return "commonInsertcm";
	}
	
	@RequestMapping("/CommonIssue")
	public String CommonIssue() {
		return "CommonIssue";
	}

	@RequestMapping("/insertCommonIssue")
	public void insertCommonIssue(CommonIssue commonIssue){
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		commonIssue.setLastDate(createDate);
		commonIssue.setLastUpdateDate(createDate);
		commonServiceDaoService.CommonInsert(commonIssue);
	}
	
	@ResponseBody
	@RequestMapping("CommonMap")
	public Map<String, Object> CommonMap(CommonIssue commonIssue, @RequestParam(defaultValue = "5", value = "rows") int rows,
			@RequestParam(defaultValue = "1", value = "page") int page) {

		// 页数
		int compactPage = (page - 1) * rows;
		CommonIssue cIssue = new CommonIssue();
		
		cIssue.setPageIndex(rows);
		cIssue.setPageSize(compactPage);
		cIssue.setIssueName(commonIssue.getIssueName());
		cIssue.setIssueType(commonIssue.getIssueType());
		// 总条数
		int count = commonServiceDaoService.pagerCount();
		Map<String, Object> map = new HashMap<String, Object>();
		List<CommonIssue>list=commonServiceDaoService.Commondmap(cIssue);
		map.put("total", count);
		map.put("rows", list);
		return map;
	}
	public CommonServiceDaoService getCommonServiceDaoService() {
		return commonServiceDaoService;
	}

	public void setCommonServiceDaoService(CommonServiceDaoService commonServiceDaoService) {
		this.commonServiceDaoService = commonServiceDaoService;
	}

}
