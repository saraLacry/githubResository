package com.lxit.crm.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.ContendDao;
import com.lxit.crm.entity.Contend;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.ContendService;

@Service("contendService")
public class ContendServiceImpl implements ContendService {

	@Resource
	ContendDao contendDao;
	
	@Override
	public Pager<Contend> getPager(int pageIndex, int pageSize, String date) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		map.put("date", date);
		Pager<Contend> pager = new Pager<Contend>();
		pager.setData(contendDao.getList(map));
		pager.setSumCount(contendDao.getCount(map));
		
		return pager;
	}

	@Override
	public Contend getContend(int id) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);
		return contendDao.getContend(map);
	}

	@Override
	public int insert(Contend contend) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		contend.setStartDate(createDate);
		contend.setState(61+"");
		return contendDao.insert(contend);
	}

	@Override
	public int update(Contend contend) {
		// TODO Auto-generated method stub
		return contendDao.update(contend);
	}

}
