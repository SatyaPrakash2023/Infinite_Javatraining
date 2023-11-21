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
			<h2>
				<h:outputText value="Patient Records" />
			</h2>
		</center>
		<h:dataTable value="#{ejbImpl.showPatientEjb()}" var="e" border="3">
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Patient Id" />
				</f:facet>
				<h:outputText value="#{e.pid}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Patient Name" />
				</f:facet>
				<h:outputText value="#{e.name}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Patient Age" />
				</f:facet>
				<h:outputText value="#{e.age}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Patient Weight" />
				</f:facet>
				<h:outputText value="#{e.weight}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Patient Gender" />
				</f:facet>
				<h:outputText value="#{e.gender}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Patient Address" />
				</f:facet>
				<h:outputText value="#{e.address}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Patient phoneNo" />
				</f:facet>
				<h:outputText value="#{e.phoneNo}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Patient Disease" />
				</f:facet>
				<h:outputText value="#{e.disease}" />
			</h:column>
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Doctor Id" />
				</f:facet>
				<h:outputText value="#{e.doctId}" />
			</h:column>
			<h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Allocate Room" />
                    </f:facet>
                    <h:commandButton action="#{ejbImpl.RoomAllocationEjb(e.pid) }" value="Admit Patient" />
                </h:column>
		</h:dataTable>
	</h:form>
</body>
	</html>
</f:view>
