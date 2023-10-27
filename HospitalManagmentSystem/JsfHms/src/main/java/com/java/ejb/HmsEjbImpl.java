package com.java.ejb;

import java.sql.SQLException;    
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.naming.NamingException;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class HmsEjbImpl {
	
private String localCode;
	
	
	
	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
	public void employLocalCodeChanged(ValueChangeEvent e) {
		this.localCode=e.getNewValue().toString();
	}
	
	public List<String>getRoomTypeEjb() throws ClassNotFoundException, SQLException, NamingException{
		HmsBeanRemote remote= RemoteHelper.lookupRemoteStatelessEmploy();
		List<String>rmList= remote.getRoomType();
		return rmList;

	}
	
	
	
	public List<Doctor>showDoctorEjb() throws ClassNotFoundException, SQLException, NamingException{
		HmsBeanRemote remote= RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showDoctor();
	}
	
	public List<Room>showRoomEjb() throws ClassNotFoundException, SQLException, NamingException{
		HmsBeanRemote remote= RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showRoom();
	}
	
	public String  addPatientEjb(Patient patient,String pid) throws NamingException, ClassNotFoundException, SQLException {
		HmsBeanRemote remote= RemoteHelper.lookupRemoteStatelessEmploy();
		patient.setDoctId(pid);
		remote.addPatient(patient);
		return"ShowDoctor.jsp?faces-redirect=true";
	}
	
	public String  addDoctorIdEjb(String doctId) throws NamingException, ClassNotFoundException, SQLException {
		HmsBeanRemote remote= RemoteHelper.lookupRemoteStatelessEmploy();
		Map<String,Object>sessionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("doctId", doctId);
		return"AddPatient.jsp?faces-redirect=true";
	}
	
	public List<Patient>showPatientEjb() throws ClassNotFoundException, SQLException, NamingException{
		HmsBeanRemote remote= RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showPatient();
	}
	public String RoomAllocationEjb(String pid) throws NamingException {
		HmsBeanRemote remote= RemoteHelper.lookupRemoteStatelessEmploy();
		Map<String,Object>sessionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("pid", pid);
		return"RoomAllocation.jsp?faces-redirect=true";
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
		
		String pid=patient.getPid();
		Map<String,Object>sessionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("pid",pid);

		//return "Your account created sucessfully";

		return"OTPVerification.jsp?faces-redirect=true";
	}
	
	public String verifyOtp(Patient patient) {
		SessionFactory sf= SessionHelper.getConnection();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("name", patient.getName()));
		cr.add(Restrictions.eq("Otp", patient.getOtp()));
		cr.setProjection(Projections.rowCount());
		long count=(long)cr.uniqueResult();
		System.out.println(count);
		
		if(count==1) {
			String pid=patient.getPid();
			Map<String,Object>sessionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap.put("pid",pid);
			return"ResetPassword.jsp?faces-redirect=true";
		}else {
			
			return "ShowDoctor.jsp?faces-redirect=true";
		}
		
	}
	
	public String ResetPassWOrd(Patient patient) {
		SessionFactory sf= SessionHelper.getConnection();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("name", patient.getName()));
		Patient pt=(Patient) cr.uniqueResult();
		
		String encr=EncryptPassword.getCode(patient.getPassWord());
		pt.setPassWord(encr);
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.update(pt);
		session.getTransaction().commit();	
		return"Login.jsp?faces-redirect=true";
		
		
	}
	
	public String Login(Patient patient) {
		SessionFactory sf= SessionHelper.getConnection();
		Session session=sf.openSession();
		Criteria cr=session.createCriteria(Patient.class);
		cr.add(Restrictions.eq("name", patient.getName()));
		String encr=EncryptPassword.getCode(patient.getPassWord());

		cr.add(Restrictions.eq("passWord", encr.trim()));
		cr.setProjection(Projections.rowCount());
		long count=(long)cr.uniqueResult();
		System.out.println(count);
		
		if(count==1) {
			String pid=patient.getPid();
			Map<String,Object>sessionMap=FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap.put("pid",pid);
			return"Dashboard.jsp?faces-redirect=true";
		}else {
			
			return"Login.jsp?faces-redirect=true";
		}

	
	}	
}
