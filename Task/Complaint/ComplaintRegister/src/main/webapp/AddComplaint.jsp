<%@page import="com.java.comp.ComplaintDAOImpl"%>
<%@page import="com.java.comp.ComplaintDAO"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.java.comp.Complaint"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddComplaint.jsp">
	<center>
	<h1>Add Complaint</h1>
	Complaint Id:
		<input type="text" name="complaintId"/><br><br/>
	Complaint Type:
		<input type="text" name="complaintType"/><br><br/>
	CDescription:
		<input type="text" name="description"/><br><br/>
	CompLaint Date:
		<input type="date"name="datec"/>	
	
	Serverity:
		<input type="text" name="serverity"/><br><br/>	
		<input type="submit" value="Add Complaint"	/>		
	</center>

<%
	if(request.getParameter("complaintId")!=null||request.getParameter("complaintId")!=null){
		Complaint comp=new Complaint();
		comp.setComplaintId(request.getParameter("complaintId"));
		comp.setComplaintType(request.getParameter("complaintType"));
		comp.setCDescription(request.getParameter("description"));
		comp.setSeverity(request.getParameter("serverity"));
		ComplaintDAO dao=new ComplaintDAOImpl();
		dao.addComplain(comp);
	}	
	
	
	
%>
</form>

</body>
</html>