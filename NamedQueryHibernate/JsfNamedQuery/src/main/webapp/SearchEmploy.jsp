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
                <h2><h:outputText value="Search Employ"/></h2>
            
        Employ No:
        <h:outputText value="#{employFound.empno}"></h:outputText><br/><br/>
        Employ Name:
        <h:outputText value="#{employFound.name}"></h:outputText><br/><br/>
         Employ Gender:
        <h:outputText value="#{employFound.gender}"></h:outputText><br/><br/>
        Employ Dept:
        <h:outputText value="#{employFound.dept}"></h:outputText><br/><br/>
         Employ Desig:
        <h:outputText value="#{employFound.desig}"></h:outputText><br/><br/>
        Employ Dept:
        <h:outputText value="#{employFound.basic}"></h:outputText><br/><br/>
        </center>
        </h:form>
    </body>
</html>
</f:view>
