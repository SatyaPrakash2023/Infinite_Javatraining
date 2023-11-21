package com.java.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

public class VendorTest {
	
	
	@Test
	public void testToString() throws ParseException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start = sdf.parse("2023-09-14");
		Vendor ven_test = new Vendor(1,"Satya","Bbsr","satya@gmail.com","6372721710","yes",start,5,"Good");
		
		String result="Vendor [vendorId=1, vendorName=Satya, vendorCity=Bbsr, vendorEmail=satya@gmail.com, vendorMobile=6372721710, vendorStatus=yes, vendorStartedDate=Thu Sep 14 00:00:00 PDT 2023, vendorRating=5.0, vendorReview=Good]";
		assertEquals(result, ven_test.toString());
	}

	
	@Test
	public void testGetterSetter() throws ParseException { 
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start = sdf.parse("2023-09-14");
		Vendor vendor=new Vendor();
		Vendor ven = new Vendor(1,"Satya","Bbsr","satya@gmail.com","6372721710","yes",start,5,"Good");
		ven.setVendorId(1);
		ven.setVendorName("Satya");
		ven.setVendorCity("Bbsr");
		ven.setVendorEmail("satya@gmail.com");
		ven.setVendorMobile("6372721710");
		ven.setVendorStatus("yes");
		ven.setVendorStartedDate(start);
		ven.setVendorRating(5);
		ven.setVendorReview("Good");
		
		assertEquals(1, ven.getVendorId());
		assertEquals("Satya", ven.getVendorName());
		assertEquals("Bbsr", ven.getVendorCity());
		assertEquals("satya@gmail.com", ven.getVendorEmail());
		assertEquals("yes", ven.getVendorStatus());
		assertEquals(start, ven.getVendorStartedDate());
		assertEquals(5, ven.getVendorRating(),0);
		assertEquals("Good", ven.getVendorReview()); 
		
	}
	@Test
	public void testConstructor() throws ParseException {
		Vendor ven = new Vendor(1,"Satya","Bbsr","satya@gmail.com","6372721710","yes",new Date(),5,"Good");
		
		 
		assertEquals(1, ven.getVendorId());
		assertEquals("Satya", ven.getVendorName()); 
		assertEquals("Bbsr", ven.getVendorCity());
		assertEquals("satya@gmail.com", ven.getVendorEmail());
		assertEquals("yes", ven.getVendorStatus());
		assertEquals(new Date(), ven.getVendorStartedDate());
		assertEquals(5, ven.getVendorRating(),0);
		assertEquals("Good", ven.getVendorReview());
		Vendor ven1=new Vendor();
		assertNotNull(ven1);  
		
	}
	@Test
	public void testHashCode() {
		Vendor ven = new Vendor(1,"Satya","Bbsr","satya@gmail.com","6372721710","yes",new Date(),5,"Good");
		Vendor vendor = new Vendor(1,"Satya","Bbsr","satya@gmail.com","6372721710","yes",new Date(),5,"Good");
		Assert.assertTrue(ven.equals(vendor) && vendor.equals(ven));
		Assert.assertTrue(ven.hashCode()==vendor.hashCode());
		
	}

}
