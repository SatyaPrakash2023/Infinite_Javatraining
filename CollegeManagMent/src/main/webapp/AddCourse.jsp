<%@page import="com.java.cms.CourseDaoImpl"%>
<%@page import="com.java.cms.CourseDAO"%>
<%@page import="com.java.cms.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="AddCourse.jsp">
		<center>
			CourseId:
			<input type="number" name="courseId"/></br><br>
			Course Name:
			<input type="text" name="courseName"/></br><br>
			DepartMent Name:
			<input type="text" name="deptName"/></br><br>
			Credits:
			<select name="credits">
				<option>1<option>
				<option>2<option>
				<option>3<option>
				<option>4<option>
				<option>5<option>
			</select></br><br>
			<input type="submit" value="Add Course"/></br><br>
			
		</center>
	</form>
	<%
		if(request.getParameter("courseId")!=null && request.getParameter("credits")!=null){
			Course course = new Course();
			CourseDAO dao=new CourseDaoImpl();
			course.setCourseId(Integer.parseInt(request.getParameter("courseId")));
			course.setCourseName(request.getParameter("courseName"));
			course.setDeptName(request.getParameter("deptName"));
			course.setCredits(Integer.parseInt(request.getParameter("credits")));
			dao.AddCourse(course);
			
		
		%>
			<jsp:forward page="ShowCourse.jsp"/>
		<%
		}
	%>

</body>
</html>