package com.java.agent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AgentDaoImpl implements AgentDAO{
	Connection connection;
	PreparedStatement pst;
	
	


	@Override
	public String createAgent(Agent agent) throws ClassNotFoundException, SQLException {
		connection=AgentConnectionHelper.getConnection();
		String cmd ="Insert into agent(Name,City,Gender,MaritalStatus,Premium,agentId)" + " values(?,?,?,?,?,?)";
		PreparedStatement pst=connection.prepareStatement(cmd);
		pst.setString(1,agent.getName());
		pst.setString(2,agent.getCity());
		pst.setString(3, agent.getGender().toString());
		pst.setInt(4, agent.getMaritalStatus());
		pst.setDouble(5,agent.getPremium());
		pst.setInt(6, agent.getAgentId());
		pst.executeUpdate();
		return "Agent Created...";
	}

	@Override
	public Agent searchAgent(int agentId) throws ClassNotFoundException, SQLException {
		
		connection = AgentConnectionHelper.getConnection();
		String cmd = "Select * from agent where AgentId=?";
		PreparedStatement pst = connection.prepareStatement(cmd);
		pst.setInt(1, agentId);
		ResultSet rs = pst.executeQuery();
		Agent agent = null;
		if(rs.next()) {
			 agent= new Agent();
			 agent.setAgentId(rs.getInt("agentId"));
			 agent.setName(rs.getString("name"));
			 agent.setCity(rs.getString("city"));
			 agent.setGender(Gender.valueOf(rs.getString("gender")));
			 agent.setMaritalStatus(rs.getInt("maritalStatus"));
			 agent.setPremium(rs.getDouble("premium"));
			 
		}
		return agent;
		
	}

	@Override
	public List<Agent> showAgentDao() throws ClassNotFoundException, SQLException {
		connection=AgentConnectionHelper.getConnection();
		String cmd = "select * from agent";
		pst =connection.prepareStatement(cmd);
		List<Agent> agentList = new ArrayList<Agent>();
		Agent agent = null;
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			
			agent = new Agent();
			agent.setAgentId(rs.getInt("agentId"));
			agent.setName(rs.getString("name"));
			agent.setCity(rs.getString("city"));
			agent.setGender(Gender.valueOf(rs.getString("gender")));
			agent.setMaritalStatus(rs.getInt("maritalStatus"));
			agent.setPremium(rs.getDouble("premium"));
			agentList.add(agent);
			
		}
		return agentList;
	}

	@Override
	public String updateAgentDao(Agent agent) throws ClassNotFoundException, SQLException {
		Agent agent_Found = searchAgent(agent.getAgentId());
		if(agent_Found!=null) {
			connection=AgentConnectionHelper.getConnection();
			String cmd ="Update  agent set name=?,city=?,gender=?,maritalStatus=?,premium=? where agentId=?";
			pst=connection.prepareStatement(cmd);
			
			pst.setString(1,agent.getName());
			pst.setString(2,agent.getCity());
			pst.setString(3, agent.getGender().toString());
			pst.setInt(4, agent.getMaritalStatus());
			pst.setDouble(5,agent.getPremium());
			pst.setInt(6, agent.getAgentId());
			pst.executeUpdate();
			return "Agent Updated...";
			
		}
		return "Wrong Data...";
	}

	@Override
	public String deleteAgentDao(int agentId) throws ClassNotFoundException, SQLException {
		Agent agent_found = searchAgent(agentId);
		if(agent_found!=null) {
		     connection= AgentConnectionHelper.getConnection();
		     String cmd = "Delete from agent where agentId=?";
		     pst=connection.prepareStatement(cmd);
		     pst.setInt(1, agentId);
		     pst.executeUpdate();
		     return "Record Deleted..";
		}
		return "Record Not Found...";
		
	}

	

}
