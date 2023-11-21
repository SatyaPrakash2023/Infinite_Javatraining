package com.java.comp;

import java.sql.SQLException;

public interface ComplaintDAO {
	String addComplain(Complaint comp) throws SQLException, ClassNotFoundException;

}
