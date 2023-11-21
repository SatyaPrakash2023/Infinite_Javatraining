package com.java.lms;

import java.sql.SQLException;

public interface LeaveDetailsDAO {
	String applyLeave(LeaveDetails leaveDetails) throws ClassNotFoundException, SQLException;
	String approveOrDeny(int leveId,int managerId,String status,String managerComments) throws ClassNotFoundException, SQLException;

}
