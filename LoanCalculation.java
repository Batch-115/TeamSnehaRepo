package com.webcore.app.easyemi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LoanCalculation")
public class LoanCalculation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loanid")
	private int loanId;
	@Column(name = "principal")
	private float loanAmount;
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
	@Column(name = "rateofinterest")
	private float interestRate;
	@Column(name = "tenureinmonth")
	private int loanTenure;
	@Column(name = "totalinterest")
	private float loanInterest;
	@Column(name = "repayment")
	private float totalRepayment;
	@Column(name = "monthlyemi")
	private float loanInstallment;
	
	
	

}
