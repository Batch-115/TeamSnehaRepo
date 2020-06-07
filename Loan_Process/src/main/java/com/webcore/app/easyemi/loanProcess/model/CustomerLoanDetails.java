package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerLoanDetails {
	@Id
	private int customerLoanDetailsId;
	private int customerId;
	private float loanAmount;
	private float interestRate;
	private int loanTenure;
	private float loanInterest;
	private float totalRepayment;
	private float loanInstallment;
	private int numberOfInstallment;
	private String loanDisbursalDate;
	private String interestStartDate;
	private String firstDuaDate;
	private float processFees;
	private float otherCharges;
	
	public int getCustomerLoanDetailsId() {
		return customerLoanDetailsId;
	}
	public void setCustomerLoanDetailsId(int customerLoanDetailsId) {
		this.customerLoanDetailsId = customerLoanDetailsId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public int getLoanTenure() {
		return loanTenure;
	}
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}
	public float getLoanInterest() {
		return loanInterest;
	}
	public void setLoanInterest(float loanInterest) {
		this.loanInterest = loanInterest;
	}
	public float getTotalRepayment() {
		return totalRepayment;
	}
	public void setTotalRepayment(float totalRepayment) {
		this.totalRepayment = totalRepayment;
	}
	public float getLoanInstallment() {
		return loanInstallment;
	}
	public void setLoanInstallment(float loanInstallment) {
		this.loanInstallment = loanInstallment;
	}
	public int getNumberOfInstallment() {
		return numberOfInstallment;
	}
	public void setNumberOfInstallment(int numberOfInstallment) {
		this.numberOfInstallment = numberOfInstallment;
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
	public String getFirstDuaDate() {
		return firstDuaDate;
	}
	public void setFirstDuaDate(String firstDuaDate) {
		this.firstDuaDate = firstDuaDate;
	}
	public float getProcessFees() {
		return processFees;
	}
	public void setProcessFees(float processFees) {
		this.processFees = processFees;
	}
	public float getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(float otherCharges) {
		this.otherCharges = otherCharges;
	}
}
