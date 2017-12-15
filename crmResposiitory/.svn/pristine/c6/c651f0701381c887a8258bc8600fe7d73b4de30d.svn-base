package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.StaffDao;
import com.lxit.crm.entity.Dept;
import com.lxit.crm.entity.Role;
import com.lxit.crm.entity.User;

@Repository("staffDao")
public class StaffDaoImpl implements StaffDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public User InsertsaveIdsAdd(User user) {
		return sqlSessionTemplate.selectOne("StaffMapper.insertUser", user);
	}

	@Override
	public List<Dept> getDeptSelect() {
		return sqlSessionTemplate.selectList("StaffMapper.staffDeptSelect");
	}

	@Override
	public List<Role> getRoleSelect() {
		return sqlSessionTemplate.selectList("StaffMapper.staffRoleSelect");
	}

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<User> getStaffSelect() {
		return sqlSessionTemplate.selectList("StaffMapper.staffSelectWork");
	}

	@Override
	public Role getUserUpateSelect(int userId) {
		User user = new User();
		user.setUserId(userId);
		return sqlSessionTemplate.selectOne("StaffMapper.selectUpdateRoleName", user);
	}

	@Override
	public User staffManagerUpdateSpan(User user) {
		return sqlSessionTemplate.selectOne("StaffMapper.staffUpdateSpan", user);
	}

	@Override
	public User staffManagerDelSpan(User user) {
		return sqlSessionTemplate.selectOne("StaffMapper.staffDelSpanWith", user);
	}

	@Override
	public Dept getDeptSelects(User user) {
		return sqlSessionTemplate.selectOne("StaffMapper.staffDeptSelectCount",user);
	}

	@Override
	public User staffManagerSaveInsert(User user) {
		return sqlSessionTemplate.selectOne("StaffMapper.staffSaveInsertCount",user);
	}
}