package com.lxit.crm.service;

import java.util.List;

import com.lxit.crm.entity.Dictionary;

public interface DictionaPopupService {
	/**
	 * 查询所有数据字典
	 * 
	 * @return
	 */
	List<Dictionary> dictionariesSelectAll(Dictionary dictionary);
	
	/**
	 * 获取总条数
	 * 
	 * @return
	 */
	Integer dictionariesSelectCount();

	/**
	 * 增加数据字典
	 * 
	 * @return
	 */
	Dictionary dictionariesAdd(Dictionary dictionary);

	/**
	 * 修改数据字典
	 * 
	 * @return
	 */
	Dictionary dictionariesUpdate(Dictionary dictionary);

	/**
	 * 删除数据字典
	 * 
	 * @return
	 */
	Dictionary dictionariesDel(Dictionary dictionary);
}
