package com.lxit.crm.dao.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.GoodsDao;
import com.lxit.crm.entity.Goods;

@Repository("goodsDao")
public class GoodsDaoImpl implements GoodsDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public List<Goods> getGoodslist() {
		return this.sqlSessionTemplate.selectList("Goods.getList");
	}

	@Override
	public int getGoodsCount() {
		return this.sqlSessionTemplate.selectOne("Goods.getListCount");
	}

	@Override
	public Goods getGoodstotal(Map<String, Object> map) {
		return this.sqlSessionTemplate.selectOne("Goods.getListtotal", map);
	}

	@Override
	public List<Goods> Listgoodsname(int indentid) {
		return this.sqlSessionTemplate.selectList("Goods.Listgoodsname", indentid);
	}

	@Override
	public int updateGoods(Goods goods) {
		return this.sqlSessionTemplate.update("Goods.updateGoods", goods);
	}
}
