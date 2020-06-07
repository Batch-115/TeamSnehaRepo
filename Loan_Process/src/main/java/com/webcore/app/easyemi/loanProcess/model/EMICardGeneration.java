package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EMICardGeneration {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int emiCardId;
private int customerId;
private Double currentMaxloanLimit;
private Double nextMaxLoanLimit;
private Double interestRate;
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
public Double getCurrentMaxloanLimit() {
	return currentMaxloanLimit;
}
public void setCurrentMaxloanLimit(Double currentMaxloanLimit) {
	this.currentMaxloanLimit = currentMaxloanLimit;
}
public Double getNextMaxLoanLimit() {
	return nextMaxLoanLimit;
}
public void setNextMaxLoanLimit(Double nextMaxLoanLimit) {
	this.nextMaxLoanLimit = nextMaxLoanLimit;
}
public Double getInterestRate() {
	return interestRate;
}
public void setInterestRate(Double interestRate) {
	this.interestRate = interestRate;
}

}
