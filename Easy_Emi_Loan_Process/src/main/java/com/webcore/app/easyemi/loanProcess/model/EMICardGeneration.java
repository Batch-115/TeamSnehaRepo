package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class EMICardGeneration {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int emiCardId;
private int customerId;
private Double currentMaxloanLimit;
private Double nextMaxLoanLimit;
private Double installment;

public Double getInstallment() {
	return installment;
}
public void setInstallment(Double installment) {
	this.installment = installment;
}
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


}
