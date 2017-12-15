package com.lxit.crm.service;

import java.util.List;

import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Notice;

public interface AnnouncementSpanService {
	/**
	 * 查询所有公告
	 * 
	 * @return
	 */
	List<Notice> announcementSelectAll();

	/**
	 * 增加公告
	 * 
	 * @return
	 */
	Notice announcementAdd(Notice notice);

	/**
	 * 修改公告
	 * 
	 * @return
	 */
	Notice announcementUpdate(Notice notice);

	/**
	 * 删除公告
	 * 
	 * @return
	 */
	Notice announcementDel(Notice notice);

	/**
	 * 查询指定公告类型
	 * 
	 * @return
	 */
	Dictionary announcementSelectAssign(Notice notice);

	/**
	 * 查询公告类型
	 * 
	 * @return
	 */
	List<Dictionary> announcementSelect();
}