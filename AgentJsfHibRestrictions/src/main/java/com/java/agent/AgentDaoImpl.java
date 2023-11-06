package com.java.agent;

import java.util.List;

import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class AgentDaoImpl {
	SessionFactory sf;
	Session session;
	private String gen;
	
	
	
	
	
	public String getGen() {
		return gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}




	private String localCode;
	
	
	
	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
	public void AgentLocalCodeChanged(ValueChangeEvent e) {
		this.localCode=e.getNewValue().toString();
	}
	
	
	public List getAgentByGender(String gender){
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria cr=session.createCriteria(Agent.class);
		//Gender gender1=Gender.valueOf("gender");
		cr.add(Restrictions.eq("gender", gender));
		List<String> agentList=cr.list();
		return agentList;
	}
	
	public Gender[]getGender1(){
		return Gender.values();
	}
	
	public void radioChanged(ValueChangeEvent e) {
		this.gen = e.getNewValue().toString();
	}
	
	
	
	
	public List<Agent>agentShow(){
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria cr=session.createCriteria(Agent.class);
		return cr.list();
	}
}
