package com.java.jsf;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PharmacyOldPassImpl {
	SessionFactory sf;
	Session session;
	
	public String ResetPassWordOldpasss(PharmacyOldpass pharmacy) {
		String oldpass=EncryptPassword.getCode(pharmacy.getOldPassWord());
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr=session.createCriteria(PharmacyOldpass.class);
		cr.add(Restrictions.eq("password", oldpass));
		PharmacyOldpass pharmaFound=(PharmacyOldpass) cr.uniqueResult();
		if(pharmaFound!=null) {
			String pass1=oldpass;
			String pass2=EncryptPassword.getCode(pharmacy.getPassWord());
			if((!(pass1.contentEquals(pass2)))){
				sf = SessionHelper.getConnection();
				session = sf.openSession();
				Transaction trans = session.beginTransaction();
				String encr=EncryptPassword.getCode(pharmacy.getPassWord());
				pharmaFound.setPassWord(encr);
				pharmaFound.setStatus("Active");
				pharmaFound.setOtp("");
				session.update(pharmaFound);
				session.getTransaction().commit();
				return"LoginPharmacy.jsp?faces-redirect=true";
			 }else {
				 Map<String,Object> sessionMap = 
							FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				 sessionMap.put("resetErr", "Can Not Use Previous Password");
				return"ResetPassWordPharmacythroughOld.jsp?faces-redirect=true";
			}
			
		}else {
			Map<String,Object> sessionMap = 
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap.put("passWordErr", "Enter a valid password and try again.");
		  return"ResetPassWordPharmacythroughOld.jsp?faces-redirect=true";
		}
	}
}
