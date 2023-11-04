package com.java.jsf;

public class ProviderAuth {
	private int authId;
	private String providerId;
	private String email;
	private String userName;
	private String password;
	private String status;
	private String otp;
	private String retypePassWord;
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	
	
	public String getRetypePassWord() {
		return retypePassWord;
	}
	public void setRetypePassWord(String retypePassWord) {
		this.retypePassWord = retypePassWord;
	}
	
	
	public ProviderAuth(int authId, String providerId, String email, String userName, String password, String status,
			String otp, String retypePassWord) {
		super();
		this.authId = authId;
		this.providerId = providerId;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.otp = otp;
		this.retypePassWord = retypePassWord;
	}
	@Override
	public String toString() {
		return "ProviderAuth [authId=" + authId + ", providerId=" + providerId + ", email=" + email + ", userName="
				+ userName + ", password=" + password + ", status=" + status + ", otp=" + otp + "]";
	}
	public ProviderAuth(int authId, String providerId, String email, String userName, String password, String status,
			String otp) {
		super();
		this.authId = authId;
		this.providerId = providerId;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.status = status;
		this.otp = otp;
	}
	public ProviderAuth() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}