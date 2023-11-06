package com.java.agent;

import java.util.List;

public interface AgentDAO {
	List<Agent> showAgent();
	Agent searchAgent(int agentId);
	String addAgent(Agent agent);
	String deleteAgent(int agentId);
	String updateAgent(int agentId);

}
