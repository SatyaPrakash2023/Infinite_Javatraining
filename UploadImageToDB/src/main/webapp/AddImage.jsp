<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Images</title>
</head>
<body>
<div align="center">
	<h1 style="color:red;">Add Image Detail</h1>
	<form action="AddImage" method="post" enctype="multipart/form-data">
		Select Image:<input type="file" name="image">
		<input type="submit" value="Add Images">
	</form>
</div>	
</body>
</html>