package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DocumentVerification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int documentVerificationId;
	private int customerId;
	private String firstLevelVerifyByOE;
	private String firstLevelVerifyBySE;
	private String secondLevelVerifyByThirdParty;
	private String approvedByOE;
	private String approvedBySE;
	private String pendingDocuments;
	private String status;
	private String remark;
	
	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "cid") private CustomerDetails customerdetails;
	 */

	public int getDocumentVerificationId() {
		return documentVerificationId;
	}
	public void setDocumentVerificationId(int documentVerificationId) {
		this.documentVerificationId = documentVerificationId;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	
	public String getFirstLevelVerifyByOE() {
		return firstLevelVerifyByOE;
	}

	public void setFirstLevelVerifyByOE(String firstLevelVerifyByOE) {
		this.firstLevelVerifyByOE = firstLevelVerifyByOE;
	}

	public String getFirstLevelVerifyBySE() {
		return firstLevelVerifyBySE;
	}

	public void setFirstLevelVerifyBySE(String firstLevelVerifyBySE) {
		this.firstLevelVerifyBySE = firstLevelVerifyBySE;
	}

	public String getSecondLevelVerifyByThirdParty() {
		return secondLevelVerifyByThirdParty;
	}

	public void setSecondLevelVerifyByThirdParty(String secondLevelVerifyByThirdParty) {
		this.secondLevelVerifyByThirdParty = secondLevelVerifyByThirdParty;
	}

	public String getApprovedByOE() {
		return approvedByOE;
	}

	public void setApprovedByOE(String approvedByOE) {
		this.approvedByOE = approvedByOE;
	}

	public String getApprovedBySE() {
		return approvedBySE;
	}

	public void setApprovedBySE(String approvedBySE) {
		this.approvedBySE = approvedBySE;
	}

	public String getPendingDocuments() {
		return pendingDocuments;
	}

	public void setPendingDocuments(String pendingDocuments) {
		this.pendingDocuments = pendingDocuments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	/*
	 * public CustomerDetails getCustomerdetails() { return customerdetails; }
	 * 
	 * public void setCustomerdetails(CustomerDetails customerdetails) {
	 * this.customerdetails = customerdetails; }
	 */
	
	
	
	
}
