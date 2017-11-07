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
	<h1><h:outputText value="Cadastro de Veículos" /></h1>
	<br>
	<hr>
	<h:form>
		<h:messages style="color: red" />
		<h:panelGrid columns="2">
			<h:outputLabel value="Digite o Modelo" />
			<h:inputText id="modelo" value="#{veiculoMB.veiculo.modelo}"
				required="true" requiredMessage="campo modelo obrigatório" />
			<h:outputLabel value="Digite a Cor" />
			<h:inputText id="cor" value="#{veiculoMB.veiculo.cor}"
				required="true" requiredMessage="campo cor obrigatório" />
			<h:outputLabel value="Digite a Placa" />
			<h:inputText id="placa" value="#{veiculoMB.veiculo.placa}"
				required="true" requiredMessage="campo placa obrigatório" />

			<h:commandButton action="#{veiculoMB.salvar}" value="Gravar" />
			<h:commandButton action="listar" immediate="true" value="Cancelar" />
		</h:panelGrid>
		<h:inputHidden id="id" value="#{veiculoMB.veiculo.id}" />
	</h:form>
	</body>
	</html>

</f:view>