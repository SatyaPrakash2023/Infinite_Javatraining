<%@page import="java.util.List"%>
<%@page import="com.java.library.Tranbook"%>
<%@page import="com.java.library.LibraryDaoImpl"%>
<%@page import="com.java.library.LibraryDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"/>

<%
	String user = (String)session.getAttribute("user");
	LibraryDAO dao = new LibraryDaoImpl();
	List<Tranbook> bookList=dao.showreturn(user);
%>
<form action="Return_Book.jsp">
	<table border="3" align="center">
		<tr>
			<th>UserName</th>
			<th>BookId</th>
			<th>Form Date</th>
			<th>Select</th>
		</tr>
	
			<%
				for(Tranbook book:bookList){
			%>
			<tr>
				<td><%=book.getUsername() %></td>
				<td><%=book.getBookId() %></td>
				<td><%=book.getFromdate() %></td>
				<td><input type="checkbox" id="checkm" name="box1" value=<%=book.getBookId()%>  /></td>
			</tr>
		<%
				}
		%>
	</table>
	<input type="submit" value="Return(s)" />


</body>
</html>