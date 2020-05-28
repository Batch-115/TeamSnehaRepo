package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class LoanAccountStatement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanStatementId;
	
	private int tenor;
	private float loanAmountWithRateOfInterest;
	private String loanDisbursalDate;
	private String interestStartDate;
	private String firstInstallmentDueDate;
	private String lastInstallmentDueDate;
	private float downPayment;
	private float processingFees;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cus_id")
	private CustmerDetails csd;
	
	
	public int getLoanStatementId() {
		return loanStatementId;
	}
	public void setLoanStatementId(int loanStatementId) {
		this.loanStatementId = loanStatementId;
	}
	
	public CustmerDetails getCsd() {
		return csd;
	}
	public void setCsd(CustmerDetails csd) {
		this.csd = csd;
	}
	public int getTenor() {
		return tenor;
	}
	public void setTenor(int tenor) {
		this.tenor = tenor;
	}
	public float getLoanAmountWithRateOfInterest() {
		return loanAmountWithRateOfInterest;
	}
	public void setLoanAmountWithRateOfInterest(float loanAmountWithRateOfInterest) {
		this.loanAmountWithRateOfInterest = loanAmountWithRateOfInterest;
	}
	public String getLoanDisbursalDate() {
		return loanDisbursalDate;
	}
	public void setLoanDisbursalDate(String loanDisbursalDate) {
		this.loanDisbursalDate = loanDisbursalDate;
	}
	public String getInterestStartDate() {
		return interestStartDate;
	}
	public void setInterestStartDate(String interestStartDate) {
		this.interestStartDate = interestStartDate;
	}
	public String getFirstInstallmentDueDate() {
		return firstInstallmentDueDate;
	}
	public void setFirstInstallmentDueDate(String firstInstallmentDueDate) {
		this.firstInstallmentDueDate = firstInstallmentDueDate;
	}
	public String getLastInstallmentDueDate() {
		return lastInstallmentDueDate;
	}
	public void setLastInstallmentDueDate(String lastInstallmentDueDate) {
		this.lastInstallmentDueDate = lastInstallmentDueDate;
	}
	public float getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(float downPayment) {
		this.downPayment = downPayment;
	}
	public float getProcessingFees() {
		return processingFees;
	}
	public void setProcessingFees(float processingFees) {
		this.processingFees = processingFees;
	}
	
	
	
}
