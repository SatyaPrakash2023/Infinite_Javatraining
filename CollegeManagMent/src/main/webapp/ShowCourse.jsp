<%@page import="com.java.cms.Course"%>
<%@page import="java.util.List"%>
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
	CourseDAO dao=new CourseDaoImpl();
	List<Course> courseList=dao.showCourse();
	
%>
<table border="3" align="center">
	<center>
		<tr>
			<th>CourseID</th>
			<th>Course Name</th>
			<th>Department</th>
			<th>Credits</th>
		</tr>
		<%
			for(Course course:courseList){
		%>
			<tr>
				<td><%=course.getCourseId() %></td>
				<td><%=course.getCourseName() %></td>
				<td><%=course.getDeptName() %></td>
				<td><%=course.getCredits() %></td>
				<td>
					<a href=UpdateCourse.jsp?courseId=<%=course.getCourseId() %>>Update</a>
					
				</td>
				<td>
					<a href=DeleteCourse.jsp?courseId=<%=course.getCourseId() %>>Delete</a>
				</td>
			</tr>
			<%
			}
			%>
	</center>
</table><hr>
	<a href="AddCourse.jsp">Add Course</a>

</body>
</html>