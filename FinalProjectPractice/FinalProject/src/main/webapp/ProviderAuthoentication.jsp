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
       
		<h2>
	<h:outputText value="Reset Your PassWord" />
	</h2>
	<h:form id="form">
	<h:outputText value="Provider UserName " />
	<h:inputText id="userName" value="#{proAuth.userName}" /><br/> 
	<h:message for="form:userName"></h:message>
	<br/><br/>		
	
	<h:commandButton action="#{proAuthImpl.VerifyUser(proAuth.userName)}" value="Verify" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<h:commandButton type="reset" value="Reset"></h:commandButton><br/><br/>
	
	<h:outputText value="#{userErr}" />
	</h:form>

    </body>
</html>

</f:view>