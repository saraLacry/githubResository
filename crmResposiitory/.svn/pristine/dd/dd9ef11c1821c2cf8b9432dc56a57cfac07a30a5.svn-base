package com.lxit.crm.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crm.dao.SellDao;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.Plan;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.SellService;

@Service("sellService")
public class SellServiceImpl implements SellService {
	@Resource
	private SellDao sellDao;
	
	@Override
	public Pager<Plan> getPage(int pageIndex, int pageSize, String query,User user) {
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("query", query);
		Pager page = new Pager();
		String role = user.getRole().getRoleName();
		if(role!="系统管理员"){
			map.put("userId", user.getUserId());
		}
		page.setSumCount(sellDao.getCount(map));
		page.setData(sellDao.geteLists(map));
		return page;
	}

	@Override
	public int save(Plan plan) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		plan.setLastDate(createDate);
		return sellDao.save(plan);
	}

	@Override
	public int delete(int id) {
		return sellDao.delete(id);
		
	}

	@Override
	public int update(Plan plan) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		plan.setLastDate(createDate);
		return sellDao.update(plan);
	}

}
