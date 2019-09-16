package com.cognizant.entity;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.Id;
@Entity
	public class Technologies implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3524503380930162795L;
	@Id

	private long technologiesId;
	private  String technologiesName;
	public long getTechnologiesId() {
		return technologiesId;
	}
	public void setTechnologiesId(long technologiesId) {
		this.technologiesId = technologiesId;
	}
	public String getTechnologiesName() {
		return technologiesName;
	}
	public void setTechnologiesName(String technologiesName) {
		this.technologiesName = technologiesName;
	}
	@Override
	public String toString() {
		return "Technologies [technologiesId=" + technologiesId + ", technologiesName=" + technologiesName + "]";
	}
	
	

	

}
