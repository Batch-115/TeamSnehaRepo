package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DocumentVerification {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int documentVerificationId;
	private int customerId;
	private String verifyByOE;
	private String verifyByThirdParty;
	private String approvedBySE;
	private String pendingDocuments;
	
	
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
	public String getVerifyByOE() {
		return verifyByOE;
	}
	public void setVerifyByOE(String verifyByOE) {
		this.verifyByOE = verifyByOE;
	}
	public String getVerifyByThirdParty() {
		return verifyByThirdParty;
	}
	public void setVerifyByThirdParty(String verifyByThirdParty) {
		this.verifyByThirdParty = verifyByThirdParty;
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
	
}
