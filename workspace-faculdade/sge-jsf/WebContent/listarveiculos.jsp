<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Veículos</title>
	</head>
	<body>
	<h:form>
		<h:commandLink action="editarVeiculo">Incluir Veículo</h:commandLink>
		<br>
		<h:commandLink action="exibirHome">Voltar para Home</h:commandLink>
		<h:outputText value=" - Usuário: #{sessaoMB.usuario.nome}"></h:outputText>
		<hr>
		<h1>Lista de Veículos</h1>
		<br>
		<h:dataTable var="veiculo" value="#{veiculoMB.veiculos}" border="1"
			cellspacing="0" width="80%">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Opções" />
				</f:facet>
				<h:commandLink value="Alterar" action="#{veiculoMB.abrirAlteracao}">
					<f:param name="id" value="#{veiculo.id}"></f:param>
				</h:commandLink>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Opções" />
				</f:facet>
				<h:commandLink value="Excluir" action="#{veiculoMB.excluir}">
					<f:param name="id" value="#{veiculo.id}"></f:param>
				</h:commandLink>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Modelo" />
				</f:facet>
				<h:outputText value="#{veiculo.modelo}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Cor" />
				</f:facet>
				<h:outputText value="#{veiculo.cor}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Placa" />
				</f:facet>
				<h:outputText value="#{veiculo.placa}" />
			</h:column>

			<f:facet name="footer">
				<h:outputText value="Total de veiculos: #{veiculoMB.numeroVeiculos}" />
			</f:facet>

		</h:dataTable>
	</h:form>
	</body>
	</html>

</f:view>
