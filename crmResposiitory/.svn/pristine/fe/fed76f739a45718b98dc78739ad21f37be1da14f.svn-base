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
public class FeedbackServiceController {
	@Autowired
	ServiceService serviceService;
	
	
	@RequestMapping("/alcation")
	public String alcation(HttpSession session,Service service){
		Service servicesubmit = (Service) serviceService.ServiceBy(service.getServiceId());
		session.setAttribute("alcationquery",servicesubmit);
		return "alcation";
	}
	
	@RequestMapping("/allocationQuery")
	public String allocationQuery(){
        return "allocationQuery";
	}
	
	@RequestMapping("/distribute")
	public String distribute(){
		return "distribute";
	}
	
	@RequestMapping("/distrAllocation")
	public void distrAllocation(Service service){
		Service ss = new Service();
		serviceService.AllocationService(service);
	}
	
	//查询
	@RequestMapping("/submitupquery")
	public void submitupsubmitupquery(HttpSession session,Service service){
		Service servicesubmit = (Service) serviceService.ServiceBy(service.getServiceId());
		session.setAttribute("servicesubmitquery",servicesubmit);
	}
	//跳槽自查询页面
		@RequestMapping("/submitupdatebyquery")
		public String submitupdatebyquery(){
			return "submitupdatebyquery";
		}
	
	
	
	//反馈数据
	@RequestMapping("/submitup")
	public void submitup(HttpSession session,Service service){
		Service servicesubmit = (Service) serviceService.ServiceBy(service.getServiceId());
		session.setAttribute("servicesubmit",servicesubmit);
	}
    //跳转反馈页面
	@RequestMapping("/submitupdatebyby")
	public String submituodaup(){
		return "submitupdateService";
	}
	
	@RequestMapping("/servicesubmitmittsupda")
	public void servicesubmitmittsupda(Service service){
		
		String createDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    	Service ss = new Service();
    	service.setServiceState(service.getFeedbackResult());
        ss.setOpid(service.getOpid());
    	ss.setServicelastDate(createDate);
    	ss.setServiceId(service.getServiceId());
    	serviceService.feedbackService(service);
    	serviceService.lastoperation(ss);
	}
	
	public ServiceService getServiceService() {
		return serviceService;
	}

	public void setServiceService(ServiceService serviceService) {
		this.serviceService = serviceService;
	}
	
	
	
}
