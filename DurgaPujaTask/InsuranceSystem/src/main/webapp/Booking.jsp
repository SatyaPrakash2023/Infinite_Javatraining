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
	<h:outputText value="Add Plans" />
	</h2>
	<h:form id="form">
	<h:outputText value="Plans Id " />
	<h:inputText id="id" value="#{inssu.planId}" /><br/> 
	<h:message for="form:id"></h:message>
	<br/><br/>
	<h:outputText value="Insurance Id " />
	<h:inputText id="insId" value="#{inssu.insId}" /><br/> 
	<h:message for="form:insId"></h:message>
	<br/><br/>
	<h:outputText value="Customer Id" />
	<h:inputText id="custId" value="#{policy.custId}" /><br/> 
	<h:message for="form:custId"></h:message>
	<br/><br/>
	<h:outputText value="Premium Amount " />
	<h:inputText id="premiumAmount" value="#{inssu.premiumAmount}" /><br/> 
	<h:message for="form:premiumAmount"></h:message>
	<br/><br/>
	
	<h:selectOneMenu value="#{policy.payMode}">
	   	<f:selectItem itemValue="MONTHLY" itemLabel="MONTHLY" />
	   	<f:selectItem itemValue="QUARTERLY" itemLabel="QUARTERLY" />
	   	<f:selectItem itemValue="HALFYEARLY" itemLabel="HALFYEARLY" />
	   	<f:selectItem itemValue="YEARLY" itemLabel="YEARLY" />
	   	
	</h:selectOneMenu>
	<h:outputText value="Register Date " />
	<h:inputText id="registerDate" value="#{policy.registerDate}">  
		<f:convertDateTime pattern="dd-MM-yyyy"/>  
	</h:inputText>
	<h:commandButton action="#{ejbImpl.addCustomerPlans(policy,inssu)}" value="Add Plans" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<h:commandButton type="reset" value="Reset"></h:commandButton>
	
	</h:form>

    </body>
</html>

</f:view>