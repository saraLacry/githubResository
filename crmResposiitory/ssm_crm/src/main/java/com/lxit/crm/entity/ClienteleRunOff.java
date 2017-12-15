package com.lxit.crm.entity;
/**
 * 客户流失统计
 * @author Administrator
 *
 */
public class ClienteleRunOff {
  //客户流失数量
  private int clienteleRunOffCount;
//客户月份 
  private String clienteleRunOffMonth;
  //客户同比
  private String clienteleRunOffWith ;
  //客户环比
  private String clienteleRunOffChain ;
  //条数
  private int pageIndex;
  //页数
  private int page;
  
public int getPageIndex() {
	return pageIndex;
}
public void setPageIndex(int pageIndex) {
	this.pageIndex = pageIndex;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public int getClienteleRunOffCount() {
	return clienteleRunOffCount;
}
public void setClienteleRunOffCount(int clienteleRunOffCount) {
	this.clienteleRunOffCount = clienteleRunOffCount;
}
public String getClienteleRunOffMonth() {
	return clienteleRunOffMonth;
}
public void setClienteleRunOffMonth(String clienteleRunOffMonth) {
	this.clienteleRunOffMonth = clienteleRunOffMonth;
}
public String getClienteleRunOffWith() {
	return clienteleRunOffWith;
}
public void setClienteleRunOffWith(String clienteleRunOffWith) {
	this.clienteleRunOffWith = clienteleRunOffWith;
}
public String getClienteleRunOffChain() {
	return clienteleRunOffChain;
}
public void setClienteleRunOffChain(String clienteleRunOffChain) {
	this.clienteleRunOffChain = clienteleRunOffChain;
}
@Override
public String toString() {
	return "ClienteleRunOff [clienteleRunOffCount=" + clienteleRunOffCount + ", clienteleRunOffMonth="
			+ clienteleRunOffMonth + ", clienteleRunOffWith=" + clienteleRunOffWith + ", clienteleRunOffChain="
			+ clienteleRunOffChain + "]";
}
  
  
}
