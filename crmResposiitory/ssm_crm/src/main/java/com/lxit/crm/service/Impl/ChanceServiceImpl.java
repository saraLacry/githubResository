package com.lxit.crm.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.ChanceDao;
import com.lxit.crm.entity.Chance;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.ChanceService;

@Service("chanceService")
public class ChanceServiceImpl implements ChanceService {

	@Resource
	 ChanceDao chanceDao;
	
	@Override
	public int insertChance(Chance chance) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		chance.setLastDateTime(createDate);
		chance.setStartDate(createDate);
		return chanceDao.insert(chance);
	}

	@Override
	public int updateChance(Chance chance) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		chance.setLastDateTime(createDate);
		return chanceDao.update(chance);
	}

	@Override
	public Pager<Chance> getPage(int pageIndex, int pageSize, String username, int userId,int deptId) {
		Pager<Chance> page = new Pager<Chance>();
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("username", username);
		if(userId>0){
			map.put("userId", userId);
		}else{
			map.put("deptId", deptId);
		}
		page.setSumCount(chanceDao.getCount(map));
		page.setData(chanceDao.getLists(map));
		return page;
	}

	@Override
	public Chance getChance(int id) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("chanceId", id);
		return chanceDao.getChance(map);
	}

}
