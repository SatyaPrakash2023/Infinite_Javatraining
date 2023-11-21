<%@page import="com.java.agent.Gender"%>
<%@page import="com.java.agent.Agent"%>
<%@page import="com.java.agent.AgentDaoImpl"%>
<%@page import="com.java.agent.AgentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddAgent.jsp">
	<center>
		AgentID:
		<input type="number" name="agentId" /><br/><br/>
		Agent Name:
		<input type="text" name="agentName"/><br/><br/>
		Agent City:
		<input type="text" name="city"/><br/><br/>
		Gender:
		<select name="gender">
			<option>MALE<option>
			<optio>FEMALE<option>
		</select>
		MaritialStatus:
		<select name="maritialStatus">
			<option>0<option>
			<optio>1<option>
		</select>
		Premium:
		<input type="number" name="premium"/>
		<input type="submit" value="Add AGENT"/>
		
	</center>
</form>
<%
	if(request.getParameter("agentId")!=null && request.getParameter("maritialStatus")!=null){
		AgentDAO dao=new AgentDaoImpl();
		Agent agent=new Agent();
		agent.setAgentId(Integer.parseInt(request.getParameter("agentId")));
		agent.setName(request.getParameter("agentName"));
		agent.setCity(request.getParameter("city"));
		agent.setGender(Gender.valueOf(request.getParameter("gender")));
		agent.setMaritalStatus(Integer.parseInt(request.getParameter("maritialStatus")));
		agent.setPremium(Double.parseDouble(request.getParameter("premium")));
		
		dao.createAgent(agent);
	%>
		<jsp:forward page="AgentShow.jsp"/>
	<%
		
		
	}
%>

</body>
</html>