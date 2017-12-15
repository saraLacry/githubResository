package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Dept;
import com.lxit.crm.service.OrganizationService;

/**
 * 组织结构控制层
 * 
 * @author Administrator
 *
 */
@Controller
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

	/**
	 * 查询所有部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/organizationSelectAll")
	public List<Dept> organizationSelectAll() {
		List<Dept> list = organizationService.organctionDeptSelectAll();
		return list;
	}

	/**
	 * 查询部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/selectDeptCountSpan")
	public List<Dept> selectDeptCountSpan() {
		return organizationService.selectDeptCountSpan();
	}

	/**
	 * 查询所属部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/selectBelongDept")
	public Dept selectUnderDeptCountSpan(Dept dept) {
		System.out.println(dept.getDeptId());
		Dept depts = organizationService.selectUnderDeptCountSpan(dept);
		return depts;
	}

	/**
	 * 增加部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/organzationAddDept")
	public Dept organzationAddDept(Dept dept) {
		// 获取系统当前时间
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		dept.setLasttime(createDate);
		Dept depts = organizationService.AddUnderDeptCountSpan(dept);
		return depts;
	}

	/**
	 * 修改部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/organzationUpdateDept")
	public Dept organzationUpdateDept(Dept dept) {
		// 获取系统当前时间
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		dept.setLasttime(createDate);
		Dept depts = organizationService.UpdateUnderDeptCountSpan(dept);
		return depts;
	}
	
	/**
	 * 修改部门前的查询
	 * 
	 * @return
	 */
	@RequestMapping("/organzationUpdateDeptSelect")
	public void organzationUpdateDeptSelect(Dept dept,HttpSession session) {
		session.setAttribute("deptUpdateSelect", dept);
	}
	
	/**
	 * 删除部门
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/organzationDelDept")
	public Dept organzationDelDept(Dept dept) {
		Dept depts = organizationService.DelUnderDeptCountSpan(dept);
		return depts;
	}

	/**
	 * 进入部门修改页面
	 * 
	 * @return
	 */
	@RequestMapping("/organzationsUpdate")
	public String organzationsUpdate() {
		return "organzationsUpdate";
	}

	/**
	 * 进入部门增加页面
	 * 
	 * @return
	 */
	@RequestMapping("/organzationsAdd")
	public String organzationsAdd() {
		return "organzationsAdd";
	}
}
