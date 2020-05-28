package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ApprovalLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int approvalLetterId;
	private int customerId ;
	private int productId ;
	private int loanId;
	private double LoanAmount;
	private float rateOfIntrest;
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
	public double getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		LoanAmount = loanAmount;
	}
	public float getRateOfIntrest() {
		return rateOfIntrest;
	}
	public void setRateOfIntrest(float rateOfIntrest) {
		this.rateOfIntrest = rateOfIntrest;
	}
	
	
	
	
	
	
}
