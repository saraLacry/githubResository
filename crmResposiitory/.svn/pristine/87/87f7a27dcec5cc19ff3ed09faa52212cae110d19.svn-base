package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Role;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.StaffService;

/**
 * 员工页面进入操作层
 * 
 * @author Administrator
 *
 */
@Controller
public class StaffController {

	@Autowired
	private StaffService staffService;

	/**
	 * 进入员工查看页面
	 * 
	 * @return
	 */
	@RequestMapping("/staffManagerLook")
	public String staffManagerLook() {
		return "staffManagerLook";
	}

	/**
	 * 进入员工修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/staffManagerUpdate")
	public String staffManagerUpdate() {
		return "staffManagerUpdate";
	}

	/**
	 * 获取部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getDeptSelect")
	public List<Dept> getDeptSelect() {
		List<Dept> list = staffService.getDeptSelect();
		return list;
	}
	/**
	 * 获取指定部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getDeptSelectCount")
	public Dept getDeptSelectCount(User user) {
		System.out.println(user.getUserId());
		Dept dept = staffService.getDeptSelects(user);
		return dept;
	}

	/**
	 * 获取角色
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getRoleSelect")
	public List<Role> getRoleSelect() {
		List<Role> list = staffService.getRoleSelect();
		return list;
	}

	/**
	 * 进入员工增加页面
	 * 
	 * @return
	 */
	@RequestMapping("/staffManagerAdd")
	public String staffManagerAdd() {
		return "staffManagerAdd";
	}

	/**
	 * 员工增加
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/InsertsaveIdsAdds")
	public User InsertsaveIdsAdds(@RequestParam("userNumber") String userNumber,
			@RequestParam("userName") String userName, @RequestParam("sex") String sex,
			@RequestParam("state") String state, @RequestParam("deptId") int deptId, @RequestParam("roleId") int roleId,
			@RequestParam("remark") String remark, @RequestParam("phone") String phone) {
		System.out.println("进入员工增加...");

		// 获取系统当前时间
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

		User user = new User();
		user.setUserNumber(userNumber);
		user.setUserName(userName);
		user.setSexs(sex);
		user.setStates(state);

		user.setDeptIds(deptId);
		user.setRoleIds(roleId);
		user.setRemark(remark);
		user.setLoginId("xiaotian.login");
		user.setCreateTime(createDate);
		user.setLastTime(createDate);
		user.setPhone(phone);

		User users = staffService.InsertsaveIdsAdd(user);
		return users;
	}

	/**
	 * 查询员工
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/staffSelect")
	public List<User> staffSelect() {
		List<User> list = staffService.getStaffSelect();
		return list;
	}

	/**
	 * 修改员工前的查询
	 * 
	 * @return
	 */
	@RequestMapping("/staffUpdateSelect")
	public void staffUpdateSelect(User user, HttpSession session) {
		session.setAttribute("staffUser", user);
		Role role = staffService.getUserUpateSelect(user.getUserId());
		session.setAttribute("staffRole", role);
	}

	/**
	 * 修改员工
	 * 
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/staffManagerUpdateSpan")
	public User staffManagerUpdateSpan(User user) {
		User users = staffService.staffManagerUpdateSpan(user);
		return users;
	}

	/**
	 * 删除员工
	 * 
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/staffManagerDelSpan")
	public User staffManagerDelSpan(User user) {
		System.out.println(user.getUserId());
		User users = staffService.staffManagerDelSpan(user);
		return users;
	}
	
	@ResponseBody
	@RequestMapping("/staffManagerSaveInsert")
	public User staffManagerSaveInsert(User user){
		if ("44".equals(user.getStates())){
			user.setStates("45");
		}else{
			user.setStates("44");
		}
		User users =  staffService.staffManagerSaveInsert(user);
		return users;
	}

	public StaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
}