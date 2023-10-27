package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class DoctorDaoImpl {
	public List<Doctor>showDoctorDao(){
		SessionFactory sf=SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr=session.createCriteria(Doctor.class);
		List<Doctor>drList=cr.list();
		return drList;
	}
}
