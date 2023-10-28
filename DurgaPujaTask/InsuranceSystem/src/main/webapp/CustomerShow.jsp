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
                <h2><h:outputText value="Customer Records"/></h2>
            </center>
        <h:dataTable value="#{ejbImpl.showCustomer()}" var="e" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Customer Id" />
                    </f:facet>
                    <h:outputText value="#{e.custId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="First Name" />
                    </f:facet>
                    <h:outputText value="#{e.firstName}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Last Name" />
                    </f:facet>
                    <h:outputText value="#{e.lastName}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Gender" />
                    </f:facet>
                    <h:outputText value="#{e.gender }"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Date OF Birth" />
                    </f:facet>
                    <h:outputText value="#{e.dateOfbirth}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="UserName" />
                    </f:facet>
                    <h:outputText value="#{e.userName}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Email" />
                    </f:facet>
                    <h:outputText value="#{e.email}"/>
                </h:column>               
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Status" />
                    </f:facet>
                    <h:outputText value="#{e.status}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Take Policy" />
                    </f:facet>
                    <h:commandButton action="AddCustomerPolicy" value="Take Policy" />
                </h:column>
                   
        </h:dataTable>              
        </h:form>
    </body>
</html>
</f:view>
