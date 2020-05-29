package com.webcore.app.easyemi.loanprocess.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EMICardGeneration {
@Id
private int emiCardId;
private int customerId;
private int emiCardNo;
private String customerName;
private int emiCardCvv;
private String emiCardGenerationDate;
private String emiCardExpiredDate;
private float emiCardGenerationCharges;

public int getEmiCardId() {
	return emiCardId;
}
public void setEmiCardId(int emiCardId) {
	this.emiCardId = emiCardId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getEmiCardNo() {
	return emiCardNo;
}
public void setEmiCardNo(int emiCardNo) {
	this.emiCardNo = emiCardNo;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getEmiCardCvv() {
	return emiCardCvv;
}
public void setEmiCardCvv(int emiCardCvv) {
	this.emiCardCvv = emiCardCvv;
}
public String getEmiCardGenerationDate() {
	return emiCardGenerationDate;
}
public void setEmiCardGenerationDate(String emiCardGenerationDate) {
	this.emiCardGenerationDate = emiCardGenerationDate;
}
public String getEmiCardExpiredDate() {
	return emiCardExpiredDate;
}
public void setEmiCardExpiredDate(String emiCardExpiredDate) {
	this.emiCardExpiredDate = emiCardExpiredDate;
}
public float getEmiCardGenerationCharges() {
	return emiCardGenerationCharges;
}
public void setEmiCardGenerationCharges(float emiCardGenerationCharges) {
	this.emiCardGenerationCharges = emiCardGenerationCharges;
}



}
