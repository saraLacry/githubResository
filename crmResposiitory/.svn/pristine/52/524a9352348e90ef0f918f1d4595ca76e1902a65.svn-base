package com.lxit.crm.entity;

import java.util.ArrayList;
import java.util.List;

public class Pager<T> {
	private int pageIndex; //当前页
	private int pageSize; //每页显示的条数
	private int sumPage; //总页数
	private int sumCount; //总条数
	private boolean isFirst;//
	private boolean isLast;//
	
	
	private List<T> data; //每页的数据
	
	
	public Pager() {//构造方法
		data = new ArrayList<T>();   //new对象初始化
	}
	
	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {  //判断如果输入页数小于1的时候都都第一页
		if(pageIndex<1)
		{
			this.pageIndex = 1;
		}else{
			this.pageIndex = pageIndex;
		}		
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getSumPage() {
		return sumPage;
	}

	public void setSumPage(int sumPage) {
		this.sumPage = sumPage;
	}

	public int getSumCount() {
		return sumCount;
	}

	public void setSumCount(int sumCount) { //
		this.sumCount = sumCount;
		}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public boolean getIsFirst() {   //判断如果已在首页则不显示首页和上一页，     只显示下一页和尾页（因为没有进page.jsp页面的if循环）
		System.out.println(this.pageIndex);
		return this.pageIndex <= 1;
	}

	public boolean getIsLast() {   //判断如果已在尾页则不显示下一页和尾页， 只显示首页和上一页（...）
		return this.pageIndex >= this.sumPage;
	}

	@Override
	public String toString() {
		return "Pager [pageIndex=" + pageIndex + ", pageSize=" + pageSize + ", sumPage=" + sumPage + ", sumCount="
				+ sumCount + ", isFirst=" + isFirst + ", isLast=" + isLast + ", data=" + data + "]";
	}
	
	
	
}
