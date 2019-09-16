package com.cognizant.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SkillDtls {

	@Id
	private long id;
	private String name;
	private String prerequisites;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	
	
	
}
