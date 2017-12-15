package com.lxit.crm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Nav;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	public static Map<String,HttpSession> map = new HashMap<String,HttpSession>();
	/**
	 * 登录之后进入的页面
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		return "homepage";
	}

	/**
	 * 进入到登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	/*
	 * @RequestMapping("/index") public String index(HttpServletRequest
	 * request){
	 * 
	 * List<Nav> list = request.getSession().getAttribute("trees");
	 * 
	 * return "homepage"; }
	 */

	/**
	 * 登录
	 * 
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/loginCheck")
	public User loginCheck(User user, HttpServletRequest request) {
		User users = userService.loginCheck(user.getLoginId(), user.getPassWord());
		if (users != null) {
			HttpSession session = map.get(users.getUserId()+"");
			if(session!=null){
				session.invalidate();
			}
			request.getSession().setAttribute("user", users);
			map.put(users.getUserId()+"", request.getSession());
			return user;
		} else {
			return null;
		}
	}

	/**
	 * 树形菜单
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/rootTree")
	@ResponseBody
	public List<Nav> trees(@RequestParam(value = "id", required = false) Integer id, HttpServletRequest request) {
		id = id == null ? 0 : id;
		User user = (User) request.getSession().getAttribute("user");
		List<Nav> navs = new ArrayList<Nav>();
		for (Nav nav : user.getRole().getNav()) {
			if (nav.getTid() == id) {
				navs.add(nav);
			}
		}
		return navs;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}