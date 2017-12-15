package com.lxit.crm.dao;

import java.util.List;

import com.lxit.crm.entity.Base;

/**
 * 基础信息dao
 * 
 * @author Administrator
 *
 */
public interface BasicsmessageDao {
	/**
	 * 基础信息查询
	 * 
	 * @return
	 */
	List<Base> basicsmessageSelectAll();

	/**
	 * 基础信息增加
	 * 
	 * @return
	 */
	Base basicsmessageAdd(Base base);

	/**
	 * 基础信息修改
	 * 
	 * @return
	 */
	Base basicsmessageUpdate(Base base);

	/**
	 * 基础信息删除
	 * 
	 * @return
	 */
	Base basicsmessageDel(Base base);
}
