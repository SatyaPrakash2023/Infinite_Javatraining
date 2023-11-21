<%@page import="com.java.agent.Agent"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	AgentDAO dao = new AgentDaoImpl();
	List<Agent> agentList= dao.showAgentDao();
%>
<table border="3" align="center">
	<center>
		<tr>
			<th>AgentID</th>
			<th>Name</th>
			<th>City</th>
			<th>MaritialStatus</th>
			<th>Premium</th>
			
		</tr>
		<%
			for(Agent agent:agentList){
		%>
			<tr>
				<td><%=agent.getAgentId() %></td>
				<td><%=agent.getName() %></td>
				<td><%=agent.getCity() %></td>
				<td><%=agent.getMaritalStatus() %></td>
				<td><%=agent.getPremium() %></td>
				<td>
					<a href=UpdateAgent.jsp?agentId=<%=agent.getAgentId() %>>Update</a>
					
				</td>
				<td>
					<a href=DeleteAgent.jsp?agentId=<%=agent.getAgentId() %>>Delete</a>
				</td>
			</tr>
		<%	
		}
		%>
	</center>
</table><hr/>
	<a href="AddAgent.jsp">Add Agent</a>

</body>
</html>