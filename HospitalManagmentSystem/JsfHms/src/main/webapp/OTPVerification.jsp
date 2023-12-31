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
    	<h:form>
    
    <body>
       
		<h2>
	<h:outputText value="Verify Otp" />
	</h2>
	<h:outputText value="Patient Name " />
	<h:inputText id="name" value="#{patient.name}" /><br/>
	<h:message for="form:name"></h:message>
	<br><br>
	<h:outputText value="Otp" />
	<h:inputText id="Otp" value="#{patient.otp}" /><br/>
	<h:message for="form:Otp"></h:message>
	<br/><br/>
	<h:commandButton action="#{ejbImpl.verifyOtp(patient)}" value="Add Patient" />
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<h:commandButton type="reset" value="Reset"></h:commandButton>
	
	</h:form>

    </body>
</html>

</f:view>