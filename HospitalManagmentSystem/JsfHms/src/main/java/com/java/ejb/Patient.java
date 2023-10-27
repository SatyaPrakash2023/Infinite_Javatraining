package com.java.ejb;

import java.io.Serializable;

public class Patient implements Serializable {
	private String pid;
	private String name;
	private int age;
	private int weight;
	private String gender;
	private String address;
	private String phoneNo;
	private String disease;
	private String doctId;
	private String passWord;
	private String email;
	private String status;
	private int Otp;
	private String retypePass;
	public int getOtp() {
		return Otp;
	}
	public void setOtp(int otp) {
		Otp = otp;
	}
	public String getPassWord() {                                   
		return passWord;                                            
	}                                                               
	public void setPassWord(String passWord) {                      
		this.passWord = passWord;                                   
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
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
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String pid, String name, int age, int weight, String gender, String address, String phoneNo,
			String disease, String doctId, String passWord, String email, String status, int otp,String retypePass) {
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
		this.passWord = passWord;
		this.email = email;
		this.status = status;
		this.Otp = otp;
		this.retypePass=retypePass;
	}
	public String getRetypePass() {
		return retypePass;
	}
	public void setRetypePass(String retypePass) {
		this.retypePass = retypePass;
	}
	
	
	
	
	
}
