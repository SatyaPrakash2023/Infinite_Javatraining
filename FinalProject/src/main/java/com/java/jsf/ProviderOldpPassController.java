package com.java.jsf;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.NamingException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class ProviderOldpPassController {
	private  ProviderAutholdPassImpl provOldpassImpl;
	private ProviderOldPass provOldpass;
	
		

	public ProviderAutholdPassImpl getProvOldpassImpl() {
		return provOldpassImpl;
	}

	public void setProvOldpassImpl(ProviderAutholdPassImpl provOldpassImpl) {
		this.provOldpassImpl = provOldpassImpl;
	}

	public ProviderOldPass getProvOldpass() {
		return provOldpass;
	}

	public void setProvOldpass(ProviderOldPass provOldpass) {
		this.provOldpass = provOldpass;
	}

	public String ResetPassWord() throws NamingException {
		if (addValid()) {
				return provOldpassImpl.ResetPassWordOldpasss(provOldpass);
		}
		return "";
	}
	
	public boolean addValid() {
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			FacesContext context = FacesContext.getCurrentInstance();
			
		String passCode=provOldpass.getPassword();
		
		
		//String retypePaccode=customer.getRetypePassCode();
		Pattern patternPass = Pattern.compile(passCode);
		Matcher matcherPass = patternPass.matcher(String.valueOf(provOldpass.getRetypePassWord()));
		//String userName=customer.;
		boolean flag=true;
		
		if(provOldpass.getOldPassWord().isEmpty()) {
			context.addMessage("form:oldPassWord", new FacesMessage("Please Enter Id."));
			flag= false;
		}
		
		if(provOldpass.getPassword().isEmpty()) {
			context.addMessage("form:password", new FacesMessage("Please Enter passWord."));
			flag= false;
		}
		if(provOldpass.getRetypePassWord().isEmpty()) {
				context.addMessage("form:retypePassWord", new FacesMessage("Please Enter Reset passWord."));
				flag= false;
			}
		
		
		
		if(!( 8 <= passCode.length() && passCode.length() <= 32)  )
		   {
			context.addMessage("form:password", new FacesMessage("PassWord Minimum 8 character"));
			flag= false;
		   }
		   if(!(passCode.matches(".*\\d.*")) ) {
			   context.addMessage("form:password", new FacesMessage("PassWord Minimum contain one number"));
			   flag= false;
		   }
		   if(!(passCode.matches(".*[a-z].*"))) {
			   context.addMessage("form:password", new FacesMessage("PassWord contain Minimum a small character"));
			   flag= false;
		   }
		   if(!(passCode.matches(".*[A-Z].*"))) {
		     context.addMessage("form:password", new FacesMessage("PassWord Contains Minimum a capital character"));
		     flag= false;
		   }
		    if(!(passCode.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*"))) {
		    	context.addMessage("form:password", new FacesMessage("PassWord Minimum Contain special character"));
		    	flag= false;
		   }
		    
		   
		    if(!matcherPass.matches()) {
				context.addMessage("form:retypePassWord", new FacesMessage("Please Enter  passWord and reset passWord must same."));
				flag= false;
			} 
	    
	    return flag;
	}
	

}
