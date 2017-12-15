package com.lxit.crm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.PersonalInformationControllerService;

@Controller
public class PersonalInformationController {

	@Autowired
	private PersonalInformationControllerService personalInformationControllerService;

	/**
	 * 修改登录Id
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/personalInformationLoginId")
	public User personalInformationLoginId(User user) {
		User users = personalInformationControllerService.loginIdUpdate(user);
		return users;
	}

	/**
	 * 修改手机号
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/personalInformationPhone")
	public User personalInformationPhone(User user) {
		User useres = personalInformationControllerService.userPhoneUpdate(user);
		return useres;
	}

	/**
	 * 修改密码
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/loginPassUpdate")
	public User loginPassUpdate(User user) {
		System.out.println(user.getPassWord() + "------>" + user.getUserId());
		User useres = personalInformationControllerService.userLoginPassUpdate(user);
		return useres;
	}
	
	/**
	 * 查询部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/loginDeptIdSelect")
	public Dept loginDeptIdSelect(User user,HttpSession session) {
		Dept dept = personalInformationControllerService.userLoginDeptSelect(user);
		session.setAttribute("userDept",dept);
		return dept;
	}
}