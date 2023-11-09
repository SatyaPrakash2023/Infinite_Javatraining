package com.java.jsf;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ProviderAutholdPassImpl {
	SessionFactory sf;
	Session session;
	
	
	public String ResetPassWordOldpasss(ProviderOldPass provider) {
		String oldpass=EncryptPassword.getCode(provider.getOldPassWord());
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr=session.createCriteria(ProviderOldPass.class);
		cr.add(Restrictions.eq("password", oldpass));
		ProviderOldPass provideFound=(ProviderOldPass) cr.uniqueResult();
		if(provideFound!=null) {
			String pass1=oldpass;
			String pass2=EncryptPassword.getCode(provider.getPassword());
			if((!(pass1.contentEquals(pass2)))){
				sf = SessionHelper.getConnection();
				session = sf.openSession();
				Transaction trans = session.beginTransaction();
				String encr=EncryptPassword.getCode(provider.getPassword());
				provideFound.setPassword(encr);
				provideFound.setStatus("Active");
				provideFound.setOtp("");
				session.update(provideFound);
				session.getTransaction().commit();
				return"LoginProvider.jsp?faces-redirect=true";
			 }else {
				 Map<String,Object> sessionMap = 
							FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				 sessionMap.put("resetErr", "Can Not Use Previous Password");
				return"ResetPassWordThroughOld.jsp?faces-redirect=true";
			}
			
		}else {
			Map<String,Object> sessionMap = 
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap.put("passWordErr", "Enter a valid password and try again.");
		  return"ResetPassWordThroughOld.jsp?faces-redirect=true";
		}
	}
}
