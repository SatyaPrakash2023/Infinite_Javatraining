<%@page import="com.java.cms.Course"%>
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
		Course course=dao.searchCourse(courseId);
	%>
	<form method="get" action="UpdateCourse.jsp">
		<center>
			CourseId:
			<input type="number" name="courseId" readonly="readonly" value=<%=course.getCourseId() %>/></br><br>
			Course Name:
			<input type="text" name="courseName" value=<%=course.getCourseName() %>/></br><br>
			DepartMent Name:
			<input type="text" name="deptName" value=<%=course.getDeptName() %>/></br><br>
			Credits:
			<select name="credits" value=<%=course.getCredits() %>>
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
			Course updateCourse = new Course();
			updateCourse.setCourseId(Integer.parseInt(request.getParameter("courseId")));
			updateCourse.setCourseName(request.getParameter("courseName"));
			updateCourse.setDeptName(request.getParameter("deptName"));
			updateCourse.setCredits(Integer.parseInt(request.getParameter("credits")));
			dao.UpdateCourse(updateCourse);
			
		
		%>
			<jsp:forward page="ShowCourse.jsp"></jsp:forward>
		<%
		}
	%>

</body>
</html>