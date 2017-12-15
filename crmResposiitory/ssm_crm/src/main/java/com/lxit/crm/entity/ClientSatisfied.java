package com.lxit.crm.entity;

import java.io.Serializable;
/**
 * 客户满意度表
 * @author Administrator
 *
 */
public class ClientSatisfied implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;//主键
	private String qualitySatisfied;//质量满意度
	private String priceSatisfied;//性比价满意度
	private String serveSatisfied;//服务满意度
	private String sumSatisfied;//总体满意度
	private String clientFeedback;//客户反馈
	private String surveyTime;//调查时间
	private String name;//客户姓名
	private int indentId;//客户id
	private String dictionaryvalue;
	private String dictionaryvalue2;
	private ClientResource clientResource;//客户信息对象
	
	
	
	
	
	public int getIndentId() {
		return indentId;
	}
	public void setIndentId(int indentId) {
		this.indentId = indentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDictionaryvalue() {
		return dictionaryvalue;
	}
	public void setDictionaryvalue(String dictionaryvalue) {
		this.dictionaryvalue = dictionaryvalue;
	}
	public String getDictionaryvalue2() {
		return dictionaryvalue2;
	}
	public void setDictionaryvalue2(String dictionaryvalue2) {
		this.dictionaryvalue2 = dictionaryvalue2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQualitySatisfied() {
		return qualitySatisfied;
	}
	public void setQualitySatisfied(String qualitySatisfied) {
		this.qualitySatisfied = qualitySatisfied;
	}
	public String getPriceSatisfied() {
		return priceSatisfied;
	}
	public void setPriceSatisfied(String priceSatisfied) {
		this.priceSatisfied = priceSatisfied;
	}
	public String getServeSatisfied() {
		return serveSatisfied;
	}
	public void setServeSatisfied(String serveSatisfied) {
		this.serveSatisfied = serveSatisfied;
	}
	public String getSumSatisfied() {
		return sumSatisfied;
	}
	public void setSumSatisfied(String sumSatisfied) {
		this.sumSatisfied = sumSatisfied;
	}
	public String getClientFeedback() {
		return clientFeedback;
	}
	public void setClientFeedback(String clientFeedback) {
		this.clientFeedback = clientFeedback;
	}
	public String getSurveyTime() {
		return surveyTime;
	}
	public void setSurveyTime(String surveyTime) {
		this.surveyTime = surveyTime;
	}
	public ClientResource getClientResource() {
		return clientResource;
	}
	public void setClientResource(ClientResource clientResource) {
		this.clientResource = clientResource;
	}
	@Override
	public String toString() {
		return "ClientSatisfied [id=" + id + ", qualitySatisfied=" + qualitySatisfied + ", priceSatisfied="
				+ priceSatisfied + ", serveSatisfied=" + serveSatisfied + ", sumSatisfied=" + sumSatisfied
				+ ", clientFeedback=" + clientFeedback + ", surveyTime=" + surveyTime + ", name=" + name + ", indentId="
				+ indentId + ", dictionaryvalue=" + dictionaryvalue + ", dictionaryvalue2=" + dictionaryvalue2
				+ ", clientResource=" + clientResource + "]";
	}
	
	
	
	
	

}
