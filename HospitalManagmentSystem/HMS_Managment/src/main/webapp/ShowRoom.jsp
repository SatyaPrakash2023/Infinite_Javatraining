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
				<h:outputText value="Room Records" />
			</h2>
		</center>
		<h:dataTable value="#{roomDao.showRoomDao()}" var="e" border="3">
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Room No" />
        </f:facet>
        <h:outputText value="#{e.roomNo}" />
    </h:column>
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Room Type" />
        </f:facet>
        <h:outputText value="#{e.roomType}" />
    </h:column>
    <h:column>
        <f:facet name="header">
            <h:outputLabel value="Room Status" />
        </f:facet>
        <h:outputText value="#{e.status}" />
    </h:column>
    
</h:dataTable>

	</h:form>
</body>
	</html>
</f:view>