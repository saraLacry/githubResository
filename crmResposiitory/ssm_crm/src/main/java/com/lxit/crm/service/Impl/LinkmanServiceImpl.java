package com.lxit.crm.service.Impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.LinkmanDao;
import com.lxit.crm.entity.Linkman;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.service.LinkmanService;
@Service("linkmanService")
public class LinkmanServiceImpl implements LinkmanService {

	@Resource
	private LinkmanDao linkmanDao;
	
	@Override
	public Pager<Linkman> getPage(int pageIndex, int pageSize, String linkman, int userId) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageIndex", (pageIndex-1)*pageSize);
		map.put("pageSize", pageSize);
		if(linkman!=null){
			map.put("linkman", "%"+linkman+"%");
		}
		map.put("userId", userId);
		Pager<Linkman> page = new Pager<Linkman>();
		page.setSumCount(linkmanDao.getCount(map));
		page.setData(linkmanDao.getList(map));
		return page;
	}

	@Override
	public Linkman getLinkman(int id) {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("linkmanId", id);
		return linkmanDao.getLinkman(map);
	}

	@Override
	public int save(Linkman linkman) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		linkman.setStartDate(createDate);
		return linkmanDao.save(linkman);
	}

	@Override
	public int update(Linkman linkman) {
		// TODO Auto-generated method stub
		return linkmanDao.update(linkman);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return linkmanDao.delete(id);
	}

}
