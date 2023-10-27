<%@page contentType="text/html"%>

<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>

<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>

<body>
	<h:form>
		<center>
			<h2>
				<h:outputText value="Allocate Room" />
			</h2>
		</center>
		<h:selectOneMenu value="#{ejbImpl.localCode}" onchange="submit()"
		valueChangeListener="#{ejbImpl.employLocalCodeChanged}">
		<f:selectItems value="#{ejbImpl.getRoomTypeEjb()}" />
	</h:selectOneMenu>
	<h:outputLabel value="Selected RoomType is " />
	<h:outputText value="#{rmList.roomType}" />
		
	</h:form>
</body>
	</html>
</f:view>
