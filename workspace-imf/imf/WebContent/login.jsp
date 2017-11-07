<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Autenticação</title>
	</head>
	<body>
	<h1><h:outputText value="Autenticação" /></h1>
	<br>
	<hr>
	<h:form>
		<h:messages style="color: red" />
		<h:panelGrid columns="2">
			<h:outputText value="Digite o login" />
			<h:inputText id="login" value="#{loginMB.usuario.login}"
				required="true" requiredMessage="Campo login obrigatório." />
			<h:outputText value="Digite a senha" />
			<h:inputSecret id="senha" value="#{loginMB.usuario.senha}"
				required="true" requiredMessage="Campo senha obrigatório." />
			<h:commandButton action="#{loginMB.logar}" value="Enviar" />
		</h:panelGrid>
	</h:form>
	<h:form>
		<h:commandLink action="cadastrarUsuario">Cadastrar novo usuario</h:commandLink>
	</h:form>

	</body>
	</html>

</f:view>