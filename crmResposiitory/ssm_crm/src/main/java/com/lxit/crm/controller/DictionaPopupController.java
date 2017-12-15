package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.service.DictionaPopupService;

/**
 * 数据字典控制类
 * 
 * @author Administrator
 *
 */
@Controller
public class DictionaPopupController {

	@Autowired
	private DictionaPopupService dictionaPopupService;

	/**
	 * 查询所有数据字典
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/dictionariesSelectAll")
	public Map<String, Object> dictionariesSelectAll(@RequestParam(defaultValue = "5", value = "rows") int rows,
			@RequestParam(defaultValue = "1", value = "page") int page) {
		// 页数
		int compactPage = (page - 1) * rows;
		Dictionary dictionary = new Dictionary();
		dictionary.setPageIndex(rows);
		dictionary.setPageSize(compactPage);

		List<Dictionary> list = dictionaPopupService.dictionariesSelectAll(dictionary);
		Map<String, Object> map = new HashMap<String, Object>();
		// 总条数
		int count = dictionaPopupService.dictionariesSelectCount();
		map.put("total", count);
		map.put("rows", list);
		return map;
	}

	/**
	 * 数据字典增加
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/dictionaAddDisc")
	public Dictionary dictionaAddDisc(Dictionary dictionary) {
		// 获取系统当前时间
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		dictionary.setLastTime(createDate);
		return dictionaPopupService.dictionariesAdd(dictionary);
	}

	/**
	 * 数据字典修改
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/dictionaUpdateDisc")
	public Dictionary dictionaUpdateDisc(Dictionary dictionary) {
		// 获取系统当前时间
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		dictionary.setLastTime(createDate);
		return dictionaPopupService.dictionariesUpdate(dictionary);
	}

	/**
	 * 数据字典删除
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/dictionaDelDisc")
	public Dictionary dictionaDelDisc(Dictionary dictionary) {
		return dictionaPopupService.dictionariesDel(dictionary);
	}

	/**
	 * 进入数据字典增加
	 * 
	 * @return
	 */
	@RequestMapping("/dictionaPopupAdd")
	public String dictionaPopupAdd() {
		return "dictionaPopupAdd";
	}

	/**
	 * 进入数据字典修改
	 * 
	 * @return
	 */
	@RequestMapping("/dictionaPopupUpdate")
	public String dictionaPopupUpdate() {
		return "dictionaPopupUpdate";
	}

	/**
	 * 修改前的查询
	 * 
	 * @return
	 */
	@RequestMapping("/dictionaUpdateDiscSelect")
	public void dictionaUpdateDiscSelect(Dictionary dictionary, HttpSession session) {
		session.setAttribute("dictionaryUpdateSelect", dictionary);
	}
}