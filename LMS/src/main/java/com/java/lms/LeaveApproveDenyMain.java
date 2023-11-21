package com.java.lms;

import java.sql.SQLException;
import java.util.Scanner;

public class LeaveApproveDenyMain {
	public static void main(String[] args) {
		int leaveId, managerId;
		String managerComments,status;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leave Id  ");
		leaveId = sc.nextInt();
		System.out.println("Enter Manager Id  ");
		managerId = sc.nextInt();
		System.out.println("Enter Status..");
		status = sc.next();		
		System.out.println("Enter manager comment ");		
		managerComments = sc.next();
		
        
		try {
			System.out.println(new LeaveDAOImpl().approveOrDeny(leaveId, managerId, status, managerComments));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	}


