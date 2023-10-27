package com.java.jsf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class PatientDaoImpl {
	SessionFactory sf;
	Session session;
	public String AddPatient(Patient patient) {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(patient);
		transaction.commit();
		return"Employ Record Inserted....";
	}
	
	public String addPatientDao(Patient patient) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		int otp=GenerarteOtp.generateOtp();
		patient.setOtp(otp);
		session.save(patient);
		
		session.getTransaction().commit();
		

		String subject = "Welcome to Applo Hospital ";
		String messageText = "Hello,\n\nThank you for signing up for YourApp. Your account has been successfully created."+otp+"It is "
				+ "valid for 10minuetes only dont share otp";
		MailSend.mailSend(patient.getEmail(), subject, messageText);

		//return "Your account created sucessfully";

		return"OTPVerification.jsp?faces-redirect=true";
	}
	
}
