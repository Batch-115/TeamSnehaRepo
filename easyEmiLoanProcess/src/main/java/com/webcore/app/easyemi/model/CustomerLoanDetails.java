package com.webcore.app.easyemi.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CustomerLoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanDetailId;
	private String product;
	private int loanAccountNo;
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "loanCalculation_fk",referencedColumnName = "loanId")
	private LoanCalculation loanCalculation;
	public int getLoanDetailId() {
		return loanDetailId;
	}
	public void setLoanDetailId(int loanDetailId) {
		this.loanDetailId = loanDetailId;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getLoanAccountNo() {
		return loanAccountNo;
	}
	public void setLoanAccountNo(int loanAccountNo) {
		this.loanAccountNo = loanAccountNo;
	}
	public LoanCalculation getLoanCalculation() {
		return loanCalculation;
	}
	public void setLoanCalculation(LoanCalculation loanCalculation) {
		this.loanCalculation = loanCalculation;
	}	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	private int customerId;
	
}
