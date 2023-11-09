package com.java.jsf;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class RecipentOldpassImpl {
	SessionFactory sf;
	Session session;
	
	
	public String ResetPassWordOldpasss(RecipentOldpassreset recipent) {
		String oldpass=EncryptPassword.getCode(recipent.getPassword());
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr=session.createCriteria(RecipentOldpassreset.class);
		cr.add(Restrictions.eq("password", oldpass));
		RecipentOldpassreset recipentFound=(RecipentOldpassreset) cr.uniqueResult();
		if(recipentFound!=null) {
			String pass1=oldpass;
			String pass2=EncryptPassword.getCode(recipent.getPassword());
			if((!(pass1.contentEquals(pass2)))){
				sf = SessionHelper.getConnection();
				session = sf.openSession();
				Transaction trans = session.beginTransaction();
				String encr=EncryptPassword.getCode(recipent.getPassword());
				recipentFound.setPassword(encr);
				recipentFound.setStatus("Active");
				recipentFound.setOtp("");
				session.update(recipentFound);
				session.getTransaction().commit();
				return"LoginProvider.jsp?faces-redirect=true";
			 }else {
				 Map<String,Object> sessionMap = 
							FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
				 sessionMap.put("resetErr", "Can Not Use Previous Password");
				return"RecipentResetPassWord.jsp?faces-redirect=true";
			}
			
		}else {
			Map<String,Object> sessionMap = 
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap.put("passWordErr", "Enter a valid password and try again.");
		  return"RecipentResetPassWord.jsp?faces-redirect=true";
		}
	}
}
