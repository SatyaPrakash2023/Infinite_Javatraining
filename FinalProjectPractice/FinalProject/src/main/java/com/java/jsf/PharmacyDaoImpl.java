package com.java.jsf;

import java.util.Map;

import javax.faces.context.FacesContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class PharmacyDaoImpl {
	SessionFactory  sf;
	Session session;
	
	
	
	public  PharmacyAuth getPharmadetails(String pharmaId) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr=session.createCriteria(PharmacyAuth.class);
		cr.add(Restrictions.eq("pharmaId", pharmaId));
		PharmacyAuth pharma=(PharmacyAuth) cr.uniqueResult();	
		return pharma;
	}
	
	public String resetPassWord(PharmacyAuth pharmacyAuth) {	
		PharmacyAuth pharmaobj=getPharmadetails(pharmacyAuth.getPharmaId());
		String pass1=pharmacyAuth.getPassWord();
		String pass2=EncryptPassword.getCode(pharmacyAuth.getPassWord());
		if(pharmacyAuth.getPassWord().equals(pharmacyAuth.getResetPasword())&&(!(pass1.contentEquals(pass2)))){
			sf = SessionHelper.getConnection();
			session = sf.openSession();
			Transaction trans = session.beginTransaction();
			String encr=EncryptPassword.getCode(pharmacyAuth.getPassWord());
			pharmaobj.setPassWord(encr);
			pharmaobj.setStatus("Active");
			pharmaobj.setOtp("");
			session.update(pharmaobj);
			session.getTransaction().commit();
			return"LoginPharmacy.jsp?faces-redirect=true";
		 }else {
			 Map<String,Object> sessionMap = 
						FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			 sessionMap.put("resetErr", "Can Not Use Previous Password");
			return"ResetPassWord.jsp?faces-redirect=true";
		}	
	}

}
