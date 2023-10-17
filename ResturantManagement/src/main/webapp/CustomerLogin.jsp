<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 

<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <center>
		<h2>
	<h:outputText value="Customer Login" />
	</h2>
	<h:form>
	<h:outputText value="UserName : " />
	<h:inputText value="#{customer.cususername}" /><br/><br/>
	<h:outputText value="Password : " />
	<h:inputText value="#{customer.cuspassword}" /><br/><br/>
	<h:commandButton action="#{customerDao.customerLoginDao(customer)}" value="Login" />
	</h:form>
</center>
    </body>
</html>
</f:view>