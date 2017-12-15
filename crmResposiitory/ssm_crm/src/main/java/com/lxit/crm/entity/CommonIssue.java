package com.lxit.crm.entity;

import java.io.Serializable;

/**
 * 常见问题实体类
 * @author Administrator
 *
 */
public class CommonIssue implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int CommonIssueId;//问题主键id
    private String IssueName;//问题名称
    private String IssueType;//问题类型
    private String IssueAnswer;//问题答复
    private String Remark;//备注信息
    private String FoundId;//创建人
    private String lastDate;//最后操作时间
    private String lastUpdateDate;//最后修改时间
    private int pageIndex;//当前页
    private int pageSize;//每页显示的条数
    
    public CommonIssue(){}

	public int getCommonIssueId() {
		return CommonIssueId;
	}

	public void setCommonIssueId(int commonIssueId) {
		CommonIssueId = commonIssueId;
	}

	public String getIssueName() {
		return IssueName;
	}

	public void setIssueName(String issueName) {
		IssueName = issueName;
	}

	public String getIssueType() {
		return IssueType;
	}

	public void setIssueType(String issueType) {
		IssueType = issueType;
	}

	public String getIssueAnswer() {
		return IssueAnswer;
	}

	public void setIssueAnswer(String issueAnswer) {
		IssueAnswer = issueAnswer;
	}

	public String getRemark() {
		return Remark;
	}

	public void setRemark(String remark) {
		Remark = remark;
	}

	public String getFoundId() {
		return FoundId;
	}

	public void setFoundId(String foundId) {
		FoundId = foundId;
	}

	public String getLastDate() {
		return lastDate;
	}

	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public CommonIssue(int commonIssueId, String issueName, String issueType, String issueAnswer, String remark,
			String foundId, String lastDate, String lastUpdateDate, int pageIndex, int pageSize) {
		super();
		CommonIssueId = commonIssueId;
		IssueName = issueName;
		IssueType = issueType;
		IssueAnswer = issueAnswer;
		Remark = remark;
		FoundId = foundId;
		this.lastDate = lastDate;
		this.lastUpdateDate = lastUpdateDate;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "CommonIssue [CommonIssueId=" + CommonIssueId + ", IssueName=" + IssueName + ", IssueType=" + IssueType
				+ ", IssueAnswer=" + IssueAnswer + ", Remark=" + Remark + ", FoundId=" + FoundId + ", lastDate="
				+ lastDate + ", lastUpdateDate=" + lastUpdateDate + ", pageIndex=" + pageIndex + ", pageSize="
				+ pageSize + "]";
	}
    
    
    
    
}
