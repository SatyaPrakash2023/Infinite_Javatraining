package com.java.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


import java.util.Hashtable;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataTest {
	
	static Data obj;
	
	@BeforeClass
	public static void setup() {
		obj = new Data();
		System.out.println("Object Created..");
	}
	@Test
	public void testEvenOdd(){
		Data obj = new Data();
		assertTrue(obj.evenOdd(6));
		assertFalse(obj.evenOdd(5));
		
	}
	@BeforeClass
	public void showMessage() {
		System.out.println("Test Case Execution Started...");
	}
	@After
	public void endNote() {
		System.out.println("Test Cases Execution Ended..");
	}
	@AfterClass
	public static void cleanUp() {
		obj=null;
		System.out.println("Resources Deallocated...");
	}
	@Test
	public void testMapEx() {
		Data data = new Data();
		assertNotNull(data.mapEx("Ganesh"));
//		assertNull(data.mapEx("Sonali"));
	}
	
	@Test
	public void testNull() {
		Data data = null;
		assertNull(data);
	}
	
	
	
	
	@Test
	public void testArray() {
		 int []a=new int[] {1,2,3,4,5};
		 int []b = new int[] {1,2,3,4,5};
		 assertArrayEquals(a, b);
	 }
	
	@Test
	public void test() {
		assertEquals("Hi", "Hi","Hi");
	}
	
 @Test
 public void testmax3() {
	 
	Data obj = new Data();
	assertEquals(5, obj.max3(5,2,3));
	assertEquals(9, obj.max3(9, 7, 5));
	assertEquals(9, obj.max3(3, 5, 9)); 
 }
	@Test
	public void testSayHello() {
		Data obj = new Data();
		assertEquals("Welcome to junit Programing...", obj.sayHello());
		
	}
	
@Test	
public void testSum() {
	Data obj = new Data();
	assertEquals(5, obj.sum(2, 3));
}	

}
