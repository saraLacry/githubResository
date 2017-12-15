package com.lxit.crm.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.lxit.crm.dao.StatisticsDao;
import com.lxit.crm.entity.ClienteleRunOff;

@Repository("statisticsDao")
public class StatisticsDaoImpl implements StatisticsDao {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<ClienteleRunOff> runOff() {
		List<ClienteleRunOff> list = null;
		ClienteleRunOff clile = null;
		// 将查询出的日期与数量遍历出来
		List<ClienteleRunOff> lis = this.sqlSessionTemplate.selectList("clientelerunoff");
		for (ClienteleRunOff clienteleRunOff : lis) {
			clile = new ClienteleRunOff();
			list = new ArrayList<ClienteleRunOff>();
			// 定义一个变量接住查询出来的数量
			int count = clienteleRunOff.getClienteleRunOffCount();

			// 将日期查询出来
			String date = clienteleRunOff.getClienteleRunOffMonth();
			// 赋入实体类的数量
			// 将日期截取
			String[] arrayDate = date.split("-");
			// 获取年份
			int year = Integer.parseInt(arrayDate[0]);
			// 获取月份
			int month = Integer.parseInt(arrayDate[1]);
			// 获取遍历出的年月
			String years = null;
			int y = 0;
			int m = month - 1;
			if (m == 0) {
				m = 12;
				y = year - 1;
			}

			years = m + "-" + y;
			System.out.println(years);
			clile.setClienteleRunOffMonth(years);
			int counts = 0;
			// 环比
			String chain = null;
			// 同比
			String with = null;
			// 查询出来进行查询环比
			boolean boo = sqlSessionTemplate.selectList("clientelerunoffcountone", clile).size() > 0;
			boolean boos = sqlSessionTemplate.selectList("clientelerunoffcountone", clile).size() > 0;
			// 环比
			if (boo) {
				clile = sqlSessionTemplate.selectOne("clientelerunoffcountone", clile);
				counts = clile.getClienteleRunOffCount();
			}
			if (count > counts) {
				chain = "+";
			} else if (count < counts) {
				chain = "-";
			}
			chain += (count - counts) / count * 100 + "%";
			--year;
			years = year + "-" + month;
		}
		return list;
	}
}