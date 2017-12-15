package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.CompactDao;
import com.lxit.crm.entity.Compact;
import com.lxit.crm.entity.Dictionary;
import com.lxit.crm.entity.User;
/**
 * 合同管理
 * 
 *
 */ 
@Repository("compactDao")
public class CompactDaoImpl implements CompactDao {
@Resource
 private SqlSessionTemplate sqlSessionTemplate;
 
public SqlSessionTemplate getSqlSessionTemplate() {
	return sqlSessionTemplate;
}

public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
	this.sqlSessionTemplate = sqlSessionTemplate;
}

	//增加
	@Override
	public boolean CompactAdd(Compact compact) {
		this.sqlSessionTemplate.selectList("compact.add", compact);
		return true;
	}
	//查询状态
	@Override
	public List<Dictionary> compactState() {
		List<Dictionary> list=this.getSqlSessionTemplate().selectList("compact.compactSt");
		return list;
	}
	public List<Dictionary> compactType(){
		return this.getSqlSessionTemplate().selectList("compact.compacttt");
	}

	@Override
	public List<User> userselect() {
		return this.getSqlSessionTemplate().selectList("compact.userselect");
	}
	//查询合同数据进行分页
	@Override
	public List<Compact> compactselect( Compact compact) {
		return this.getSqlSessionTemplate().selectList("compact.compactselect", compact);
	}
	//查询所有数据的数量
	@Override
	public int compactCount(Compact compact) {
		return this.getSqlSessionTemplate().selectList("compact.compactcount", compact).size();
	}

	@Override
	public boolean compactUpdateState(Compact compact) {
		return this.getSqlSessionTemplate().update("compact.compactpdateexecution",compact)>0;
	}

	@Override
	public boolean selectSubmit(Compact compact) {
		boolean sql=this.getSqlSessionTemplate().selectList("compact.userselectsubmit",compact).size()>0;
		return sql ;
	}

	@Override
	public boolean selectri(int id) {
	    int[]array={id};
		return this.getSqlSessionTemplate().selectList("compact.userselectsubmit",array).size()>0;
	}

	@Override
	public Compact selectId(int id) {
		int[]array={id};
		return this.getSqlSessionTemplate().selectOne("selectid",array);
	}

	@Override
	public boolean CompactUpdate(Compact compact) {
		return this.getSqlSessionTemplate().update("compact.compactup",compact)>0;
	}

	@Override
	public boolean shks(Compact compact) {
		return this.getSqlSessionTemplate().update("compact.htsh", compact)>0;
	}

	@Override
	public boolean compactgkais(Compact compact) {
		return this.getSqlSessionTemplate().update("compact.compactpdatebiangeng",compact)>0;
	}

	@Override
	public boolean compactassignmentk(Compact compact) {
		return this.getSqlSessionTemplate().update("compact.compactassignment",compact)>0;
	}

	@Override
	public boolean compactremovek(Compact compact) {
		return this.getSqlSessionTemplate().update("compact.compactremove",compact)>0;
	}

	@Override
	public boolean compactrcompactjudge(int id, int compactId) {
	    int []array={id,compactId};
		return this.getSqlSessionTemplate().selectList("compact.compactjudge",array).size()>0;
	}

	@Override
	public boolean userSelectJudge(int id, int compactId) {
		int [] array={id,compactId};
		return this.getSqlSessionTemplate().selectList("compact.userselectjudge",array).size()>0;
	}

	@Override
	public List<Compact> compactselectshh(Compact compact) {
		return this.getSqlSessionTemplate().selectList("compact.compactselectshh",compact);
	}

	@Override
	public int compactCountshh(Compact compact) {
		return this.getSqlSessionTemplate().selectList("compactcountshh", compact).size();
	}

	@Override
	public List<Compact> compactselectguanli(Compact compact) {
		return this.getSqlSessionTemplate().selectList("compactselectguanli",compact);
	}

	@Override
	public int compactCountguanli(Compact compact) {
		return this.getSqlSessionTemplate().selectList("compactcountguanli",compact).size();
	}

}
