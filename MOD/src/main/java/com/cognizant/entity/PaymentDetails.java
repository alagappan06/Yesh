package com.cognizant.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class PaymentDetails {

	
	
private static final long serialVersionUID=1L;
	
	@Id
	private long id;
	private String txnType;

	private Float Amount;
	
	private String remark;
	

	private long mentorId;
	private  long mentorName;

	private  long skillName;
	private Float TotalAmountToMentor;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public Float getAmount() {
		return Amount;
	}
	public void setAmount(Float amount) {
		Amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public long getMentorId() {
		return mentorId;
	}
	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}
	public long getMentorName() {
		return mentorName;
	}
	public void setMentorName(long mentorName) {
		this.mentorName = mentorName;
	}
	public long getSkillName() {
		return skillName;
	}
	public void setSkillName(long skillName) {
		this.skillName = skillName;
	}
	public Float getTotalAmountToMentor() {
		return TotalAmountToMentor;
	}
	public void setTotalAmountToMentor(Float totalAmountToMentor) {
		TotalAmountToMentor = totalAmountToMentor;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
}
