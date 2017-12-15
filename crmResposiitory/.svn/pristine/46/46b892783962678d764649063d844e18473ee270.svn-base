package com.lxit.crm.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.RatioDao;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.Ratio;
import com.lxit.crm.service.RatioService;
@Service("ratioService")
public class RatioSerivceImpl implements RatioService {
	
	@Resource
	RatioDao ratioDao;
	
	@Override
	public Pager<Ratio> getPager(int pageIndex, int pageSize, String userName, int userId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("userName", userName);
		map.put("userId", userId);
		Pager<Ratio> pager = new Pager<Ratio>();
		
		pager.setData(ratioDao.getList(map));
		pager.setSumCount(ratioDao.getCount(map));
		
		return pager;
	}

	@Override
	public Ratio getRatio(int id) {
		return ratioDao.getRatio(id);
	}

	@Override
	public int insert(Ratio ratio) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		ratio.setLastDate(createDate);
		return ratioDao.insert(ratio);
	}

	@Override
	public int update(Ratio ratio) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		ratio.setLastDate(createDate);
		return ratioDao.update(ratio);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return ratioDao.delete(id);
	}

}
