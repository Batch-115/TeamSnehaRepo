package com.webcore.app.easyemi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customercibil")
public class CustomerCibil {
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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cibilId")
	private int cibilId;
	@Column(name = "score")
	private float cibilScore;
	@Column(name = "remark")
	private String cibilRemark;
	@Column(name = "DateAndTime")
	private String cibilScoreDateTime;
	
	
	public String getCibilScoreDateTime() {
		return cibilScoreDateTime;
	}
	public void setCibilScoreDateTime(String cibilScoreDateTime) {
		this.cibilScoreDateTime = cibilScoreDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Column(name = "status")
	private String status;
	
	private int customerId;


	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
