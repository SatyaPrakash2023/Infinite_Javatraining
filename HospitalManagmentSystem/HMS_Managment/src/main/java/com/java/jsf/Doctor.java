package com.java.jsf;

public class Doctor {
	private String doctId;
	private String doctName;
	private String Dept;
	public String getDoctId() {
		return doctId;
	}
	public void setDoctId(String doctId) {
		this.doctId = doctId;
	}
	public String getDoctName() {
		return doctName;
	}
	public void setDoctName(String doctName) {
		this.doctName = doctName;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String doctId, String doctName, String dept) {
		super();
		this.doctId = doctId;
		this.doctName = doctName;
		Dept = dept;
	}
	
	
}
