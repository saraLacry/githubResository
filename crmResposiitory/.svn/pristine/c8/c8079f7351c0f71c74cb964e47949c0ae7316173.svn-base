package com.lxit.crm.entity;

import java.io.Serializable;
/**
 * 客户关怀表
 * @author Administrator
 *
 */
public class ClientCare implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;//主键
	private String remindType;//提醒类型(引用数据字典表)
	private String remindTime;//提醒时间
	private String remindDay;//提醒周期（周一-周日）
	private String remindRate;//提醒频率
	private String remark;//备注
	private String remindName;//提醒名称
	private String dictionaryvalue;//提醒类型
	private CareScheme careScheme;//关怀方案对象
	
	
	public String getDictionaryvalue() {
		return dictionaryvalue;
	}
	public void setDictionaryvalue(String dictionaryvalue) {
		this.dictionaryvalue = dictionaryvalue;
	}
	public String getRemindName() {
		return remindName;
	}
	public void setRemindName(String remindName) {
		this.remindName = remindName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRemindType() {
		return remindType;
	}
	public void setRemindType(String remindType) {
		this.remindType = remindType;
	}
	public String getRemindTime() {
		return remindTime;
	}
	public void setRemindTime(String remindTime) {
		this.remindTime = remindTime;
	}
	public String getRemindDay() {
		return remindDay;
	}
	public void setRemindDay(String remindDay) {
		this.remindDay = remindDay;
	}
	public String getRemindRate() {
		return remindRate;
	}
	public void setRemindRate(String remindRate) {
		this.remindRate = remindRate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public CareScheme getCareScheme() {
		return careScheme;
	}
	public void setCareScheme(CareScheme careScheme) {
		this.careScheme = careScheme;
	}
	@Override
	public String toString() {
		return "ClientCare [id=" + id + ", remindType=" + remindType + ", remindTime=" + remindTime + ", remindDay="
				+ remindDay + ", remindRate=" + remindRate + ", remark=" + remark + ", remindName=" + remindName
				+ ", dictionaryvalue=" + dictionaryvalue + ", careScheme=" + careScheme + "]";
	}
	
}