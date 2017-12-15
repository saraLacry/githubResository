package com.lxit.crm.service;

import java.util.List;

import com.lxit.crm.entity.Service;

public interface ServiceService {
	// 增加一个服务
	public boolean insertService(Service service);

	// 修改一条服务
	public boolean updateService(Service service);

	// 删除一条服务delete
	public boolean deleteService(int serviceId);

	// 查询一条服务记录
	public Service ServiceBy(int serviceId);

	// 查询所有
	public List<Service> ServiceList();

	// 提交一条服务
	public boolean submitService(Service service);

	// 最后操作
	public boolean lastoperation(Service service);

	public boolean disposeupdaet(Service service);

	// 反馈
	public boolean feedbackService(Service service);

	public boolean pigeonholeService(Service service);

	public boolean AllocationService(Service service);
}
