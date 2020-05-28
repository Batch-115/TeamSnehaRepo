package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustmerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custmerId;
	private String custerName;
	private String custermerAddress;
	public int getCustmerId() {
		return custmerId;
	}
	public void setCustmerId(int custmerId) {
		this.custmerId = custmerId;
	}
	public String getCusterName() {
		return custerName;
	}
	public void setCusterName(String custerName) {
		this.custerName = custerName;
	}
	public String getCustermerAddress() {
		return custermerAddress;
	}
	public void setCustermerAddress(String custermerAddress) {
		this.custermerAddress = custermerAddress;
	}
	
	
	
}
