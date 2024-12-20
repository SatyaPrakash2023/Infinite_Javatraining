package com.java.ejb;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class DoctorEjbImpl {
	
	public List<Doctor> showDoctorEjb() throws ClassNotFoundException, SQLException, NamingException{
		DoctorBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showDoctor();
	}
	
	public String AddDoctor(Doctor doctor) throws ClassNotFoundException, SQLException, NamingException{
		DoctorBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		 remote.AddDoctor(doctor);
		 return"DoctorShow.jsp?faces-redirect=true";
	}
	
	public String ShowDoctorDetails(Doctor doctoredit) throws ClassNotFoundException, SQLException, NamingException{
		DoctorBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		 Doctor doctorUp=remote.SearchDoctor(doctoredit.getDoctorId());
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("editdoctor", doctorUp);
		 return"UpdateDoctor.jsp?faces-redirect=true";
	}
	
	public String SearchDoctor(String doctorId) throws ClassNotFoundException, SQLException, NamingException{
		DoctorBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		
		 Doctor doctor=remote.SearchDoctor(doctorId);
		 if(doctor!=null) {
			 Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				sessionMap.put("doctorr", doctor);
			 return"SearchDoctorShow.jsp?faces-redirect=true";
		 }else {
			return"Record Not Found..."; 
		 }	 
	}
	
	
	public String UpdateDoctor(Doctor doctor) throws ClassNotFoundException, SQLException, NamingException{
		DoctorBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		System.out.println("Hello i am inside client update method...");
		 remote.UpdateDoctor(doctor);
		 return"DoctorShow.jsp?faces-redirect=true";
	}
	
	public String DeleteDoctorDetails(Doctor doctor) throws ClassNotFoundException, SQLException, NamingException{
		DoctorBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		 remote.DeleteDoctorDetails(doctor);
		 return"DoctorShow.jsp?faces-redirect=true";
	}

}
