package com.finalAssignment.mapping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class userentities {
	@Id
	
	private int userId;
	private String username ;
	private String firstname ;
	private String lastname ;
	private String desinationId;
	private String password;
	
	
	public userentities() {
		super();
		// TODO Auto-generated constructor stub
	}
	public userentities(int userId, String username, String firstname, String lastname, String desinationId,
			String password) {
		super();
		this.userId = userId;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.desinationId = desinationId;
		this.password = password;
	}
	
	
	
	@Override
	public String toString() {
		return "userentities [userId=" + userId + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", desinationId=" + desinationId + ", password=" + password + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDesinationId() {
		return desinationId;
	}
	public void setDesinationId(String desinationId) {
		this.desinationId = desinationId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
