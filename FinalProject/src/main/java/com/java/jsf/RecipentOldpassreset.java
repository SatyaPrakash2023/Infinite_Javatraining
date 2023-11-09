package com.java.jsf;

public class RecipentOldpassreset {
	
	private int authId;
	private String uhId;
	private String userName;
	private String password;
	private String email;
	private String status;
	private String otp;
	private String retypePassWord;
	private String oldPassWord;
	public int getAuthId() {
		return authId;
	}
	public void setAuthId(int authId) {
		this.authId = authId;
	}
	public String getUhId() {
		return uhId;
	}
	public void setUhId(String uhId) {
		this.uhId = uhId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getOldPassWord() {
		return oldPassWord;
	}
	public void setOldPassWord(String oldPassWord) {
		this.oldPassWord = oldPassWord;
	}
	public RecipentOldpassreset(int authId, String uhId, String userName, String password, String email, String status,
			String otp, String retypePassWord, String oldPassWord) {
		super();
		this.authId = authId;
		this.uhId = uhId;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.status = status;
		this.otp = otp;
		this.retypePassWord = retypePassWord;
		this.oldPassWord = oldPassWord;
	}
	public RecipentOldpassreset() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RecipentOldpassreset [authId=" + authId + ", uhId=" + uhId + ", userName=" + userName + ", password="
				+ password + ", email=" + email + ", status=" + status + ", otp=" + otp + ", retypePassWord="
				+ retypePassWord + ", oldPassWord=" + oldPassWord + "]";
	}
	
	
	
}
