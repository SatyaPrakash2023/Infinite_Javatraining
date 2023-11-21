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
<%
	int agentId=Integer.parseInt(request.getParameter("agentId"));
	AgentDAO dao=new AgentDaoImpl();
	Agent agent=dao.searchAgent(agentId);

%>
<form method="get" action="UpdateAgent.jsp">
	<center>
		AgentID:
			<input type="number" name="agentId" readonly="readonly" 
			value=<%=agent.getAgentId() %> /> <br/><br/>
		Agent Name:
		<input type="text" name="agentName"
		value=<%=agent.getName() %> /><br/><br/>
		Agent City:
		<input type="text" name="city"
		value=<%=agent.getCity() %> /><br/><br/>
		Gender:
		<select name="gender" value=<%=agent.getGender() %>>
			<option>MALE<option>
			<optio>FEMALE<option>
		</select>
		MaritialStatus:
		<select name="maritialStatus" value=<%=agent.getMaritalStatus() %>>
			<option>0<option>
			<optio>1<option>
		</select>
		Premium:
			<input type="number" name="premium" 
			value=<%=agent.getPremium() %> /> <br/><br/>
		<input type="submit" value="Update AGENT"/>
		
	</center>
</form>
<%
	if(request.getParameter("agentId")!=null && request.getParameter("maritialStatus")!=null){
		Agent agentUpdate=new Agent();
		agentUpdate.setAgentId(Integer.parseInt(request.getParameter("agentId")));
		agentUpdate.setName(request.getParameter("agentName"));
		agentUpdate.setCity(request.getParameter("city"));
		agentUpdate.setGender(Gender.valueOf(request.getParameter("gender")));
		agentUpdate.setMaritalStatus(Integer.parseInt(request.getParameter("maritialStatus")));
		agentUpdate.setPremium(Double.parseDouble(request.getParameter("premium")));
		
		dao.updateAgentDao(agentUpdate);
	%>
		<jsp:forward page="AgentShow.jsp"/>
	<%
		
		
	}
%>

</body>
</html>