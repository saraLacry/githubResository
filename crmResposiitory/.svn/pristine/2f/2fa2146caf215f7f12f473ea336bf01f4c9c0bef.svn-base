package com.lxit.crm.service.Impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.AnalyzeDao;
import com.lxit.crm.entity.Analyze;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.AnalyzeService;

@Service("analyzeService")
public class AnalyzeServiceImpl implements AnalyzeService {

	@Resource
	AnalyzeDao analyzeDao;
	
	@Override
	public Pager<Analyze> getPager(int pageIndex, int pageSize, String analyze, int deptId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		if(analyze!=null){
			analyze += "-01";
		}
		map.put("analyze",analyze);
		Pager<Analyze> page = new Pager<Analyze>();
		if(deptId>0){
			map.put("deptId", deptId);
			page.setData(analyzeDao.getDept(map));
			page.setSumCount(analyzeDao.getDeptCount(map));
		}else{
			page.setData(analyzeDao.getList(map));
			page.setSumCount(analyzeDao.getCount(map));
		}
		return page;
	}

	@Override
	public Pager<Analyze> queryPager(int pageIndex, int pageSize, String analyze, Integer deptId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("analyze",analyze+"-01");
		Pager<Analyze> page = new Pager<Analyze>();
		if(deptId!=null){
			map.put("deptId", deptId);
			page.setData(analyzeDao.getAllUser(map));
			page.setSumCount(analyzeDao.getAllUserCount(map));
		}else{
			page.setData(analyzeDao.getAllDept(map));
			page.setSumCount(analyzeDao.getAllDeptCount(map));
		}
		System.out.println(page.getData());
		return page;
	}

}
