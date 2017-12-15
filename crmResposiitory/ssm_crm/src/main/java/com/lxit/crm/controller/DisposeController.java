package com.lxit.crm.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lxit.crm.entity.Service;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.ServiceService;

@Controller
public class DisposeController {
 
	@Autowired
	private ServiceService serviceService;
	
	//服务处理
    @RequestMapping("/ServiceDisposeDs")
    public String ServiceDisposeDs(){
    	return "ServiceDisposeDs";
    }
    
    @RequestMapping("/ServiceDispose")
    public void ServiceDispose(Service service,HttpSession session){
    	Service service1 = (Service)serviceService.ServiceBy(service.getServiceId());
    	session.setAttribute("service1",service1);
    	
    }
    
    @RequestMapping("/disposecebuttonup")
    public void disposecebuttonup(Service service){
    	String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    	Service ss = new Service();
    	
        ss.setOpid(service.getOpid());
    	ss.setServicelastDate(createDate);
    	ss.setServiceId(service.getServiceId());
    	
    	service.setServiceState(service.getDisposeceresult());
    	serviceService.disposeupdaet(service);
    	serviceService.lastoperation(ss);
    }
    
    @RequestMapping("/disposecequery")
    public void  disposecequery(Service service,HttpSession session){
    	Service service1 = (Service)serviceService.ServiceBy(service.getServiceId());
    	session.setAttribute("service2",service1);
    }
    @RequestMapping("/queryDisposeService")
    public String querydisposecedisposece(){
    	return "queryDisposeService";
    }
    

    
	public ServiceService getServiceService() {
		return serviceService;
	}
	public void setServiceService(ServiceService serviceService) {
		this.serviceService = serviceService;
	}
    
}
