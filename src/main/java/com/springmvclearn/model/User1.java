package com.springmvclearn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User1 {

	private String userName;
	private String password;
	
	public User1(){
		
	}
	
	public User1(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	@Id
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
