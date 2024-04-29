package com.java.ejb;

import java.util.List;

import javax.ejb.Remote; 



@Remote
public interface DoctorBeanRemote {
	List<Doctor> showDoctor();
	String AddDoctor(Doctor doctor);
	Doctor SearchDoctor(String doctorId);
	String UpdateDoctor(Doctor doctor);
	String DeleteDoctorDetails(Doctor doctor);
}
