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

		String user1 = (String)session.getAttribute("user");
	    LibraryDAO dao1 = new LibraryDaoImpl();
	    
	    String[] butarr1 = request.getParameterValues("box1");
	    out.println("butarr1"+butarr1);
	    if (butarr1 != null) {
	       for(String id:butarr1){
	    	   int Id=Integer.parseInt(id);
	    	   out.println(dao1.returnBook(Id));
	       }
	    }
	    

    %>


</body>
</html>