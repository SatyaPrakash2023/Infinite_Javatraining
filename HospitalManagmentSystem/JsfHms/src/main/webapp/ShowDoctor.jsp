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

				<h:outputText value="Doctors Records" />

			</h2>
		</center>
		<h:dataTable value="#{ejbImpl.showDoctorEjb()}" var="e" border="3">
			<h:column>
				<f:facet name="header">
					<h:outputLabel value="Doctors Id" />

				</f:facet>

				<h:outputText value="#{e.doctId}" />

			</h:column>

			<h:column>

				<f:facet name="header">

					<h:outputLabel value="Doctor Name" />

				</f:facet>

				<h:outputText value="#{e.doctName}" />

			</h:column>

			<h:column>

				<f:facet name="header">

					<h:outputLabel value="Doctor Dept" />

				</f:facet>

				<h:outputText value="#{e.dept}" />

			</h:column>
			<h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Add Patient" />
                    </f:facet>
                    <h:commandButton action="#{ejbImpl.addDoctorIdEjb(e.doctId) }" value="Add Patient" />
                </h:column>

		</h:dataTable>

	</h:form>

</body>

	</html>

</f:view>
