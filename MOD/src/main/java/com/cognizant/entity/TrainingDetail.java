package com.cognizant.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrainingDetail {

	
private static final long serialVersionUID=1L;
	
	@Id
	private long id;
	private String status;
	private Integer progress;
	private Float commissionAmount;
	
	private float avgRating=0.0f;
	private String startDate;
	private String endDate;

	private String startTime;

	private String endTime;
	private float amountReceived=0.0f;
	private long userId;
	private  long userName;

	private long mentorId;
	private  long mentorName;

	private  long skillId;
	private  long skillName;

	private float fees;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Float getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(Float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	public float getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public float getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(float amountReceived) {
		this.amountReceived = amountReceived;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getUserName() {
		return userName;
	}

	public void setUserName(long userName) {
		this.userName = userName;
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

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public long getSkillName() {
		return skillName;
	}

	public void setSkillName(long skillName) {
		this.skillName = skillName;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
