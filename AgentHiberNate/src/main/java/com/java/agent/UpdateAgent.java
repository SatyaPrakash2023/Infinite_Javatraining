package com.java.agent;

import java.util.Scanner;

public class UpdateAgent {
	public static void main(String[] args) {
		int agentId;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Agent Id");
		agentId=sc.nextInt();
		AgentDAO dao=new AgentDaoImpl();
		System.out.println(dao.updateAgent(agentId));
	}

	}


