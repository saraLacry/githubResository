package com.lxit.crm.entity;
/**
 * 客户贡献统计
 * @author Administrator
 *
 */
public class ClienteleContribution {
	//客户贡献余额
	  private double clienteleContributionCount;
	  //客户月份 
	  private String clienteleContributionMonth;
	  //客户同比
	  private String clienteleContributionWith ;
	  //客户环比
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
	@Override
	public String toString() {
		return "ClienteleContribution [clienteleContributionCount=" + clienteleContributionCount
				+ ", clienteleContributionMonth=" + clienteleContributionMonth + ", clienteleContributionWith="
				+ clienteleContributionWith + ", clienteleContributionChain=" + clienteleContributionChain + "]";
	}
	  
	  
}
