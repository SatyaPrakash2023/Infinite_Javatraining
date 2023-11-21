package com.java.otp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class LoginCustomerDaoImpl implements LoginCustomerDAO {
	PreparedStatement pst;
	Connection connection;

	@Override
	public String CreateUser(LoginCustomer log_cust) throws ClassNotFoundException, SQLException {
		connection = OtpConnectionHelper.getConnection();
		String pwd = EncryptPassWord.getCode(log_cust.getCustomerPassword());
		String cmd = "Insert into customer(customer_Firstname,customer_LastName,customer_UserName,customer_Password,customer_Email,customer_Status,customer_Activation) values(?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, log_cust.getCustomerFirstName());
		pst.setString(2, log_cust.getCustomerLastName());
		pst.setString(3, log_cust.getCustomeruserName());
		pst.setString(4, pwd);
		pst.setString(5, log_cust.getCustomerEmail());
		pst.setString(6, log_cust.getCustomerStatus());
		pst.setString(7, log_cust.getCustomerActvationTime());
		pst.executeUpdate();
		return"Record Created in Customer...";
	}

}
