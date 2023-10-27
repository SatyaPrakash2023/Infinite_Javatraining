package com.java.jsf;

import java.util.List;

public class DoctorDao {
	private Doctor doctor;
	private DoctorDaoImpl impl;
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public DoctorDaoImpl getImpl() {
		return impl;
	}
	public void setImpl(DoctorDaoImpl impl) {
		this.impl = impl;
	}
	
	public List<Doctor> showDoctorDaoImpl() {
		return impl.showDoctorDao();
	}
}
