package com.java.agent;

import java.util.Scanner;

public class AgentSearchMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int agentId;
		System.out.println("Enter Employ Number..");
		agentId=sc.nextInt();
		AgentDAO dao = new AgentDaoImpl();
		System.out.println(dao.searchAgent(agentId));
	}

}
