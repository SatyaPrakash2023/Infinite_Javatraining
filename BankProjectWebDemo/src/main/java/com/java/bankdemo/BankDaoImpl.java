package com.java.bankdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankDaoImpl implements BankDAO  {
	Connection connection;
	PreparedStatement pst;

	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = BankConnectionHelper.getConnection();
		String cmd = "select case when max(AccountNo) is Null Then"
				+" 1 else max(AccountNo)+1 end accno from Bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
		
	}

	@Override
	public String createAccountDao(Bank bank) throws ClassNotFoundException, SQLException {
		int id = generateAccountNo();
		connection = BankConnectionHelper.getConnection();
		String cmd = "Insert into Bank(AccountNo,FirstName,LastName,City,state,amount,cheqfacil,AccountType) values(?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		bank.setAccountNo(id);
		pst.setInt(1,bank.getAccountNo());
		pst.setString(2, bank.getFirstName());
		pst.setString(3, bank.getLastName());
		pst.setString(4, bank.getCity());
		pst.setString(5, bank.getState());
		pst.setDouble(6, bank.getAmount());
		pst.setString(7, bank.getCheqFacil());
		pst.setString(8, bank.getAccountType());
		pst.executeUpdate();
		return "Account created with Account No...";
	}

	
	public Bank searchDAO(int accountNo) throws ClassNotFoundException, SQLException {
		connection = BankConnectionHelper.getConnection();
		String cmd = "select * from Bank where accountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Bank bank = null;
		if (rs.next()) {
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getInt("amount"));
			bank.setCheqFacil(rs.getString("cheqFacil"));
			bank.setAccountType(rs.getString("accountType"));
			bank.setDateOfopen(rs.getDate("dateOfOpen"));
			bank.setStatus(rs.getString("status"));
		}
		return bank;
	}

	@Override
	public String closeAccountDao(int accountNo) throws ClassNotFoundException, SQLException {
		Bank bank = searchDAO(accountNo);
		if(bank!=null) {
			connection = BankConnectionHelper.getConnection();
			String cmd ="update bank set status='inactive' where accountNo=?";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			return"Account closed...";
		}
		return "Account Not found...";
	}

	
	public String depositeAccountDao(int accountNo, int depositeAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchDAO(accountNo);
		if(bank!=null) {
			connection = BankConnectionHelper.getConnection();
			String cmd = "Update Bank set Amount = Amount + ? where AccountNo=?";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, depositeAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			
			cmd = "Insert Into trans(AccountNo,TransAmount,TransType) values(?,?,?)";
			pst=connection.prepareStatement(cmd);
			pst.setInt(1,accountNo);
			pst.setInt(2,depositeAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			return "Amount Credited...";
			
		}
		
		return "Account Not found..";
	}

	@Override
	public String withdrawAccountDao(int accountNo, int withdrawAmount) throws ClassNotFoundException, SQLException {
		
		Bank bank = searchDAO(accountNo);
		if(bank!=null) {
			int amount = bank.getAmount();
			if(amount-withdrawAmount>=1000) {
				connection = BankConnectionHelper.getConnection();
				String cmd = "Update Bank set Amount= Amount - ? where accountNo = ?";
				pst=connection.prepareStatement(cmd);
				pst.setInt(1,withdrawAmount);
				pst.setInt(2, accountNo);
				pst.executeUpdate();
				cmd = "Insert into Trans(AccountNo,TransAmount,TransType) values(?,?,?)";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setInt(2, withdrawAmount);
				pst.setString(3, "D");
				pst.executeUpdate();
				return "Amount Debited...";
			} else {
				return "Insufficient Funds...";
			}
		}
		return "Account No Not Found...";
				
			}
		
		
	}

