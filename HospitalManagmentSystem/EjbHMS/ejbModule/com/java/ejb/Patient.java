package com.java.ejb;

import java.io.Serializable;



public class Patient implements Serializable {
	private String pid;
	private String name;
	private int age;
	private double weight;
	private Gender gender;
	private String address;
	private String phoneNo;
	private String disease;
	private String doctId;
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getDoctId() {
		return doctId;
	}
	public void setDoctId(String doctId) {
		this.doctId = doctId;
	}
	public Patient(String pid, String name, int age, double weight, Gender gender, String address, String phoneNo,
			String disease, String doctId) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
		this.disease = disease;
		this.doctId = doctId;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
