<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Máquinas</title>
	</head>
	<body>
	<h:form>
		<h:commandLink action="editarMaquina">Incluir Máquina</h:commandLink>
		<br>
		<h:commandLink action="exibirHome">Voltar para Home</h:commandLink>
		<h:outputText value=" - Usuário: #{sessaoMB.usuario.nome}"></h:outputText>
		<hr>
		<h1>Lista de Máquinas</h1>
		<br>
		<h:dataTable var="maquina" value="#{maquinaMB.maquinas}" border="1"
			cellspacing="0" width="80%">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Alterar" />
				</f:facet>
				<h:commandLink value="Alterar" action="#{maquinaMB.abrirAlteracao}">
					<f:param name="id" value="#{maquina.id}"></f:param>
				</h:commandLink>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Excluir" />
				</f:facet>
				<h:commandLink value="Excluir" action="#{maquinaMB.excluir}">
					<f:param name="id" value="#{maquina.id}"></f:param>
				</h:commandLink>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Nome" />
				</f:facet>
				<h:outputText value="#{maquina.nome}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="CPU" />
				</f:facet>
				<h:outputText value="#{maquina.cpu}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Potência" />
				</f:facet>
				<h:outputText value="#{maquina.potencia}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="RAM" />
				</f:facet>
				<h:outputText value="#{maquina.ram}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Vídeo" />
				</f:facet>
				<h:outputText value="#{maquina.video}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="HD" />
				</f:facet>
				<h:outputText value="#{maquina.hd}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Drive" />
				</f:facet>
				<h:outputText value="#{maquina.drive}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Placa-mãe" />
				</f:facet>
				<h:outputText value="#{maquina.placamae}" />
			</h:column>

			<f:facet name="footer">
				<h:outputText value="Total de maquinas: #{maquinaMB.numeroMaquinas}" />
			</f:facet>

		</h:dataTable>
	</h:form>
	</body>
	</html>

</f:view>
