package com.java.comp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ComplaintDAOImpl implements ComplaintDAO {
	
	Connection  connection;
	PreparedStatement pst;

	@Override
	public String addComplain(Complaint comp) throws  ClassNotFoundException,SQLException {
		connection=ConnectionHelper.getConnection();
		String cmd="Insert into Complaint(ComplaintID,ComplaintType,CDescription,ComplaintDate, Severity,Status) values(?,?,?,?,?,?)";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, comp.getComplaintId());
		pst.setString(2, comp.getComplaintType());
		pst.setString(3, comp.getCDescription());
		pst.setDate(4, (Date) comp.getComplaintDate());
		pst.setString(5, comp.getSeverity());
		pst.setString(6, "PENDING");
		pst.executeUpdate();
		return"Complaint Registerd.....";
	}

}
