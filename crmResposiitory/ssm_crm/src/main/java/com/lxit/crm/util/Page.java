package com.lxit.crm.util;

import java.util.ArrayList;
import java.util.List;

public class Page<T> {
	private int count ;
	
	private List<T> date;
	
	public Page(){
		date = new ArrayList<T>();
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<T> getDate() {
		return date;
	}

	public void setDate(List<T> date) {
		this.date = date;
	}
}