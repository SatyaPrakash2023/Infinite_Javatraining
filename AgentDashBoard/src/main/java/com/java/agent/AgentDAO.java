package com.java.agent;

import java.sql.SQLException;
import java.util.List;



public interface AgentDAO {
	String createAgent(Agent agent) throws ClassNotFoundException, SQLException;
	Agent searchAgent(int agentId) throws ClassNotFoundException, SQLException;
	List<Agent>showAgentDao() throws ClassNotFoundException, SQLException;
	String updateAgentDao(Agent agent) throws ClassNotFoundException, SQLException;
	String deleteAgentDao(int agentId) throws ClassNotFoundException, SQLException;

}
