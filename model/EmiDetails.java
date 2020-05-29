package com.webcore.app.easyemi.loanprocess.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmiDetails {

	@Id
	private int emiDetailsId;
	private int customerId;
	private int productId ;
	private String customerName;
	private float monthlyEmiAmount;
	private int NoOfEmi;
	public int getEmiDetailsId() {
		return emiDetailsId;
	}
	public void setEmiDetailsId(int emiDetailsId) {
		this.emiDetailsId = emiDetailsId;
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
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getMonthlyEmiAmount() {
		return monthlyEmiAmount;
	}
	public void setMonthlyEmiAmount(float monthlyEmiAmount) {
		this.monthlyEmiAmount = monthlyEmiAmount;
	}
	public int getNoOfEmi() {
		return NoOfEmi;
	}
	public void setNoOfEmi(int noOfEmi) {
		NoOfEmi = noOfEmi;
	}
	
}
