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
Agent Name
                    <h:inputText id="name" value="#{agent.name}" /> <br/>
Agent City 
                    <h:inputText id="gender" value="#{agent.city}" /> <br/>                    
Agent Gender 
					<h:selectOneMenu value="#{employ.gender}">
						<f:selectItem itemValue="MALE" itemLabel="Male" />
				    <f:selectItem itemValue="FEMALE" itemLabel="Female" />
				</h:selectOneMenu>
Agent MaritialStatus
                    <h:inputText id="desig" value="#{agent.maritalStatus}" /> <br/>

                    <h:commandButton value="Update" 
                    	action="#{ejbImpl.addAgentEjb(agent)}" />
        
        </h:form>
    </body>
</html>
</f:view>