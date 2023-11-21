<%@page import="com.java.employdashboard.Gender"%>
<%@page import="com.java.employdashboard.Employ"%>
<%@page import="com.java.employdashboard.EmployDAOImpl"%>
<%@page import="com.java.employdashboard.EmployDAO"%>
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
	int empno=Integer.parseInt(request.getParameter("empno"));
	EmployDAO dao = new EmployDAOImpl();
	Employ employ = dao.searchEmployDao(empno);
%>
<form method="get" action="UpdateEmploy.jsp">
	<center>
	Employ No : 
		<input type="number" name="empno" readonly="readonly" 
			value=<%=employ.getEmpno() %> /> <br/><br/>
	Employ Name : 
		<input type="text" name="name" 
			value=<%=employ.getName() %> /> <br/><br/>
	Gender : 
	<input type="text" name="gender" 
		value=<%=employ.getGender() %> /> <br/><br/>
	Department : 
	<input type="text" name="dept" 
			value=<%=employ.getDept() %> /> <br/><br/> 
	Designation : 
	<input type="text" name="desig" 
			value=<%=employ.getDesig() %> /> <br/><br/>
	Basic : 
	<input type="number" name="basic" 
			value=<%=employ.getBasic() %> /> <br/><br/>
	<input type="submit" value="Update Employ" />
	</center>
</form>
<%
	if(request.getParameter("empno")!=null && request.getParameter("basic")!=null){
		Employ employUpdate = new Employ();
 		employUpdate.setEmpno(Integer.parseInt(request.getParameter("empno")));
 		employUpdate.setName(request.getParameter("name"));
 		employUpdate.setGender(Gender.valueOf(request.getParameter("gender")));
 		employUpdate.setDept(request.getParameter("dept"));
 		employUpdate.setDesig(request.getParameter("desig"));
 		employUpdate.setBasic(Double.parseDouble(request.getParameter("basic")));
 		dao.updateEmployDao(employUpdate);
 		
 	%>
 		<jsp:forward page="EmployShow.jsp"/>
 	<%	
	}
%>


</body>
</html>