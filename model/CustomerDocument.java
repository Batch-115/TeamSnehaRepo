package com.webcore.app.easyemi.loanprocess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CustomerDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int documentId;
	@Column(length = 16777215)
	private String addressProof;
	
	@Column(length = 16777215)
	private String idProof;
	
	@Column(length = 16777215)
	private String photo;
	
	@Column(length = 16777215)
	private String blankcheque;
	
	@Column(length = 16777215)
	private String signature;
	
	@Column(length = 16777215)
	private String bankStatement;
	
	private int status;

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	public String getAddressProof() {
		return addressProof;
	}

	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBlankcheque() {
		return blankcheque;
	}

	public void setBlankcheque(String blankcheque) {
		this.blankcheque = blankcheque;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getBankStatement() {
		return bankStatement;
	}

	public void setBankStatement(String bankStatement) {
		this.bankStatement = bankStatement;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
