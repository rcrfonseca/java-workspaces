<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sistema Gerenciador de Estacionamentos - Página Principal</title>
	</head>
	<body>
	<div align="right"><h:outputText
		value=" - Usuário: #{sessaoMB.usuario.nome}"></h:outputText></div>
	<br></br>
	<div align="center"><h:graphicImage value="imagens/logo.jpg" /></div>


	<center>
	<h2>Selecione a opção desejada:</h2>
	</center>

	<div align="center"><h:form>
		<h2><h:commandLink action="listaDeVeiculos">Cadastro de Veículos  |</h:commandLink>

		<h:commandLink action="listaDeUsuarios">Cadastro de Usuários  |</h:commandLink>

		<h:commandLink action="listaDeClientes">Cadastro de Clientes </h:commandLink>
		<br>
		</h2>
		<br>
		<div align="center"><h:commandLink action="#{loginMB.logoff}">Sair</h:commandLink></div>
	</h:form></div>

	</body>
	</html>

</f:view>