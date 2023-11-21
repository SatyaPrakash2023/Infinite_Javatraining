package com.java.otp;

import java.sql.SQLException;

public interface LoginCustomerDAO {
	String CreateUser(LoginCustomer log_cust) throws ClassNotFoundException, SQLException;

}
