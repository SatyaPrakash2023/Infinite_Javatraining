package com.java.jsf;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.naming.NamingException;

public class PharmacyController {
	
	private PharmacyDaoImpl pharmaAuthImpl;
	private PharmacyAuth pharmaAuth;
	public PharmacyDaoImpl getPharmaAuthImpl() {
		return pharmaAuthImpl;
	}
	public void setPharmaAuthImpl(PharmacyDaoImpl pharmaAuthImpl) {
		this.pharmaAuthImpl = pharmaAuthImpl;
	}
	public PharmacyAuth getPharmaAuth() {
		return pharmaAuth;
	}
	public void setPharmaAuth(PharmacyAuth pharmaAuth) {
		this.pharmaAuth = pharmaAuth;
	}
	
	public String ResetPassWord() throws NamingException {
		if (addValid()) {
				return pharmaAuthImpl.resetPassWord(pharmaAuth);
		}
		return "";
	}
	
	public boolean addValid() {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			FacesContext context = FacesContext.getCurrentInstance();
			
		String passCode=pharmaAuth.getPassWord();
		//String retypePaccode=customer.getRetypePassCode();
		Pattern patternPass = Pattern.compile(passCode);
		Matcher matcherPass = patternPass.matcher(String.valueOf(pharmaAuth.getResetPasword()));
		//String userName=customer.;
		int count=0;
		
		if(pharmaAuth.getPharmaId().isEmpty()) {
			context.addMessage("form:id", new FacesMessage("Please Enter Id."));
	        return false;
		}
		if(pharmaAuth.getPassWord().isEmpty()) {
			context.addMessage("form:password", new FacesMessage("Please Enter passWord."));
	        return false;
		}
		
		
		if(!( 8 <= passCode.length() && passCode.length() <= 32)  )
		   {
			context.addMessage("form:password", new FacesMessage("PassWord Minimum 8 character"));
	        return false;
		   }
		   if(!(passCode.matches(".*\\d.*")) ) {
			   context.addMessage("form:password", new FacesMessage("PassWord Minimum contain one number"));
		        return false;
		   }
		   if(!(passCode.matches(".*[a-z].*"))) {
			   context.addMessage("form:password", new FacesMessage("PassWord contain Minimum a small character"));
		   		return false;
		   }
		   if(!(passCode.matches(".*[A-Z].*"))) {
		     context.addMessage("form:password", new FacesMessage("PassWord Contains Minimum a capital character"));
		        return false;
		   }
		    if(!(passCode.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*"))) {
		    	context.addMessage("form:password", new FacesMessage("PassWord Minimum Contain special character"));
	        		return false;
		   }
		    
		    if(pharmaAuth.getResetPasword().isEmpty()) {
				context.addMessage("form:retypePassWord", new FacesMessage("Please Enter Reset passWord."));
		        return false;
			}
		    if(!matcherPass.matches()) {
				context.addMessage("form:retypePassWord", new FacesMessage("Please Enter  passWord and reset passWord must same."));
		        return false;
			} 
	    
	    return true;
	}
	
	
	
}
