package com.java.state;

import java.sql.SQLException;

public interface LoginDAO {
	String createUser(Login login) throws ClassNotFoundException, SQLException;

}
