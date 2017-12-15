package com.lxit.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统设置跳转页面/操作控制类
 * 
 * @author Administrator
 *
 */
@Controller
public class SystemManagerController {

	/**
	 * 进入角色管理页面
	 * 
	 * @return
	 */
	@RequestMapping("/roleManage")
	public String roleManage() {
		return "roleManage";
	}

	/**
	 * 进入组织管理页面
	 * 
	 * @return
	 */
	@RequestMapping("/organizationStructure")
	public String organizationStructure() {
		return "organizationStructure";
	}

	/**
	 * 进入公告管理页面
	 * 
	 * @return
	 */
	@RequestMapping("/announcementManage")
	public String announcementManage() {
		return "announcementManage";
	}

	/**
	 * 进入员工管理页面
	 * 
	 * @return
	 */
	@RequestMapping("/staffManage")
	public String staffManage() {
		return "staffManage";
	}

	/**
	 * 进入数据字典页面
	 * 
	 * @return
	 */
	@RequestMapping("/dictionaries")
	public String dictionaries() {
		return "dictionaries";
	}

	/**
	 * 进入基础信息页面
	 * 
	 * @return
	 */
	@RequestMapping("/basicsmessage")
	public String basicsmessage() {
		return "basicsmessage";
	}

	/**
	 * 进入个人信息页面
	 * 
	 * @return
	 */
	@RequestMapping("/personage")
	public String personage() {
		return "personage";
	}

	/**
	 * 进入个人信息密码修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/personageUpdate")
	public String personageUpdate() {
		return "personageUpdate";
	}

	/**
	 * 进入角色修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/roleManageUpdate")
	public String roleManageUpdate() {
		return "roleManageUpdate";
	}
	/**
	 * 进入角色增加页面
	 * 
	 * @return
	 */
	@RequestMapping("/roleManageAdd")
	public String roleManageAdd() {
		return "roleManageAdd";
	}
	/**
	 * 进入角色授权页面
	 * 
	 * @return
	 */
	@RequestMapping("/roleManageShouquan")
	public String roleManageShouquan() {
		return "roleManageShouquan";
	}
}