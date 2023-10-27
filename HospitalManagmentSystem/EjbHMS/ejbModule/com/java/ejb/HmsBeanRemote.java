package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;

@Remote
public interface HmsBeanRemote {
	List<Doctor>showDoctor() throws ClassNotFoundException, SQLException;
	List<Room>showRoom()throws ClassNotFoundException, SQLException;
	String addPatient(Patient patient)throws ClassNotFoundException, SQLException;
	List<Patient>showPatient()throws ClassNotFoundException, SQLException;
	List<String>getRoomType() throws ClassNotFoundException, SQLException;


}
