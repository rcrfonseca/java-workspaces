<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Clientes</title>
	</head>
	<body>
	<h:form>
		<h:commandLink action="editarCliente">Incluir Cliente</h:commandLink>
		<br>
		<h:commandLink action="exibirHome">Voltar para Home</h:commandLink>
		<h:outputText value=" - Usuário: #{sessaoMB.usuario.nome}"></h:outputText>
		<hr>
		<h1>Lista de Clientes</h1>
		<br>
		<h:dataTable var="cliente" value="#{clienteMB.clientes}" border="1"
			cellspacing="0" width="80%">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Opções" />
				</f:facet>
				<h:commandLink value="Alterar" action="#{clienteMB.abrirAlteracao}">
					<f:param name="id" value="#{cliente.id}"></f:param>
				</h:commandLink>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Opções" />
				</f:facet>
				<h:commandLink value="Excluir" action="#{clienteMB.excluir}">
					<f:param name="id" value="#{cliente.id}"></f:param>
				</h:commandLink>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Nome" />
				</f:facet>
				<h:outputText value="#{cliente.nome}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="CPF" />
				</f:facet>
				<h:outputText value="#{cliente.cpf}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Logradouro" />
				</f:facet>
				<h:outputText value="#{cliente.logradouro}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Numero" />
				</f:facet>
				<h:outputText value="#{cliente.numero}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Complemento" />
				</f:facet>
				<h:outputText value="#{cliente.complemento}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Bairro" />
				</f:facet>
				<h:outputText value="#{cliente.bairro}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Cidade" />
				</f:facet>
				<h:outputText value="#{cliente.cidade}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="UF" />
				</f:facet>
				<h:outputText value="#{cliente.uf}" />
			</h:column>


			<f:facet name="footer">
				<h:panelGroup>
					<h:outputText value="Clientes cadastrados: " />
					<h:outputText value="#{clienteMB.numeroClientes}" />
				</h:panelGroup>
			</f:facet>


		</h:dataTable>
	</h:form>
	</body>
	</html>

</f:view>