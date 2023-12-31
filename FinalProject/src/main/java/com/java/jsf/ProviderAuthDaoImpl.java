package com.java.jsf;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ProviderAuthDaoImpl {
	SessionFactory  sf;
	Session session;
	
	
	
	public String VerifyUser(String userName) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr=session.createCriteria(ProviderAuth.class);
		cr.add(Restrictions.eq("userName", userName));
		ProviderAuth provideAutho=(ProviderAuth) cr.uniqueResult();
		if(provideAutho!=null) {
			String email=provideAutho.getEmail();
			int otp=GenerarteOtp.generateOtp();
			
			String subject = "Welcome to Life Insurance ";
			String messageText = "Hello,\n\nThank you for signing up in our LicApp. Your otp is "+otp+"It is "
					+ "valid for 10 minuetes only dont share your  otp with others";
			MailSend.mailSend(email, subject, messageText);
			return"ResetPassWord.jsp?faces-redirect=true";
		}else {
			Map<String,Object> sessionMap = 
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		 sessionMap.put("userErr", "User NotFound");
		 return"ProviderAuthoentication.jsp?faces-redirect=true";
			
		}
	} 
	
	
	
	public  ProviderAuth getProvider(String providerId) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr=session.createCriteria(ProviderAuth.class);
		cr.add(Restrictions.eq("providerId", providerId));
		ProviderAuth provide=(ProviderAuth) cr.uniqueResult();	
		return provide;
	}
	
	public String resetPassWord(ProviderAuth provider) {	
		ProviderAuth provide=getProvider(provider.getProviderId());
		String pass1=provide.getPassword();
		String pass2=EncryptPassword.getCode(provider.getPassword());
		
		if(provider.getPassword().equals(provider.getRetypePassWord())&&(!(pass1.contentEquals(pass2)))){
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Transaction trans = session.beginTransaction();
			String encr=EncryptPassword.getCode(provider.getPassword());
			provide.setPassword(encr);
			provide.setStatus("Active");
			provide.setOtp("");
			session.update(provide);
			session.getTransaction().commit();
			return"LoginProvider.jsp?faces-redirect=true";
		 }else {
			 Map<String,Object> sessionMap = 
						FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			 sessionMap.put("resetErr", "Can Not Use Previous Password");
			return"ResetPassWord.jsp?faces-redirect=true";
		}	
	}
}
