package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {
	@Test
	public void testToString() {
		Employ emp = new Employ(1,"Satya",Gender.MALE,"JAVA","Manager",99424);
		String result ="Employ [empno=1, name=Satya, gender=MALE, dept=JAVA, desig=Manager, basic=99424.0]";
		assertEquals(result, emp.toString());  
	}
	
	@Test
	public void testGetterAndSetter() {
		Employ employ = new Employ();
		Employ emp = new Employ(1,"Satya",Gender.MALE,"JAVA","Manager",99424);
		employ.setEmpno(1);
		employ.setName("Satya");
		employ.setGender(Gender.MALE); 
		employ.setDept("jAVA");
		employ.setDesig("Manager");
		employ.setBasic(99424);
		
		assertEquals(1, emp.getEmpno());
		assertEquals("Satya", emp.getName());
		assertEquals(Gender.MALE, emp.getGender());
		assertEquals("JAVA", emp.getDept());
		assertEquals("Manager", emp.getDesig());
		assertEquals(99424, emp.getBasic(),0);
	}

	@Test
	public void testCostructor() {
		Employ employ = new Employ();
		assertNotNull(employ); 
		
		
		
	}
	
	

}
