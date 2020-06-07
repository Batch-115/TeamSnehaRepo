package com.webcore.app.easyemi.loanProcess.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String customerFirstName;
	private String customerMiddleName;
	private String customerLastName;
	private String customerDataOfBirth;
	private String customerGender;
	private String customerMaritailStatus;
	private String customerMobileNumber;
	private String customerAddress;
	private String customerEducation;
	private String customerAppliedLoadAmount;
	private int status;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "did")
	private CustomerDocument customerDocument;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerMiddleName() {
		return customerMiddleName;
	}

	public void setCustomerMiddleName(String customerMiddleName) {
		this.customerMiddleName = customerMiddleName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerDataOfBirth() {
		return customerDataOfBirth;
	}

	public void setCustomerDataOfBirth(String customerDataOfBirth) {
		this.customerDataOfBirth = customerDataOfBirth;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerMaritailStatus() {
		return customerMaritailStatus;
	}

	public void setCustomerMaritailStatus(String customerMaritailStatus) {
		this.customerMaritailStatus = customerMaritailStatus;
	}

	public String getCustomerMobileNumber() {
		return customerMobileNumber;
	}

	public void setCustomerMobileNumber(String customerMobileNumber) {
		this.customerMobileNumber = customerMobileNumber;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerEducation() {
		return customerEducation;
	}

	public void setCustomerEducation(String customerEducation) {
		this.customerEducation = customerEducation;
	}

	public String getCustomerAppliedLoadAmount() {
		return customerAppliedLoadAmount;
	}

	public void setCustomerAppliedLoadAmount(String customerAppliedLoadAmount) {
		this.customerAppliedLoadAmount = customerAppliedLoadAmount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public CustomerDocument getCustomerDocument() {
		return customerDocument;
	}

	public void setCustomerDocument(CustomerDocument customerDocument) {
		this.customerDocument = customerDocument;
	}
}
