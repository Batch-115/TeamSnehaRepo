package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoanCalculation {
	@Id
	private int loanId;
	private float loanAmount;
	private float interestRate;
	private int loanTenure;
	private float loanInterest;
	private float totalRepayment;
	private float loanInstallment;

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
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	

}
