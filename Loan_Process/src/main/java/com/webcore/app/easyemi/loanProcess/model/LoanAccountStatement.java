package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Date;
@Entity
public class LoanAccountStatement {

	@Id
	private String loanStatementId;
	private int customerId;
	private String customerName;
	private String productId;
	private String branch;
	private String customerMobNo;
	private Long totalLoanAmount;
	private float rateOfInterest;
	private int tenor;
	private Long loanAmountWithRateOfInterest;
	private Date loanDisbursalDate;
	private Date interestStartDate;
	private Date firstInstallmentDueDate;
	private Date lastInstallmentDueDate;
	private Long downPayment;
	private Long processingFees;
	
	public String getLoanStatementId() {
		return loanStatementId;
	}
	public void setLoanStatementId(String loanStatementId) {
		this.loanStatementId = loanStatementId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCustomerMobNo() {
		return customerMobNo;
	}
	public void setCustomerMobNo(String customerMobNo) {
		this.customerMobNo = customerMobNo;
	}
	public Long getTotalLoanAmount() {
		return totalLoanAmount;
	}
	public void setTotalLoanAmount(Long totalLoanAmount) {
		this.totalLoanAmount = totalLoanAmount;
	}
	
	public int getTenor() {
		return tenor;
	}
	public void setTenor(int tenor) {
		this.tenor = tenor;
	}
	public Long getLoanAmountWithRateOfInterest() {
		return loanAmountWithRateOfInterest;
	}
	public void setLoanAmountWithRateOfInterest(Long loanAmountWithRateOfInterest) {
		this.loanAmountWithRateOfInterest = loanAmountWithRateOfInterest;
	}
	public Date getLoanDisbursalDate() {
		return loanDisbursalDate;
	}
	public void setLoanDisbursalDate(Date loanDisbursalDate) {
		this.loanDisbursalDate = loanDisbursalDate;
	}
	public Date getInterestStartDate() {
		return interestStartDate;
	}
	public void setInterestStartDate(Date interestStartDate) {
		this.interestStartDate = interestStartDate;
	}
	public Date getFirstInstallmentDueDate() {
		return firstInstallmentDueDate;
	}
	public void setFirstInstallmentDueDate(Date firstInstallmentDueDate) {
		this.firstInstallmentDueDate = firstInstallmentDueDate;
	}
	public Date getLastInstallmentDueDate() {
		return lastInstallmentDueDate;
	}
	public void setLastInstallmentDueDate(Date lastInstallmentDueDate) {
		this.lastInstallmentDueDate = lastInstallmentDueDate;
	}
	public Long getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(Long downPayment) {
		this.downPayment = downPayment;
	}
	public Long getProcessingFees() {
		return processingFees;
	}
	public void setProcessingFees(Long processingFees) {
		this.processingFees = processingFees;
	}
	
	
}
