package com.java.inf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreDetails {
	public static void main(String[] args) {
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans= session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEmployeeId(100);
		e1.setName("Satya");
		e1.setEmail("satyaprakash@gmail.com");
		session.save(e1);
		
		
		Address ad = new Address();
		ad.setAddressLine1("37-115/3,sree Colony");
		ad.setCity("Bhubaneswar");
		ad.setState("Odisha");
		ad.setCountry("India");
		ad.setPincode(560066);
		e1.setAddress(ad);
		ad.setEmployee(e1);
		session.save(ad);
		trans.commit();
		session.close();
		System.out.println("Success");
	}
}
