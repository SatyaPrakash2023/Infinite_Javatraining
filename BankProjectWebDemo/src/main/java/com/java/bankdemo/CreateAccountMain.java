package com.java.bankdemo;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name..");
		bank.setFirstName(sc.next());
		System.out.println("Enter Last Name..");
		bank.setLastName(sc.next());
		System.out.println("Enter City Name..");
		bank.setCity(sc.next());
		System.out.println("Enter State Name..");
		bank.setState(sc.next());
		System.out.println("Enter Amount.");
		
		bank.setAmount(sc.nextInt());
		System.out.println("Enter checqFacil(yes/No)..");
		bank.setCheqFacil(sc.next());
		System.out.println("Enter Account Type..");
		
		bank.setAccountType(sc.next());
		BankDAO dao=new BankDaoImpl();
		try {
			System.out.println(dao.createAccountDao(bank));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
