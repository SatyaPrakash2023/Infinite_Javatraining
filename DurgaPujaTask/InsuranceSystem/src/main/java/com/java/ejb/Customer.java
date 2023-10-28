package com.java.ejb;

import java.io.Serializable; 
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class Customer implements Serializable{

	
	@Id
	@Column(name="Cust_ID")
	private String custId;
	
	@Column(name="Firstname")
	private String firstName;
	
	@Column(name="Lastname")
	private String lastName;
	
	@Column(name="Gender")
	private String gender;
	
	@Column(name="DateOfBirth")
	private Date dateOfbirth;
	
	@Column(name="UserName")
	private String userName;
	
	@Column(name="PassCode")
	private String passCode;
	
	@Column(name="Status")
	private String status;
	
	private String retypePassCode;
	private String email;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassCode() {
		return passCode;
	}

	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

	public String getRetypePassCode() {
		return retypePassCode;
	}

	public void setRetypePassCode(String retypePassCode) {
		this.retypePassCode = retypePassCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Customer(String custId, String firstName, String lastName, String gender, Date dateOfbirth, String userName,
			String passCode, String status, String retypePassCode, String email) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfbirth = dateOfbirth;
		this.userName = userName;
		this.passCode = passCode;
		this.status = status;
		this.retypePassCode = retypePassCode;
		this.email = email;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", gender="
				+ gender + ", dateOfbirth=" + dateOfbirth + ", userName=" + userName + ", passCode=" + passCode
				+ ", status=" + status + ", retypePassCode=" + retypePassCode + ", email=" + email + "]";
	}

	
	
	
	
	
}
