package com.java.agent;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;





public class AgentDaoImpl implements AgentDAO{
	SessionFactory sf;
	Session session;

	@Override
	public List<Agent> showAgent() {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria cr=session.createCriteria(Agent.class);
		List<Agent> agentList=cr.list();
		return agentList;
	}

	@Override
	public Agent searchAgent(int agentId) {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Criteria cr=session.createCriteria(Agent.class);
		cr.add(Restrictions.eq("agentId", agentId));
		Agent agent=(Agent) cr.uniqueResult();
		return agent;
	}

	@Override
	public String addAgent(Agent agent) {
		sf=SessionHelper.getConnection();
		session=sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(agent);
		transaction.commit();
		return"Employ Record Inserted....";
	}

	@Override
	public String deleteAgent(int agentId) {
		Agent agentFound=searchAgent(agentId);
		if(agentFound!=null) {
			sf=SessionHelper.getConnection();
			session=sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(agentFound);
			transaction.commit();
			return"Employ Record Deleted....";
		}
		return"Agent Record Not there";
	}

	@Override
	public String updateAgent(int agentId) {
		Agent agentFound=searchAgent(agentId);
		if(agentFound!=null) {
			sf=SessionHelper.getConnection();
			session=sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(agentFound);
			transaction.commit();
			return"Employ Record Updated....";
		}
		return"Agent Record Not there";
	}

}
