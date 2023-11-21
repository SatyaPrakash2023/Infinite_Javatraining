package com.java.library;

public class LibUsers {
	private String userName;
	private String passWord;
	
	public LibUsers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LibUsers(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "LibUsers [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
	
	

}
