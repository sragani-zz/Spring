package com.finalAssignment.mapping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Designationentities {

	
	@Id
	private int designationId;
	private String designation;
	public Designationentities(int designationId, String designation) {
		super();
		this.designationId = designationId;
		this.designation = designation;
	}
	public Designationentities() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Designationentities [designationId=" + designationId + ", designation=" + designation + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getDesignationId() {
		return designationId;
	}
	public void setDesignationId(int designationId) {
		this.designationId = designationId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
