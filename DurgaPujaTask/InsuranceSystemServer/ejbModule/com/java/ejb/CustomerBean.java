package com.java.ejb;

import java.util.List; 

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class CustomerBean
 */
@Stateless
@Remote(CustomerBeanRemote.class)
public class CustomerBean implements CustomerBeanRemote {
	
	@PersistenceContext(unitName= "EmpMgmtPU")
	private EntityManager entityManager;

    /**
     * Default constructor. 
     */
    public CustomerBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Customer> showCustomer() {
		System.out.println("Entit Manager is" +entityManager);
		Query query = entityManager.createQuery("SELECT e FROM Customer e");
		return (List<Customer>)query.getResultList();
	}

}
