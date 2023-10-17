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
        <center>
		<h2>
	<h:outputText value="Add Customer" />
	</h2>
	<h:form>
	<h:outputText value="Customer Name" />
	<h:inputText value="#{customer.cusname}" /><br/> 
	<h:outputText value="Phone No" />
	<h:inputText value="#{customer.cusphnno}" /><br/>
	<h:outputText value="UserName" />
	<h:inputText value="#{customer.cususername}" /><br/>
	<h:outputText value="Password" />
	<h:inputText value="#{customer.cuspassword}" /><br/>
	<h:outputText value="Customer Email" />
	<h:inputText value="#{customer.cusemail}" /><br/>
	<h:commandButton action="#{customerController.addCustomer()}" value="Add Customer" />
	<h:messages/> 
	</h:form>
</center>
    </body>
</html>
</f:view>