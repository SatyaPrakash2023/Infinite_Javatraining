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
Employ No
                    <h:inputText id="empno" value="#{Employ.empno}" /> <br/>
Employ Name
                    <h:inputText id="name" value="#{Employ.name}" /> <br/>
Gender 
					<h:selectOneMenu value="#{Employ.gender}">
						<f:selectItem itemValue="MALE" itemLabel="Male" />
				    <f:selectItem itemValue="FEMALE" itemLabel="Female" />
				</h:selectOneMenu>                    
Department 
                    <h:inputText id="dept" value="#{Employ.dept}" /> <br/>
Designation
                    <h:inputText id="desig" value="#{Employ.desig}" /> <br/>
Basic
                    <h:inputText id="basic" value="#{Employ.basic}"/> <br/>
                    <h:commandButton value="Add Employ" 
                    	action="#{ejbImpl.addEmployEjb(Employ)}" />
        
        </h:form>
    </body>
</html>
</f:view>