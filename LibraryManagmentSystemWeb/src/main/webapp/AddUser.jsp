<%@page import="com.java.library.LibUsers"%>
<%@page import="com.java.library.LibraryDaoImpl"%>
<%@page import="com.java.library.LibraryDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddUser.jsp">
	User Name:
	<input type="text" name="userName"/><br/><br/>
	PassWord:
	<input type="password" name="passWord"/><br/><br/>
	Re-Type PassWord:
	<input type="password" name="retypePassWord"/><br/><br/>
	<input type="submit" value="Create Account"/>
</form>
<c:if test="${param.userName!=null && param.passWord!=null }">
	<c:if test="${param.passWord == param.retypePassWord }">
		<jsp:useBean id="libUsers" class="com.java.library.LibUsers"/>
		<jsp:setProperty property="*" name="libUsers"/>
		<jsp:useBean id="beanDao" class="com.java.library.LibraryDaoImpl"/>
		<%=beanDao.createUser(libUsers) %>
		
		<c:redirect url = "http://localhost:8080/LibraryManagmentSystemWeb/Login.jsp"/>
	</c:if>
</c:if>


</body>
</html>