package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

public interface HmsDAO {
	List<Doctor>showDoctorDao()throws ClassNotFoundException, SQLException;
	List<Room>showRoomDao()throws ClassNotFoundException, SQLException;
	String addPatientDao(Patient patient)throws ClassNotFoundException, SQLException;
	List<Patient>showPatientDao()throws ClassNotFoundException, SQLException;
	List<String> getRoomType() throws ClassNotFoundException, SQLException;


}
