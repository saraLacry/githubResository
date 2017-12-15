package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Service;
import com.lxit.crm.service.ServiceService;

/**
 * 服务管理
 * 
 * @author Administrator
 *
 */
@Controller
public class ServiceController {

	/**
	 * 服务增加
	 * 
	 * @return
	 */
	@RequestMapping("/serviceFound")
	public String Servicefoun() {
		return "serviceFound";
	}

	/**
	 * 服务分配
	 */
	@RequestMapping("/serviceAllocation")
	public String serviceAllocation() {
		return "serviceAllocation";
	}
	
	
	/**
	 * 服务处理
	 * 
	 * @return
	 */
	@RequestMapping("/serviceDispose")
	public String serviceDispose() {
		return "serviceDispose";
	}

	/**
	 * 服务反馈
	 */
	@RequestMapping("/serviceFeedback")
	public String serviceFeedback() {
		return "serviceFeedback";
	}

	/**
	 * 服务归档
	 */
	@RequestMapping("/serviceFile")
	public String serviceFile() {
		return "serviceFile";
	}

	@Autowired
	ServiceService serviceService;

	/**
	 * list查询所有服务
	 */
	@RequestMapping("/ListService")
	@ResponseBody
	public List<Service> ListService(HttpServletRequest request) {

		List<Service> list = serviceService.ServiceList();
		return list;
	}

	// 跳转到insert页面
	@RequestMapping("/serviceInsertfound")
	public String serviceFoundAdd() {
		return "serviceFoundAdd";
	}

	@ResponseBody
	@RequestMapping("/submitService")
	public boolean submitService(Service service) {
		service.setServiceState("已提交");
		return serviceService.submitService(service);
	}

	// 跳转到update页面
	@RequestMapping("/ServiceUpdate")
	public String ServiceUpdate() {
		return "ServiceUpdate";
	}

	@RequestMapping("/updateFoundFound")
	public String updateFound(Service service){
		 serviceService.updateService(service);
		 return "serviceFound";
	}

	//del删除
	@ResponseBody
	@RequestMapping("/serviceFoundDel")
	public boolean serviceFoundDel(Service service){
		return serviceService.deleteService(service.getServiceId());
	}
	
	@RequestMapping("/insertServiceinto")
	public void insertServiceinto(Service service){
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		service.setServiceState("新创建");
		service.setServiceInsertdate(createDate);
		service.setServicelastDate(createDate);
		serviceService.insertService(service);
	}
	/**
	 * 查询
	 * 
	 * @return
	 */
	@RequestMapping("/UpdatequeryServiceUpdate")
	public void UpdatequeryServiceUpdate(Service services, HttpSession session) {
		Service UpdatequeryServiceUpdate = serviceService.ServiceBy(services.getServiceId());
		session.setAttribute("UpdatequeryServiceUpdate", UpdatequeryServiceUpdate);
	}

	@RequestMapping("/queryService")
	public String queryService() {
		return "queryService";
	}

	@RequestMapping("/queryServicequery")
	public void queryServicequery(Service services, HttpSession session) {
		Service service = serviceService.ServiceBy(services.getServiceId());
		session.setAttribute("services", service);
	}

	public ServiceService getServiceService() {
		return serviceService;
	}

	public void setServiceService(ServiceService serviceService) {
		this.serviceService = serviceService;
	}

}
