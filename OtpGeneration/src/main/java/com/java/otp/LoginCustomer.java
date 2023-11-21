package com.java.otp;

import java.sql.Date;

public class LoginCustomer {
	private int custID;
	private String customerFirstName;
	private String customerLastName;
	private String customeruserName;
	private String customerPassword;
	private String customerEmail; 
	private String customerPhoneNo;
	private String customerStatus;
	private String customerActvationTime;
	
	public LoginCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginCustomer(int custID, String customerFirstName, String customerLastName, String customeruserName,
			String customerPassword, String customerEmail, String customerPhoneNo, String customerStatus,
			String customerActvationTime) {
		super();
		this.custID = custID;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customeruserName = customeruserName;
		this.customerPassword = customerPassword;
		this.customerEmail = customerEmail;
		this.customerPhoneNo = customerPhoneNo;
		this.customerStatus = customerStatus;
		this.customerActvationTime = customerActvationTime;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getCustomeruserName() {
		return customeruserName;
	}
	public void setCustomeruserName(String customeruserName) {
		this.customeruserName = customeruserName;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhoneNo() {
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo) {
		this.customerPhoneNo = customerPhoneNo;
	}
	public String getCustomerStatus() {
		return customerStatus;
	}
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	public String getCustomerActvationTime() {
		return customerActvationTime;
	}
	public void setCustomerActvationTime(String customerActvationTime) {
		this.customerActvationTime = customerActvationTime;
	}
	@Override
	public String toString() {
		return "LoginCustomer [custID=" + custID + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customeruserName=" + customeruserName + ", customerPassword=" + customerPassword
				+ ", customerEmail=" + customerEmail + ", customerPhoneNo=" + customerPhoneNo + ", customerStatus="
				+ customerStatus + ", customerActvationTime=" + customerActvationTime + "]";
	}
	
	
	

}
