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
		dao.deleteAgentDao(agentId);
	%>
	<jsp:forward page="AgentShow.jsp"/>

</body>
</html>