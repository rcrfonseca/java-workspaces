<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Usuários</title>
	</head>
	<body>
	<h1><h:outputText value="Cadastro de Usuários" /></h1>
	<br>
	<hr>
	<h:form>
		<h:messages style="color: red" />
		<h:panelGrid columns="2">

			<h:outputLabel for="nome" value="Digite o nome" />
			<h:inputText id="nome" value="#{userMB.usuario.nome}" required="true"
				requiredMessage="campo nome obrigatório"
				validatorMessage="O tamanho do campo nome é inválido.">
				<f:validateLength minimum="8"></f:validateLength>
			</h:inputText>

			<h:outputLabel for="email" value="Digite o e-mail" />
			<h:inputText id="email" value="#{userMB.usuario.email}"
				required="true" requiredMessage="campo email obrigatório">
				<f:validator validatorId="Email" />
			</h:inputText>

			<h:outputLabel for="login" value="Digite o login" />
			<h:inputText id="login" value="#{userMB.usuario.login}"
				required="true" requiredMessage="campo login obrigatório" />

			<h:outputLabel for="senha" value="Digite a senha" />
			<h:inputSecret id="senha" value="#{userMB.usuario.senha}"
				required="true" requiredMessage="campo senha obrigatório" />

			<h:commandButton action="#{userMB.salvar}" value="Gravar" />

			<h:commandButton action="#{userMB.cancelar}" immediate="true"
				value="Cancelar" />

		</h:panelGrid>
		<h:inputHidden id="id" value="#{userMB.usuario.id}" />
	</h:form>
	</body>
	</html>

</f:view>