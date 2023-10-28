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
                <h2><h:outputText value="Policy Records"/></h2>
            </center>
        <h:dataTable value="#{insList}" var="e" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Plan Id" />
                    </f:facet>
                    <h:outputText value="#{e.planId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Insurance Id" />
                    </f:facet>
                    <h:outputText value="#{e.insId}"/>
                </h:column>
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Premium Amount" />
                    </f:facet>
                    <h:outputText value="#{e.premiumAmount}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Coverage Amount" />
                    </f:facet>
                    <h:outputText value="#{e.coverageAmount}"/>
                </h:column>                                            
                <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Take Policy" />
                    </f:facet>
                    <h:commandButton action="#{ejbImpl.getCustomerPlans(e.planId) }" value="Take Plan" />
                </h:column>                 
        </h:dataTable>              
        </h:form>
    </body>
</html>
</f:view>
