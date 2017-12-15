package com.lxit.crm.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.lxit.crm.entity.Compact;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.User;

/**
 * 合同管理
 * 
 *
 */ 
public interface CompactService  {
	//增加
	   public boolean CompactAdd(Compact compact);
	 //查询状态
	   public List<Dictionary> compactState();
	   //查询类型
	   public List<Dictionary> compactType();
	   //查询所有用户
	   public List<User> userselect();
	   //查询合同数据进行分页
	   public List<Compact> compactselect(Compact compact);
	   //查询所有数据的数量
	   public int compactCount(Compact compact);
	   //进行状态修改
	   public  boolean compactUpdateState(Compact compact);
       //判断是否是订立状态
	   public boolean selectSubmit(Compact compact);
	   //判断是否是代审核人进行审核
	   public boolean selectri(int id);
	 //按照id进行查询
	   public Compact  selectId(int id);
	   //进行修改操作
	   public boolean CompactUpdate(Compact compact);
	   //进行审核
	   public boolean shks(Compact compact);
	   //进行变更
	   public boolean compactgkais(Compact compact);
	   //进行转让
	   public boolean compactassignmentk(Compact compact);
	   //进行解除
	   public boolean compactremovekss(Compact compact);
	 //进行判断状态
	   public boolean compactrcompactjudge(int id,int compactId);
	   //审核人判断
	   public boolean  userSelectJudge(int id,int compactId);
	 //查询合同数据进行分页审核
	   public List<Compact> compactselectshh(Compact compact);
	   //查询所有数据的数量审核
	   public int compactCountshh(Compact compact);
		 //查询合同数据进行分页管理
	   public List<Compact> compactselectguanli(Compact compact);
	   //查询所有数据的数量审核管理
	   public int compactCountguanli(Compact compact);
}

