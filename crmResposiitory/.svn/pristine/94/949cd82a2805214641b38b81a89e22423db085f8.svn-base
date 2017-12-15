package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Notice;
import com.lxit.crm.service.AnnouncementSpanService;

/**
 * 公告控制类
 * 
 * @author Administrator
 *
 */
@Controller
public class AnnouncementSpanController {

	@Autowired
	private AnnouncementSpanService announcementSpanService;

	/**
	 * 查询所有公告
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/announcementSelectAll")
	public List<Notice> announcementSelectAll() {
		return announcementSpanService.announcementSelectAll();
	}

	/**
	 * 增加所有公告
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/announcementSpanAdds")
	public Notice announcementSpanAdds(Notice notice) {
		// 获取系统当前时间
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		notice.setCreateTime(createDate);
		System.out.println(notice.toString());
		return announcementSpanService.announcementAdd(notice);
	}

	/**
	 * 修改所有公告
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/announcementSpanUpdates")
	public Notice announcementSpanUpdates(Notice notice) {
		// 获取系统当前时间
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		notice.setCreateTime(createDate);
		return announcementSpanService.announcementUpdate(notice);
	}

	/**
	 * 删除所有公告
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/announcementDelAnnend")
	public Notice announcementDelAnnend(Notice notice) {
		return announcementSpanService.announcementDel(notice);
	}

	/**
	 * 查询指定数据类型
	 * 
	 * @return
	 */
	@RequestMapping("/announcementSpanLooks")
	public void announcementSpanLooks(Notice notice, HttpSession session) {
		session.setAttribute("annLooks", notice);
	}

	/**
	 * 查询指定公告
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/announcementSpanLooksType")
	public Dictionary announcementSpanLooksType(Notice notice) {
		return announcementSpanService.announcementSelectAssign(notice);
	}

	/**
	 * 查询指定公告
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/announcementSpanDictType")
	public List<Dictionary> announcementSpanDictType() {
		return announcementSpanService.announcementSelect();
	}

	/**
	 * 进入增加页面
	 * 
	 * @return
	 */
	@RequestMapping("/announcementSpanAdd")
	public String announcementSpanAdd() {
		return "announcementSpanAdd";
	}

	/**
	 * 进入修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/announcementSpanUpdate")
	public String announcementSpanUpdate() {
		return "announcementSpanUpdate";
	}

	/**
	 * 进入查看页面
	 * 
	 * @return
	 */
	@RequestMapping("/announcementSpanLook")
	public String announcementSpanLook() {
		return "announcementSpanLook";
	}
}
