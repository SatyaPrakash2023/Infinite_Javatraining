<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image Display</title>
</head>
<body>
<div align="center">
	<h1 style="color:red;align:center;">Display Images</h1>
	<form action="DisplayImage" method="post">
	Enter Image Id:
	<input type="number" name="imageId">
	<input type="submit" value="Display Image">
 </form>
</div>
<hr>

<%
	String imageFileName=(String)request.getAttribute("imgFileName");
	String imgId=(String)request.getAttribute("Id");
	
%>

<div align="center">
	<table border="5px" style="width: 600px;">
		<tr>
			<th>Image Id</th>
			<th>Image</th>
		</tr>
		<%
			if(imageFileName!=null && imgId!=null)
			{
		%>
		
		<tr>
			<td><%=imgId %></td>
			<td><img style="height: 100px;width: 300px;" src="Images/<%=imageFileName %>"></td>
		</tr>
		<%
			}
		%>
	</table>
	<button style="margin-top: 20px;"><a href="AddImage.jsp" style="text-decoration: none;">Add Image</a></button>
</div>
</body>
</html>