package com.lxit.crm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Role;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.RoleManagerService;

/**
 * 角色管理控制层
 * 
 * @author Administrator
 *
 */
@Controller
public class RoleManagerController {

	@Autowired
	private RoleManagerService roleManagerService;

	/**
	 * 查询所有角色
	 * 
	 * @param session
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/roleSelect")
	public List<User> roleSelect(HttpSession session) {
		List<User> list = roleManagerService.roleSelectAll();
		for (int i = 0; i < list.size(); i++) {
			String values = list.get(0).getRole().getRoleName();
			list.get(0).setStates(values);
		}
		return list;
	}

	/**
	 * 增加角色
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/roleManagerAdds")
	public Role roleManagerAdds(@RequestParam("roleName") String roleName) {
		return roleManagerService.roleAdd(roleName);
	}

	/**
	 * 增加角色前的查询
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/roleManagerAddsSelect")
	public Role roleManagerAddsSelect(Role role) {
		return roleManagerService.roleAddSelect(role);
	}

	/**
	 * 修改角色
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/roleManagerUpdate")
	public Role roleManagerUpdate(Role role) {
		return roleManagerService.roleUpdate(role);
	}

	/**
	 * 删除角色
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/roleManagerDel")
	public Role roleManagerDel(@RequestParam("userId") int userId) {
		return roleManagerService.roleDel(userId);
	}
}