package com.lxit.crm.service;

import java.util.List;

import com.lxit.crm.entity.CareScheme;

public interface CareSchemeService {

	/**
	 * 查询所有的关怀方案
	 * @return
	 */
	public List<CareScheme> getList();
	/**
	 * 增加关怀方案
	 * @param careScheme
	 * @return
	 */
	public int insertScheme(CareScheme careScheme);
	/**
	 * 修改关怀方案
	 * @param careScheme
	 * @return
	 */
	public int updateScheme(CareScheme careScheme);
	/**
	 * 删除关怀方案
	 * @param id
	 * @return
	 */
	public int deleteScheme(int id);
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 */
	public CareScheme getScheme(int id);
}
