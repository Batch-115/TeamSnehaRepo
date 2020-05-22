package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApprovalLetter {
	@Id
	private int approvalLetterId;
	private int customerId ;
	private int productId ;
	private int loanId;
	private int apporedLoanAmount;
	private int IntrestRate;
	private int totalAmountRepaid;
	
	public int getApprovalLetterId() {
		return approvalLetterId;
	}
	public void setApprovalLetterId(int approvalLetterId) {
		this.approvalLetterId = approvalLetterId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getApporedLoanAmount() {
		return apporedLoanAmount;
	}
	public void setApporedLoanAmount(int apporedLoanAmount) {
		this.apporedLoanAmount = apporedLoanAmount;
	}
	public int getIntrestRate() {
		return IntrestRate;
	}
	public void setIntrestRate(int intrestRate) {
		IntrestRate = intrestRate;
	}
	public int getTotalAmountRepaid() {
		return totalAmountRepaid;
	}
	public void setTotalAmountRepaid(int totalAmountRepaid) {
		this.totalAmountRepaid = totalAmountRepaid;
	}
	
	
}
