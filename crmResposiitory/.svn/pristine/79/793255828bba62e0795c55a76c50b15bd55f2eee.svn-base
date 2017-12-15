package com.lxit.crm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crm.entity.Service;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.ServiceService;

@Controller
public class PigeonholeController {

	@Autowired
	ServiceService serviceService;

	/**
	 * 归档服务
	 */
	@RequestMapping("/pigeonhole")
	@ResponseBody
	public boolean pigeonhole(Service service) {
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

		Service ph = new Service();
		Service ss = new Service();

		ph.setServiceId(service.getServiceId());
		ph.setOpid(0);
		ph.setServiceState("已归档");

		ss.setOpid(service.getOpid());
		ss.setServicelastDate(createDate);
		ss.setServiceId(service.getServiceId());
		 serviceService.pigeonholeService(ph);
		return serviceService.lastoperation(ss);
	}

	
	/**
	 * 归档查询
	 * @return
	 */
	@RequestMapping("/phquery")
	public void phquery(Service service,HttpSession session){
		Service service1 = (Service)serviceService.ServiceBy(service.getServiceId());
    	session.setAttribute("phqueryo",service1);
    	System.out.println(service1);
	}
	@RequestMapping("/FileQuery")
	public String FileQuery(){
		return "FileQuery";
	}
	
	public ServiceService getServiceService() {
		return serviceService;
	}

	public void setServiceService(ServiceService serviceService) {
		this.serviceService = serviceService;
	}

}
