package com.java.ejb;

public class CustomerAuth {
	
	private int authId;
	private String custId;
	private int otp;
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public CustomerAuth(int authId, String custId, int otp) {
		super();
		this.authId = authId;
		this.custId = custId;
		this.otp = otp;
	}
	public CustomerAuth() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerAuth [authId=" + authId + ", custId=" + custId + ", otp=" + otp + "]";
	}
	
	
}
