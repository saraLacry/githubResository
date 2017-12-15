package com.lxit.crm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Base;
import com.lxit.crm.service.BasicsmessageService;

/**
 * 基礎信息控制类
 * 
 * @author Administrator
 *
 */
@Controller
public class BasicsmessageController {

	@Resource
	private BasicsmessageService basicsmessageService;

	/**
	 * 基础信息查询
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/basicsmessageSelectAll")
	public List<Base> basicsmessageSelectAll() {
		return basicsmessageService.basicsmessageSelectAll();
	}

	/**
	 * 基础信息增加
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/basicsmessageAddBase")
	public Base basicsmessageAddBase(Base base) {
		System.out.println(base);
		return basicsmessageService.basicsmessageAdd(base);
	}

	/**
	 * 基础信息修改
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/basicsmessageUpdateBase")
	public Base basicsmessageUpdateBase(Base base) {
		System.out.println(base);
		return basicsmessageService.basicsmessageUpdate(base);
	}

	/**
	 * 基础信息删除
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/basicsmessageTDelCount")
	public Base basicsmessageTDelCount(Base base) {
		System.out.println(base);
		return basicsmessageService.basicsmessageDel(base);
	}

	/**
	 * 修改前的查询
	 * 
	 * @return
	 */
	@RequestMapping("/basicsmessageUpdateBaseSelect")
	public void basicsmessageUpdateBaseSelect(Base base, HttpSession session) {
		session.setAttribute("baseUpdateSelect", base);
	}

	/**
	 * 进入基础信息增加页面
	 * 
	 * @return
	 */
	@RequestMapping("/basicsmessageTAdd")
	public String basicsmessageTAdd() {
		return "basicsmessageTAdd";
	}

	/**
	 * 进入基础信息修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/basicsmessageTUpdate")
	public String basicsmessageTUpdate() {
		return "basicsmessageTUpdate";
	}
}
