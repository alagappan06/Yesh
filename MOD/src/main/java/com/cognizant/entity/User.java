package com.cognizant.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userId;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private long contactNumber;
	private String regCode;
	private String role;
	private String linkedinUrl;
	private Float yearOfExperiance;
	private boolean active;
	private Boolean confirmSignUp;
	private boolean resetPassword;
	private boolean resetPasswordDate;
	private String usertype;
	
	
	public boolean isblock;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
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
	public String getRegCode() {
		return regCode;
	}
	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
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
	public boolean isResetPasswordDate() {
		return resetPasswordDate;
	}
	public void setResetPasswordDate(boolean resetPasswordDate) {
		this.resetPasswordDate = resetPasswordDate;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public boolean getIsblock() {
		return isblock;
	}
	public void setIsblock(boolean isblock) {
		this.isblock = isblock;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", username="
				+ username + ", password=" + password + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", regCode=" + regCode + ", role=" + role + ", linkedinUrl=" + linkedinUrl + ", yearOfExperiance="
				+ yearOfExperiance + ", active=" + active + ", confirmSignUp=" + confirmSignUp + ", resetPassword="
				+ resetPassword + ", resetPasswordDate=" + resetPasswordDate + ", usertype=" + usertype +  ", isblock=" + isblock + "]";
	}
	
	

}



	
