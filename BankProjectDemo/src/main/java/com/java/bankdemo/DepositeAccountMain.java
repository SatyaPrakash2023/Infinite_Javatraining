package com.java.bankdemo;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositeAccountMain {
	
	public static void main(String[] args) {
		int accountNo,depositeAmount;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account No...");
		
		accountNo=sc.nextInt();
		System.out.println("Enter Deposite Amount..");
		depositeAmount = sc.nextInt();
		BankDAO dao = new BankDaoImpl();
		
		
		try {
			System.out.println(dao.depositeAccountDao(accountNo, depositeAmount));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
