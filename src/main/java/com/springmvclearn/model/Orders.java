package com.springmvclearn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {
	private int id;
	private int userid;
	private int projectid;
	private int purchaseamount;
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public int getPurchaseamount() {
		return purchaseamount;
	}
	public void setPurchaseamount(int purchaseamount) {
		this.purchaseamount = purchaseamount;
	}

}
