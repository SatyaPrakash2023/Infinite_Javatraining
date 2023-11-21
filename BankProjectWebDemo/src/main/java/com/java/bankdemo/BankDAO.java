package com.java.bankdemo;

import java.sql.SQLException;



public interface BankDAO {
	String createAccountDao(Bank bank) throws ClassNotFoundException, SQLException;
	Bank searchDAO(int accountNo)throws ClassNotFoundException, SQLException;
	String closeAccountDao(int accountNo) throws ClassNotFoundException, SQLException;
	String depositeAccountDao(int accountNo,int depositeAmount) throws ClassNotFoundException, SQLException;
	String withdrawAccountDao(int accountNo,int withdrawAmount) throws ClassNotFoundException, SQLException;

	

}
