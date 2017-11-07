<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Página Principal</title>
	<style type="text/css">
		.cabecalho{
			background-color: #000;
			color: #FFF;
		}
		.linha1{
			background-color: #bbb;
		}
		.linha2{
			background-color: #eee;
		}
	</style>
	</head>
	<body>
	<h2>Projeto JSF Aula 01</h2>
	<hr />

	<h:form>

		<h:panelGrid columns="2">

			<h:outputLabel value="Nome:" />
			<h:inputText size="25" value="#{Manager.cliente.nome}" />

			<h:outputLabel value="Email:" />
			<h:inputText size="25" value="#{Manager.cliente.email}" />

			<h:outputLabel value="Telefone:" />
			<h:inputText size="25" value="#{Manager.cliente.telefone}" />

			<h:commandButton value="Cadastrar" action="#{Manager.salvar}" />
		</h:panelGrid>

		<h:messages />

	</h:form>

	<h2>Clientes Cadastrados</h2>
	<h:dataTable headerClass="cabecalho" rowClasses="linha1,linha2" value="#{Manager.clientes}" var="c" border="0">
	
		<h:column>
			<f:facet name="header">
				<h:outputText value="Código do Cliente">
				</h:outputText>
			</f:facet>
			<h:outputText value="#{c.id}"/>
		</h:column>
		
		<h:column>
			<f:facet name="header">
				<h:outputText value="Nome do Cliente">
				</h:outputText>
			</f:facet>
			<h:outputText value="#{c.nome}"/>
		</h:column>
		
		<h:column>
			<f:facet name="header">
				<h:outputText value="Email do Cliente">
				</h:outputText>
			</f:facet>
			<h:outputText value="#{c.email}"/>
		</h:column>
		
		<h:column>
			<f:facet name="header">
				<h:outputText value="Telefone do Cliente">
				</h:outputText>
			</f:facet>
			<h:outputText value="#{c.telefone}"/>
		</h:column>

	</h:dataTable>
	</body>
	</html>
</f:view>