package com.java.bankdemo;

import java.sql.Date;

public class Bank {
	
	private int AccountNo;
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private int amount;
	private String cheqFacil;
	private String accountType;
	private String status;
	private Date dateOfopen;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int accountNo, String firstName, String lastName, String city, String state, int amount,
			String cheqFacil, String accountType, String status, Date dateOfopen) {
		super();
		AccountNo = accountNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.amount = amount;
		this.cheqFacil = cheqFacil;
		this.accountType = accountType;
		this.status = status;
		this.dateOfopen = dateOfopen;
	}
	@Override
	public String toString() {
		return "Bank [AccountNo=" + AccountNo + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city
				+ ", state=" + state + ", amount=" + amount + ", cheqFacil=" + cheqFacil + ", accountType="
				+ accountType + ", status=" + status + ", dateOfopen=" + dateOfopen + "]";
	}
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCheqFacil() {
		return cheqFacil;
	}
	public void setCheqFacil(String cheqFacil) {
		this.cheqFacil = cheqFacil;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateOfopen() {
		return dateOfopen;
	}
	public void setDateOfopen(Date dateOfopen) {
		this.dateOfopen = dateOfopen;
	}
	
	
	
	

}
