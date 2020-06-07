package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Column(name = "repayment")
	private float totalRepayment;
	@Column(name = "monthlyemi")
	private float loanInstallment;
	
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
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
	private float rateOfInterest;
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	@Column(name = "tenureinmonth")
	private int tenure;
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	@Column(name = "totalinterest")
	private float totalInterest;
	public float getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(float totalInterest) {
		this.totalInterest = totalInterest;
	}
	
	
	
}
