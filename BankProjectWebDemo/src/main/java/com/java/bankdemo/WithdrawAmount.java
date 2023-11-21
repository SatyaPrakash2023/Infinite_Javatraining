package com.java.bankdemo;

import java.sql.SQLException;
import java.util.Scanner;



public class WithdrawAmount {
	public static void main(String[] args) {
		int accountNo,withdrawAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No ");
		accountNo =sc.nextInt();
		System.out.println("Enter Withdraw Amount..");
		withdrawAmount = sc.nextInt();
		
		BankDAO dao = new BankDaoImpl();
		
		try {
			System.out.println(dao.withdrawAccountDao(accountNo, withdrawAmount));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
