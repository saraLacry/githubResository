package com.lxit.crm.entity;

import java.io.Serializable;

/**
 * 数据字典
 * 
 * @author Administrator
 *
 */
public class Dictionary implements Serializable {
	/**
	 *  
	 */
	private static final long serialVersionUID = 1L;

	private int dectionarycodingId;// 数据字典Id
	private String dictionarycoding;// 数字字典编码
	private String dictionaryName;// 字典名称
	private String dictionaryvalue;// 参数值
	private String lastTime;// 最后修改时间
	private String dictionaryremark;// 备注
	private String userName;// 修改人
	private Integer pageIndex;// 行
	private Integer pageSize;// 页

	public Dictionary() {
		super();
	}

	public int getDectionarycodingId() {
		return dectionarycodingId;
	}

	public void setDectionarycodingId(int dectionarycodingId) {
		this.dectionarycodingId = dectionarycodingId;
	}

	public String getDictionarycoding() {
		return dictionarycoding;
	}

	public void setDictionarycoding(String dictionarycoding) {
		this.dictionarycoding = dictionarycoding;
	}

	public String getDictionaryName() {
		return dictionaryName;
	}

	public void setDictionaryName(String dictionaryName) {
		this.dictionaryName = dictionaryName;
	}

	public String getDictionaryvalue() {
		return dictionaryvalue;
	}

	public void setDictionaryvalue(String dictionaryvalue) {
		this.dictionaryvalue = dictionaryvalue;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

	public String getDictionaryremark() {
		return dictionaryremark;
	}

	public void setDictionaryremark(String dictionaryremark) {
		this.dictionaryremark = dictionaryremark;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Dictionary [dectionarycodingId=" + dectionarycodingId + ", dictionarycoding=" + dictionarycoding
				+ ", dictionaryName=" + dictionaryName + ", dictionaryvalue=" + dictionaryvalue + ", lastTime="
				+ lastTime + ", dictionaryremark=" + dictionaryremark + ", userName=" + userName + ", pageIndex="
				+ pageIndex + ", pageSize=" + pageSize + "]";
	}
}