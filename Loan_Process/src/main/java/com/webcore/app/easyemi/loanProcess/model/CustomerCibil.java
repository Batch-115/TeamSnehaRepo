package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerCibil {
@Id
private int cibilId;
private int customerId;
private float cibilScore;
private String cibilRemark;

public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getCibilId() {
	return cibilId;
}
public void setCibilId(int cibilId) {
	this.cibilId = cibilId;
}
public float getCibilScore() {
	return cibilScore;
}
public void setCibilScore(float cibilScore) {
	this.cibilScore = cibilScore;
}
public String getCibilRemark() {
	return cibilRemark;
}
public void setCibilRemark(String cibilRemark) {
	this.cibilRemark = cibilRemark;
}
}
