package com.lxit.crm.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.AnnouncementSpanDao;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Notice;
import com.lxit.crm.service.AnnouncementSpanService;

@Service("announcementSpanService")
public class AnnouncementSpanServiceImpl implements AnnouncementSpanService {

	@Resource
	private AnnouncementSpanDao announcementSpanDao;

	@Override
	public List<Notice> announcementSelectAll() {
		return announcementSpanDao.announcementSelectAll();
	}

	@Override
	public Notice announcementAdd(Notice notice) {
		return announcementSpanDao.announcementAdd(notice);
	}

	@Override
	public Notice announcementUpdate(Notice notice) {
		return announcementSpanDao.announcementUpdate(notice);
	}

	@Override
	public Notice announcementDel(Notice notice) {
		return announcementSpanDao.announcementDel(notice);
	}

	@Override
	public Dictionary announcementSelectAssign(Notice notice) {
		return announcementSpanDao.announcementSelectAssign(notice);
	}

	@Override
	public List<Dictionary> announcementSelect() {
		return announcementSpanDao.announcementSelect();
	}
}