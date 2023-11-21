package com.java.state;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDAO{
	
	PreparedStatement pst;
	Connection connection;

	@Override
	public String createUser(Login login) throws ClassNotFoundException, SQLException {
		connection = StateConnectionHelper.getConnection();
		String pwd = EncryptPassWord.getCode(login.getPassCode());
		String cmd = "Insert into login(userName,passCode) values(?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, login.getUserName());
		pst.setString(2, pwd);
		pst.executeUpdate();
		return"Account Created With Encrypted Password.....";
	}

}
