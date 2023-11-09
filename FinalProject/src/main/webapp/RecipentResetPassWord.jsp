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
	<h:outputText value="Old PassWord" />
	<h:inputText id="oldPassWord" value="#{recipentOldpass.oldPassWord}" /><br/> 
	<h:message for="form:oldPassWord"></h:message>
	<br/><br/>	
	<h:outputText value="PassWord" />
	<h:inputText id="password" value="#{recipentOldpass.password}" /><br/>
	<h:message for="form:password"></h:message>
	<br/><br/>
	
	<h:outputText value="Provider ConfirmPassWord" />
	<h:inputText id="retypePassWord" value="#{recipentOldpass.retypePassWord}" /><br/>
	<h:message for="form:retypePassWord"></h:message>
	<br/><br/>
	
	<h:commandButton action="#{recipentcontro.ResetPassWord()}" value="Reset PassWord" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<h:commandButton type="reset" value="Reset"></h:commandButton><br/><br/>
	
	<h:outputText value="#{resetErr}" />
	<h:outputText value="#{passWordErr}" />
	</h:form>

    </body>
</html>

</f:view>