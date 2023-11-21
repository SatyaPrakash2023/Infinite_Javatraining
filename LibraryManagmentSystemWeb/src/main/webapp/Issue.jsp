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
	<jsp:include page="menu.jsp" />
	//<%
	//LibraryDAO dao=new LibraryDaoImpl();
	//out.println("Satya");
	
	//out.println(bookId[0]);
	//String user=(String)session.getAttribute("Username");
	//String []book=request.getParameterValues("id");
	//out.println(user);
	//for(String Id:book){
		//int id=Integer.parseInt(Id);
		//out.println(dao.issueBook(user, id));
	//}
	
	
	//%>
	<%

	    String user = (String)session.getAttribute("user");
	    LibraryDAO dao = new LibraryDaoImpl();
	    out.print(user);
	    String[] butarr = request.getParameterValues("box");
	    out.println("butarr"+butarr);
	    if (butarr != null) {
	       for(String id:butarr){
	    	   int Id=Integer.parseInt(id);
	    	   out.println(dao.issueBook(user, Id));
	       }
	    }
	    else{
	    	out.println("Not found");
	    }

    %>

	

</body>
</html>