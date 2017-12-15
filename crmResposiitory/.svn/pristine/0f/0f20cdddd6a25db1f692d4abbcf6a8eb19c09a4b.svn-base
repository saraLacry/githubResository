package com.lxit.crm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxit.crm.entity.User;

/**
 * 注销
 * 
 * @author Administrator
 *
 */
@Controller
public class LogOutController {
	/**
	 * 注销
	 * 
	 * @return
	 */
	@RequestMapping("/zhuxiao")
	public String zhuxiao(HttpSession session) {
		session.removeAttribute("user");
		return "login";
	}
}