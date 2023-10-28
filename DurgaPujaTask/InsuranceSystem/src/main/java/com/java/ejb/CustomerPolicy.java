package com.java.ejb;

import java.util.Date;

public class CustomerPolicy {
	private int policyId;
	private String custId;
	private String insuranceId;
	private double insuranceAmount;
	private String payMode;
	private Date registerDate;
	private double initialAmount;
	private int planId;
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}
	public double getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public double getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}
	public CustomerPolicy(int policyId, String custId, String insuranceId, double insuranceAmount, String payMode,
			Date registerDate, double initialAmount, int planId) {
		super();
		this.policyId = policyId;
		this.custId = custId;
		this.insuranceId = insuranceId;
		this.insuranceAmount = insuranceAmount;
		this.payMode = payMode;
		this.registerDate = registerDate;
		this.initialAmount = initialAmount;
		this.planId = planId;
	}
	public CustomerPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerPolicy [policyId=" + policyId + ", custId=" + custId + ", insuranceId=" + insuranceId
				+ ", insuranceAmount=" + insuranceAmount + ", payMode=" + payMode + ", registerDate=" + registerDate
				+ ", initialAmount=" + initialAmount + ", planId=" + planId + "]";
	}
	
	
	
	

}
