package com.cognizant.entity;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mentor")
public class Mentor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mentorId;
	
	private String lastName;
	private String username;
	private String password;
	private String email;
	private Date date;
	private long contactNumber;

	
	private String linkedinUrl;
	private Float yearOfExperiance;

	private Boolean confirmSignUp;
	private boolean resetPassword;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public long getUserId() {
		return mentorId;
	}
	public void setUserId(long mentorId) {
		this.mentorId = mentorId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public Float getYearOfExperiance() {
		return yearOfExperiance;
	}
	public void setYearOfExperiance(Float yearOfExperiance) {
		this.yearOfExperiance = yearOfExperiance;
	}
	public Boolean getConfirmSignUp() {
		return confirmSignUp;
	}
	public void setConfirmSignUp(Boolean confirmSignUp) {
		this.confirmSignUp = confirmSignUp;
	}
	public boolean isResetPassword() {
		return resetPassword;
	}
	public void setResetPassword(boolean resetPassword) {
		this.resetPassword = resetPassword;
	}
	@Override
	public String toString() {
		return "mentor [userId=" + mentorId + ", lastName=" + lastName + ", username=" + username + ", password="
				+ password + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", linkedinUrl=" + linkedinUrl + ", yearOfExperiance=" + yearOfExperiance + ", confirmSignUp="
				+ confirmSignUp + ", resetPassword=" + resetPassword + "]";
	}
	
	
	
	
	
	
}
	
	