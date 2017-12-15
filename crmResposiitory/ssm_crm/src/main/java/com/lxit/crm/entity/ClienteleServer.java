package com.lxit.crm.entity;
/**
 * 客户服务统计
 * @author Administrator
 *
 */
public class ClienteleServer {
	//服务数量
	  private double clienteleContributionCount;
	  //月份 
	  private String clienteleContributionMonth;
	  //同比
	  private String clienteleContributionWith ;
	  //环比
	  private String clienteleContributionChain ;
	public double getClienteleContributionCount() {
		return clienteleContributionCount;
	}
	public void setClienteleContributionCount(double clienteleContributionCount) {
		this.clienteleContributionCount = clienteleContributionCount;
	}
	public String getClienteleContributionMonth() {
		return clienteleContributionMonth;
	}
	public void setClienteleContributionMonth(String clienteleContributionMonth) {
		this.clienteleContributionMonth = clienteleContributionMonth;
	}
	public String getClienteleContributionWith() {
		return clienteleContributionWith;
	}
	public void setClienteleContributionWith(String clienteleContributionWith) {
		this.clienteleContributionWith = clienteleContributionWith;
	}
	public String getClienteleContributionChain() {
		return clienteleContributionChain;
	}
	public void setClienteleContributionChain(String clienteleContributionChain) {
		this.clienteleContributionChain = clienteleContributionChain;
	}
	  
}
