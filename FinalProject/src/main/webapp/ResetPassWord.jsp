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
	<h:outputText value="Provider Id " />
	<h:inputText id="id" value="#{proAuth.providerId}" /><br/> 
	<h:message for="form:id"></h:message>
	<br/><br/>	
	<h:outputText value="Provider PassWord" />
	<h:inputText id="password" value="#{proAuth.password}" /><br/>
	<h:message for="form:password"></h:message>
	<br/><br/>
	
	<h:outputText value="Customer ResetPassWord" />
	<h:inputText id="retypePassWord" value="#{proAuth.retypePassWord}" /><br/>
	<h:message for="form:retypePassWord"></h:message>
	<br/><br/>
	
	<h:commandButton action="#{Controller.ResetPassWord()}" value="Reset PassWord" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<h:commandButton type="reset" value="Reset"></h:commandButton><br/><br/>
	
	<h:outputText value="#{resetErr}" />
	</h:form>

    </body>
</html>

</f:view>