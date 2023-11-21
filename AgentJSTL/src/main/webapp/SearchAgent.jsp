<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="SearchAgent.jsp">
	Agent Id:
	<input type="number" name="agentId"/><br/><br/>
	<input type="submit" value="Show"/>
</form>
<sql:setDataSource var="connection"
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/exam"
	user="root"
	password="Satya"
/>
<sql:query var="agentQuery" dataSource="${connection}">
	select * from Agent where agentId=<%=request.getParameter("agentId") %>
</sql:query>
<c:forEach var="agent" items="${agentQuery}">
	Agent Id :
	<c:out value="${agent.agentId}"/> <br/>
	Agent Name : 
	<c:out value="${agent.agentName}"/> <br/>
	City : 
	<c:out value="${agent.city}"/> <br/>
	Gender : 
	<c:out value="${agent.gender}"/> <br/>
	MaritialStatus : 
	<c:out value="${agent.maritalStatus}"/> <br/>
	Premium : 
	<c:out value="${agent.premium}"/> <br/>
	<hr/>
</c:forEach>
</body>
</html>