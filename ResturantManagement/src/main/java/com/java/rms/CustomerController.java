package com.java.rms;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.hibernate.loader.custom.Return;

public class CustomerController {

	
	private Customer customer;

	private CustomerDaoImpl daoImpl;
	
	public CustomerDaoImpl getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(CustomerDaoImpl daoImpl) {
		this.daoImpl = daoImpl;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String addCustomer() {
		if (doValid()==true) {
				return daoImpl.addCustomerDao(customer);
		}
		return "";
	}
	
	public String showCustomerWallet() {
		System.out.println("Hi");
		return daoImpl.showCustomerWalletDao();
	}
	public String searchCustomer() { 
		return daoImpl.searchCustomerDetailsDao();
	}
	public boolean doValid() {
	
		System.out.println(customer);
		FacesContext context = FacesContext.getCurrentInstance();
		if (customer.getCusname().length() <= 5) {
			context.addMessage("CustomerName", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Customer Name Contains min 5 characters", null));
			return false;
		}
		
			return true;
		
	}
}
