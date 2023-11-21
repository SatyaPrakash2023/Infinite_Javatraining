package com.java.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import org.junit.Test;

public class LeaveDetailsTest {
	
	@Test
	public void testTostring() throws ParseException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start = sdf.parse("2023-09-14");
		Date end=sdf.parse("2023-09-15");
		Date ap = sdf.parse("2023-09-14"); 
		
		LeaveDetails leave_test = new LeaveDetails(1,10335,"Satya",start,end,LeaveStatus.ACCEPTED,LeaveType.EL,"Sick","OK",ap);
		
		
		 String result ="LeaveDetails [leaveId=1, empId=10335, empName=Satya, leaveStartDate=Thu Sep 14 00:00:00 PDT 2023, leaveEndDate=Fri Sep 15 00:00:00 PDT 2023, leaveStatus=ACCEPTED, leaveType=EL, leaveReason=Sick, managerComments=OK, appliedOn=Thu Sep 14 00:00:00 PDT 2023]";
		 assertEquals(result, leave_test.toString()); 
	}
	
	
	@Test
	public void testgetterSetter() throws ParseException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date start = sdf.parse("2023-09-14");
		Date end=sdf.parse("2023-09-15");
		Date ap = sdf.parse("2023-09-14");
		LeaveDetails leave = new LeaveDetails(); 
		LeaveDetails leave_test = new LeaveDetails(1,10335,"Satya",start,end,LeaveStatus.ACCEPTED,LeaveType.EL,"Sick","OK",ap);
		leave_test.setLeaveId(1);
		leave_test.setEmpId(10335);
		leave_test.setEmpName("Satya");
		leave_test.setLeaveStartDate(start);
		leave_test.setLeaveEndDate(end);
		leave_test.setLeaveStatus(LeaveStatus.ACCEPTED);
		leave_test.setLeaveType(LeaveType.EL);
		leave_test.setLeaveReason("Sick");
		leave_test.setManagerComments("OK");
		leave_test.setAppliedOn(ap);
		
		assertEquals(1, leave_test.getLeaveId());
		assertEquals(10335, leave_test.getEmpId()); 
		assertEquals("Satya", leave_test.getEmpName());
		assertEquals(start, leave_test.getLeaveStartDate());
		assertEquals(end, leave_test.getLeaveEndDate());
		assertEquals(LeaveStatus.ACCEPTED, leave_test.getLeaveStatus());
		assertEquals(LeaveType.EL, leave_test.getLeaveType());
		assertEquals("Sick", leave_test.getLeaveReason());
		assertEquals("OK", leave_test.getManagerComments());
		assertEquals(ap,leave_test.getAppliedOn());
	}

	@Test
	public void testConstructor() {
		LeaveDetails leave= new LeaveDetails();
		assertNotNull(leave);
	}

}
