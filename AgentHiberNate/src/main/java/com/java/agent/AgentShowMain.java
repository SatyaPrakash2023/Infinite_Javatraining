package com.java.agent;

import java.util.List;

public class AgentShowMain {
	public static void main(String[] args) {
		AgentDAO dao = new AgentDaoImpl();
		List<Agent>agentList=dao.showAgent();
		for (Agent agent : agentList) {
			System.out.println(agent);
		}
	}
	

}
