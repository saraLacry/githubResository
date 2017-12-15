package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.OrganizationDao;
import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.User;

@Repository("organizationDao")
public class OrganizationDaoImpl implements OrganizationDao {
	
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Dept> organctionDeptSelectAll() {
		return sqlSessionTemplate.selectList("organizationMapper.organctionSelect");
	}

	@Override
	public List<User> organctionSelectAssign(int id) {
		System.out.println(id);
		return sqlSessionTemplate.selectList("organizationMapper.getLeaduser",id);
	}

	@Override
	public List<Dept> selectDeptCountSpan() {
		return sqlSessionTemplate.selectList("organizationMapper.kxsjSelectAllSpan");
	}

	@Override
	public Dept selectUnderDeptCountSpan(Dept dept) {
		return sqlSessionTemplate.selectOne("organizationMapper.deptidlxosaids",dept);
	}

	@Override
	public Dept AddUnderDeptCountSpan(Dept dept) {
		return sqlSessionTemplate.selectOne("organizationMapper.deptAddAll",dept);
	}

	@Override
	public Dept UpdateUnderDeptCountSpan(Dept dept) {
		return sqlSessionTemplate.selectOne("organizationMapper.deptUpdateAll",dept);
	}

	@Override
	public Dept DelUnderDeptCountSpan(Dept dept) {
		return sqlSessionTemplate.selectOne("organizationMapper.deptDelAll",dept);
	}
}