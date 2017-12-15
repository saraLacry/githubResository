package com.lxit.crm.dao.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.IndentgoodsDao;
import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.Indentgoods;

@Repository("indentgoodsDao")
public class IndentgoodsDaoImpl implements IndentgoodsDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<Indentgoods> getListIndentallmoney(int indentId) {
		return this.sqlSessionTemplate.selectList("Indentgoods.getListIndentGoodsallmoney", indentId);
	}

	@Override
	public Indentgoods getmoney(int clientresourceid) {
		return this.sqlSessionTemplate.selectOne("Indentgoods.getmoney", clientresourceid);
	}

	@Override
	public int insertIndentgoods(Indentgoods indentgoods) {
		return this.sqlSessionTemplate.insert("Indentgoods.addIndentgoods", indentgoods);
	}

	@Override
	public List<Indentgoods> getindentGoodsxixi(String indentnumber) {
		List<Indentgoods> o = this.sqlSessionTemplate.selectList("Indentgoods.getindentGoodsxixi", indentnumber);
		for (Indentgoods indentgoods : o) {
			System.out.println("ooooooo"+indentgoods);
		}
		return o;
	}

}
