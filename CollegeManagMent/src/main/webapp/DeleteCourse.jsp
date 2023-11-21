<%@page import="com.java.cms.CourseDaoImpl"%>
<%@page import="com.java.cms.CourseDAO"%>
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
		int courseId=Integer.parseInt(request.getParameter("courseId"));
		CourseDAO dao = new CourseDaoImpl();
		dao.deleteCourse(courseId);
	%>
	<jsp:forward page="ShowCourse.jsp"/>

</body>
</html>