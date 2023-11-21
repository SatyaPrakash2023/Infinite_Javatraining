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
                <h2 style="text-align: center" class="col-sm-4">Edit Your Record</h2>
            <hr/>
Agent Id
                    <h:inputText id="empno" value="#{agentFound.agentId}" /> <br/>
Agent Name
                    <h:inputText id="name" value="#{agentFound.name}" /> <br/>
Agent City 
                    <h:inputText id="gender" value="#{agentFound.city}" /> <br/>                    
Agent Gender 
                    <h:inputText id="dept" value="#{agentFound.gender}" /> <br/>
Agent MaritialStatus
                    <h:inputText id="desig" value="#{agentFound.maritalStatus}" /> <br/>

                    <h:commandButton value="Update" 
                    	action="#{agentImpl.updateAgentEjb(agentFound)}" />
        
        </h:form>
    </body>
</html>
</f:view>