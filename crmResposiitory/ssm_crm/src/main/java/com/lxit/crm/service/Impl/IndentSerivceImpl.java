package com.lxit.crm.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.lxit.crm.dao.GoodsDao;
import com.lxit.crm.dao.IndentDao;
import com.lxit.crm.dao.IndentgoodsDao;
import com.lxit.crm.entity.ClientResource;
import com.lxit.crm.entity.Goods;
import com.lxit.crm.entity.Indent;
import com.lxit.crm.entity.Indentgoods;
import com.lxit.crm.entity.Pager;
import com.lxit.crm.entity.StatisticsIndent;
import com.lxit.crm.entity.User;
import com.lxit.crm.service.IndentSerivce;

@Service("indentSerivce")
public class IndentSerivceImpl implements IndentSerivce {
	@Resource
	IndentDao indentDao;
	@Resource
	GoodsDao goodsDao;
	@Resource
	IndentgoodsDao indentGoodsDao;

	@Override
	public Pager<Indent> getIndentList(Object[] array) {
		List<Indent> list = indentDao.getIndentList(array);
		for (Indent indent : list) {
			String goodsnameall = "";
			List<Goods> goodsname = goodsDao.Listgoodsname(indent.getIndentid());
			for (Goods goods2 : goodsname) {
				goodsnameall += goods2.getGoodsName() + ",";
			}
			for (Indent indent2 : list) {
				if (indent2.getIndentid() == indent.getIndentid()) {
					indent2.setGoodsNameall(goodsnameall);
					indent2.setGoodsIndentallmoney("￥" + indent2.getGoodsIndentallmoney() + "万");
				}
			}
		}
		Pager<Indent> pager = new Pager<Indent>();
		pager.setData(list);
		pager.setSumCount(getIndentCount(array));
		return pager;
	}

	private int getIndentCount(Object[] array) {
		return indentDao.getIndentListCount(array);
	}

	@Override
	public Indent getIndentById(int indentId) {
		Indent indent = indentDao.getIndentById(indentId);
		String goodsnameall = "";
		List<Goods> goodsname = goodsDao.Listgoodsname(indentId);
		for (Goods goods2 : goodsname) {
			goodsnameall += goods2.getGoodsName() + ",";
		}
		indent.setGoodsNameall(goodsnameall);
		indent.setGoodsIndentallmoney("￥" + indent.getGoodsIndentallmoney() + "万");

		return indent;
	}

	@Override
	public int insertIndent(Indent indent) {
		return indentDao.insertIndent(indent);
	}

	@Override
	public Pager<StatisticsIndent> getListstatistics(int page, int rows, String data1, String data2) {
		System.out.println("data1===" + data1);
		System.out.println("data2===" + data2);
		int pageIndex = ((page - 1) * rows);
		int pageSize =  rows;
		
		String sql = "";
		/*if(user.getRole().getRoleId()==4){
			sql+=" and i.userId = 1 ";
		}*/
		if (data1 != null && data1 != "" && (data2 == null || data2 == "")) {
			sql += "and LEFT(i.indenttime,7) = LEFT(#{array[2]},7) ";
		}else
		if (data2 != null && data2 != "" && (data1 == null || data1 == "")) {
			sql = " AND LEFT(i.indenttime,7) = LEFT(#{array[3]},7) ";
		}else
		if (data1 != null && data1 != "" && data2 != null && data2 != "") {
			sql += "and LEFT(i.indenttime,7) >= LEFT(#{array[2]},7) AND LEFT(#{array[3]},7) >= LEFT(i.indenttime,7) ";
		}
		System.out.println("sql==="+sql);
		Object[] array = { pageIndex, pageSize, data1, data2 ,sql};
		List<StatisticsIndent> list = indentDao.getListstatistics(array);
		Pager<StatisticsIndent> pager = new Pager<StatisticsIndent>();
		pager.setData(list);
		pager.setSumCount(list.size());
		return pager;
	}

	private int getStatisticsIndentCount(Map<String, Object> map) {
		return indentDao.getStatisticsIndentCount(map);
	}
}
