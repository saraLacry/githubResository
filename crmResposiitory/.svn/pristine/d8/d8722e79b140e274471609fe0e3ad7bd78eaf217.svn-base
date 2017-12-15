package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.CareScheme;
import com.lxit.crm.entity.ClientCare;
import com.lxit.crm.entity.ClientDevelop;
import com.lxit.crm.entity.ClientResource;
import com.lxit.crm.entity.ClientSatisfied;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.CareSchemeService;
import com.lxit.crm.service.CilentResourceService;
import com.lxit.crm.service.ClientCareService;
import com.lxit.crm.service.ClientDevelopService;
import com.lxit.crm.service.ClientSatisfiedService;
import com.lxit.crm.service.DictionaryService;
import com.lxit.crm.service.UserService;

@Controller
public class ClientController {

	@Autowired
	CilentResourceService cilentResourceService;
	@Autowired
	ClientDevelopService clientDevelopService;
	@Autowired
	ClientCareService clientCareService;
	@Autowired
	ClientSatisfiedService clientSatisfiedService;
	@Autowired
	CareSchemeService careSchemeService;
	@Autowired
	DictionaryService dictionaryService;
	@Autowired
	UserService userService;
	// 获取当前时间
	String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

	@RequestMapping("/clientResource")
	public String clientResource() {
		return "clientResource";
	}

	@RequestMapping("/clientDevlop")
	public String clientDevlop() {
		return "clientDevlop";
	}

	@RequestMapping("/clientWorth")
	public String clientWorth() {
		return "clientWorth";
	}

	@RequestMapping("/clientSatisfied")
	public String clientSatisfied() {
		return "clientSatisfied";
	}

	@RequestMapping("/clientCredit")
	public String clientCredit() {
		return "clientCredit";
	}

	@RequestMapping("/clientCare")
	public String clientCare() {
		return "clientCare";
	}

	@ResponseBody
	@RequestMapping("/resourceList")
	public Map<String, Object> resourceList(String name, String valu, String shareStatus, int page, int rows,
			HttpServletRequest request) {
		System.out.println(name + " " + valu + " " + shareStatus + " " + page + " " + rows);
		int pages = (page - 1) * rows;
		User user = (User) request.getSession().getAttribute("user");
		System.out.println("roleName::::" + user.getRole().getRoleName());
		Object[] array = { name, valu, shareStatus, pages, rows, user.getRole().getRoleName(), user.getUserId(), 40 };
		System.out.println(array);
		Map<String, Object> map = new HashMap<String, Object>();
		Pager<ClientResource> resourceList = cilentResourceService.getResourcePage(array);
		map.put("total", resourceList.getSumCount());// 总条数
		map.put("rows", resourceList.getData());// 数据
		for (ClientResource it : resourceList.getData()) {
			System.out.println(it);
		}
		System.out.println("map:::" + map);
		System.out.println(resourceList.getData());
		return map;
	}

	@ResponseBody
	@RequestMapping("/clientStates")
	public List<Dictionary> clientStates(String str) {
		System.out.println(str);
		List<Dictionary> dictList = dictionaryService.getClientStates(str);
		System.out.println(dictList);
		return dictList;
	}

	@ResponseBody
	@RequestMapping("/userRole")
	public List<User> userRole(int roleid) {
		List<User> userList = userService.getRoleUserName(roleid);
		System.out.println(userList);
		return userList;
	}

	@ResponseBody
	@RequestMapping("/clientQuery")
	public ClientResource clientQuery(int id) {
		System.out.println("clientQuery");
		System.out.println(id);
		ClientResource clientResource = new ClientResource();
		clientResource.setId(id);

		ClientResource resource = cilentResourceService.getResoureceById(clientResource.getId());
		System.out.println(resource);

		return resource;

	}

	@RequestMapping("/insertResuource")
	public String insertResuource(ClientResource clientResource, HttpServletRequest request) {
		System.out.println(clientResource);
		User user = (User) request.getSession().getAttribute("user");
		System.out.println(clientResource.getClientCode());
		clientResource.setEnteringName(user.getUserName());
		clientResource.setEnteringTime(createDate);
		clientResource.setShareStatus(33);
		int count = cilentResourceService.addClient(clientResource);
		Map<String, Object> map = new HashMap<>();
		map.put("count", count);
		return "clientResource";
	}

	@RequestMapping("/updateResuource")
	public String updateResuource(ClientResource clientResource) {
		System.out.println("=========" + clientResource);
		System.out.println("id:::" + clientResource.getClientCode());
		ClientResource resource = new ClientResource();
		resource.setClientCode(clientResource.getClientCode());
		resource.setClientBrithday(clientResource.getClientBrithday());
		resource.setClientType(clientResource.getClientType());
		resource.setWorkPhone(clientResource.getWorkPhone());
		resource.setFamilyPhone(clientResource.getFamilyPhone());
		resource.setEmail(clientResource.getEmail());
		resource.setRemark(clientResource.getRemark());
		resource.setClientState(clientResource.getClientState());
		resource.setAdress(clientResource.getAdress());
		cilentResourceService.updateClient(clientResource);
		System.out.println("updateResuource+++++" + clientResource);
		return "clientResource";
	}

	@RequestMapping("/updateUser")
	public String updateUser(ClientResource resource) {
		/*
		 * System.out.println("========="+clientCode);
		 * System.out.println(userId);
		 */
		/*
		 * ClientResource resource=new ClientResource();
		 * resource.setUserId(userId); resource.setClientCode(clientCode);
		 */
		int count = cilentResourceService.updateUserId(resource.getUserId(), resource.getClientCode());
		;
		System.out.println(count);
		return "clientResource";
	}

	@RequestMapping("/deleteResuource")
	public String deleteResuource(int id) {
		System.out.println(id);
		cilentResourceService.deleteClient(id);
		return "clientResource";
	}

	/********************************
	 * ******************************** ******************************** 客户发展计划
	 * ******************************** ********************************
	 * ********************************
	 */
	@ResponseBody
	@RequestMapping("/developList")
	public Map<String, Object> developList(String developMonth, int page, int rows, HttpServletRequest request) {
		int pages = (page - 1) * rows;
		User user = (User) request.getSession().getAttribute("user");
		Object[] array = { developMonth, pages, rows, user.getRole().getRoleName(), user.getUserId() };
		Map<String, Object> map = new HashMap<String, Object>();
		Pager<ClientDevelop> deveList = clientDevelopService.getListPage(array);
		System.out.println(page);
		System.out.println(rows);
		map.put("total", deveList.getSumCount());
		map.put("rows", deveList.getData());
		for (ClientDevelop cd : deveList.getData()) {
			map.put("userName", cd.getUser().getUserName());
			map.put("loginId", cd.getUser().getLoginId());
		}
		System.out.println(map);
		System.out.println("======" + deveList.getData());
		return map;
	}

	@RequestMapping("/fortifyPlan")
	public String addPlan(ClientDevelop clientDevelop, HttpServletRequest request) {
		User user = (User) request.getSession().getAttribute("user");
		clientDevelop.setCreatedate(createDate);
		clientDevelop.setUserId(user.getUserId());
		clientDevelop.setLastOperateUser(user.getUserName());
		clientDevelop.setLastOperateTime(createDate);
		clientDevelop.setPlanState(40);
		clientDevelopService.insertPlan(clientDevelop);
		return "clientDevlop";
	}

	@RequestMapping("/modifyPlan")
	public String modifyPlan(ClientDevelop clientDevelop) {
		System.out.println("   =====" + clientDevelop);
		System.out.println("modifyPlan" + clientDevelop.getId() + " " + clientDevelop.getPlanContent());
		ClientDevelop develop = new ClientDevelop();
		develop.setPlanContent(clientDevelop.getPlanContent());
		develop.setId(clientDevelop.getId());
		clientDevelopService.updatePlan(clientDevelop);
		return "clientDevlop";
	}

	@RequestMapping("/delPlan")
	public String delPlan(int id) {
		System.out.println(id);
		clientDevelopService.delectPlan(id);
		return "clientDevlop";
	}

	@ResponseBody
	@RequestMapping("/getPlan")
	public ClientDevelop getPlan(int id) {
		System.out.println(id);
		ClientDevelop develop = clientDevelopService.getPlanById(id);
		return develop;
	}

	/********************************
	 * ******************************** ******************************** 客户
	 * 客户价值管理(见indentController) ********************************
	 * ******************************** ********************************
	 */

	/********************************
	 * ******************************** ******************************** 客户满意度管理
	 * ******************************** ********************************
	 * ********************************
	 */
	@ResponseBody
	@RequestMapping("/satisfiedList")
	public Map<String, Object> satisfiedList(String sousuo_1, int page, int rows, HttpServletRequest request) {
		System.out.println("satisfiedList");
		System.out.println(sousuo_1 + " " + page + " " + rows);
		int pages = (page - 1) * rows;
		User user = (User) request.getSession().getAttribute("user");
		Object[] array = { sousuo_1, pages, rows, user.getRole().getRoleName(), user.getUserId() };
		Map<String, Object> map = new HashMap<String, Object>();
		Pager<ClientSatisfied> satisList = clientSatisfiedService.getListPage(array);
		System.out.println(page);
		System.out.println(rows);
		map.put("total", satisList.getSumCount());
		map.put("rows", satisList.getData());
		System.out.println(map);
		return map;
	}

	@RequestMapping("/fortifySatisfied")
	public String addSatisfied(ClientSatisfied clientSatisfied) {
		System.out.println("addSatisfied" + clientSatisfied);
		clientSatisfied.setIndentId(1);
		clientSatisfied.setSurveyTime(createDate);
		clientSatisfiedService.insertSatisfied(clientSatisfied);
		return "clientDevlop";
	}

	@RequestMapping("/modifySatisfied")
	public String modifySatisfied(ClientSatisfied clientSatisfied) {
		System.out.println("modifySatisfied-------" + clientSatisfied + " " + clientSatisfied.getServeSatisfied());
		clientSatisfied.setSurveyTime(createDate);
		clientSatisfiedService.updateSatisfied(clientSatisfied);
		return "clientSatisfied";
	}

	@RequestMapping("/delSatisfied")
	public String delSatisfied(int id) {
		clientSatisfiedService.deleteSatisfied(id);
		return "clientSatisfied";
	}

	@ResponseBody
	@RequestMapping("/getSatisfied")
	public ClientSatisfied ClientSatisfied(int id) {
		System.out.println();
		ClientSatisfied satisfied = clientSatisfiedService.querySatisfied(id);
		System.out.println("ClientSatisfied" + satisfied);
		return satisfied;
	}

	/********************************
	 * ******************************** ******************************** 客户关怀管理
	 * ******************************** ********************************
	 * ********************************
	 */
	@ResponseBody
	@RequestMapping("/careList")
	public List<ClientCare> careList() {
		// Date date=new Date();
		// List<ClientCare> carList=clientCareService.getList();
		// for (ClientCare clientCare : carList) {
		// if (clientCare.getRemindTime().equals(new
		// SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date))) {
		// ApplicationContext ac=new
		// ClassPathXmlApplicationContext("springmvc.xml");
		// MailSender mailSender=(MailSender) ac.getBean("mailSender");
		// SimpleMailMessage mailMessag=new SimpleMailMessage();
		// mailMessag.setSubject("happy");
		// mailMessag.setText("祝福您"+clientCare.getRemindName().lastIndexOf(2)+"快乐");
		// mailMessag.setTo("1911822065@qq.com");
		// mailMessag.setFrom("1911822065@qq.com");
		// mailSender.send(mailMessag);
		// System.out.println("邮件发送成功");
		// }
		// }
		//
		// return carList;
		return null;
	}

	@RequestMapping("/fortifyCare")
	public String fortifyCare(ClientCare clientCare) {
		clientCareService.insertCare(clientCare);
		return "clientCare";
	}

	@RequestMapping("/modifyCare")
	public String modifyCare(ClientCare clientCare) {
		clientCareService.updateCare(clientCare);
		return "clientCare";
	}

	@RequestMapping("/delCare")
	public String delCare(int id) {
		clientCareService.deleteCare(id);
		return "clientCare";
	}

	@ResponseBody
	@RequestMapping("/getCare")
	public ClientCare getCare(int id) {
		ClientCare care = clientCareService.getCare(id);
		return care;
	}

	/********************************
	 * ******************************** ******************************** 客户方案管理
	 * ******************************** ********************************
	 * ********************************
	 */
	@ResponseBody
	@RequestMapping("/schemeList")
	public List<CareScheme> schemeList() {
		List<CareScheme> schemeList = careSchemeService.getList();
		return schemeList;
	}

	@RequestMapping("/fortifyScheme")
	public String fortifyScheme(CareScheme scheme) {
		scheme.setExecuteResult("未执行");
		careSchemeService.insertScheme(scheme);
		return "clientCare";
	}

	@RequestMapping("/modifyScheme")
	public String modifyScheme(CareScheme scheme) {
		System.out.println("modifyScheme" + scheme);
		careSchemeService.updateScheme(scheme);
		return "clientCare";
	}

	@RequestMapping("/delScheme")
	public String delScheme(int id) {
		careSchemeService.deleteScheme(id);
		return "clientCare";
	}

	@ResponseBody
	@RequestMapping("/getScheme")
	public CareScheme getScheme(int id) {
		CareScheme scheme = careSchemeService.getScheme(id);
		return scheme;
	}
}
