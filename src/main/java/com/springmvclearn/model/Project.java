package com.springmvclearn.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project implements Serializable {
	private int id;
	private String projectName;
	private float expectedAnnualRateOfReturn;
	private int holdingPeriod;
	private int purchaseAmount;
	private float CrowdingProgress;
	private String crowdStatus;
	@GeneratedValue
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public float getExpectedAnnualRateOfReturn() {
		return expectedAnnualRateOfReturn;
	}
	public void setExpectedAnnualRateOfReturn(float expectedAnnualRateOfReturn) {
		this.expectedAnnualRateOfReturn = expectedAnnualRateOfReturn;
	}
	public int getHoldingPeriod() {
		return holdingPeriod;
	}
	public void setHoldingPeriod(int holdingPeriod) {
		this.holdingPeriod = holdingPeriod;
	}
	public int getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public float getCrowdingProgress() {
		return CrowdingProgress;
	}
	public void setCrowdingProgress(float crowdingProgress) {
		CrowdingProgress = crowdingProgress;
	}
	public String getCrowdStatus() {
		return crowdStatus;
	}
	public void setCrowdStatus(String crowdStatus) {
		this.crowdStatus = crowdStatus;
	}

}
