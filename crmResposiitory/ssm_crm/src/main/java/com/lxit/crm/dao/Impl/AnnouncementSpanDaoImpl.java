package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.AnnouncementSpanDao;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Notice;

@Repository("announcementSpanDao")
public class AnnouncementSpanDaoImpl implements AnnouncementSpanDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Notice> announcementSelectAll() {
		return sqlSessionTemplate.selectList("announcementMapper.announcementSelectAll");
	}

	@Override
	public Notice announcementAdd(Notice notice) {
		return sqlSessionTemplate.selectOne("announcementMapper.announcementAdd", notice);
	}

	@Override
	public Notice announcementUpdate(Notice notice) {
		return sqlSessionTemplate.selectOne("announcementMapper.announcementUpdate", notice);
	}

	@Override
	public Notice announcementDel(Notice notice) {
		return sqlSessionTemplate.selectOne("announcementMapper.announcementDel", notice);
	}

	@Override
	public Dictionary announcementSelectAssign(Notice notice) {
		return sqlSessionTemplate.selectOne("announcementMapper.announcementAsspiceSelect", notice);
	}

	@Override
	public List<Dictionary> announcementSelect() {
		return sqlSessionTemplate.selectList("announcementMapper.announcementSelect");
	}
}