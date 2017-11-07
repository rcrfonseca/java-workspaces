<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sistema Gerenciador de Máquinas: Instituto Marcos Freitas - Página Principal</title>
	</head>
	<body>
	<div align="left"><h:outputText
		value="Usuário: #{sessaoMB.usuario.nome}"></h:outputText></div>
	<br></br>
	<div align="center"><h:graphicImage value="imagens/logo.jpg" /></div>


	<center>
	<h2>Sistema Gerenciador de Máquinas: Instituto Marcos Freitas</h2>
	</center>
	
	<center> <h2> Selecione a opção desejada: </h2> </center>
	

	<div align="center"><h:form>
		<h2> <h:commandLink action="listaDeMaquinas">Cadastro de Máquinas |</h:commandLink>

		<h:commandLink action="listaDeUsuarios">Cadastro de Usuários  |</h:commandLink>
		</h2>
		
		<br>
		<br>
				
		<div align="center"> <H3> <h:commandLink action="#{loginMB.logoff}">Sair</h:commandLink> </H3> </div>
	</h:form></div>

	</body>
	</html>

</f:view>