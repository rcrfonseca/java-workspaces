<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>Login</title>

	</head>
	<h1 align="Center"></h1>
	<body>
	<img src="D:\learning.png" width="1500" height="100" border="0" align="top">
	

	<hr>
	<h3 align="center"><h:form>
		<h:messages style="color: red" />
		<h:panelGrid columns="2">
			<h:outputText value="Digite o login" />
			<h:inputText id="login" value="#{loginMB.usuario.login}"
				required="true" requiredMessage="campo login obrigatório" />
			<h:outputText value="Digite a senha" />
			<h:inputSecret id="senha" value="#{loginMB.usuario.senha}"
				required="true" requiredMessage="campo senha obrigatório" />
			<br>
			<br>
			<br>
			<br>
			<h:commandButton action="#{loginMB.logar}" value="Enviar" />
		</h:panelGrid>
	</h:form></h3>
	<h:form>
		Cadastrar novo usuario
    <h:commandLink action="cadastrarUsuario">Clique aqui</h:commandLink>
  
	</h:form>

	</body>
	</html>

</f:view>