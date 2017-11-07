<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>

	<style type="text/css">
body {
	font-family: arial;
	font-size: 10pt;
	padding: 30pt;
}

fieldset {
	padding: 30px;
	background-color: #red;
	width: 500px;
	border: 1px solid #0000aa;
}

legend {
	background: #fff;
	font-weight: bold;
	color: #0000aa;
}

td {
	color: black;
}
</style>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Turmas</title>
	</head>
	<body>
	<h:form>
		<h:commandLink action="exibirHome">Voltar para Home</h:commandLink>
		<h:outputText value=" - Usuário: #{sessaoMB.turma.nome}"></h:outputText>
		<hr>
		<h1>Usuários Cadastrados no Sistema</h1>
		<br>
		<h:dataTable var="turma" value="#{turmaMB.turmas}" border="1"
			cellspacing="0" width="80%">
			<h:column>
				<f:facet name="header">
					<h:outputText value="Opções" />
				</f:facet>
				<h:commandLink value="Alterar" action="#{turmaMB.abrirAlteracao}">
					<f:param name="id" value="#{turma.id}"></f:param>
				</h:commandLink>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Opções" />
				</f:facet>
				<h:commandLink value="Excluir" action="#{turmaMB.excluir}">
					<f:param name="id" value="#{turma.id}"></f:param>
				</h:commandLink>
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Horario" />
				</f:facet>
				<h:outputText value="#{turma.horario}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Tuno" />
				</f:facet>
				<h:outputText value="#{turma.turno}" />
			</h:column>

			<h:column>
				<f:facet name="header">
					<h:outputText value="Quantidade de Alunos" />
				</f:facet>
				<h:outputText value="#{turma.qtdalunos}" />
			</h:column>

			

			<f:facet name="footer">
				<h:panelGroup>
					<h:outputText value="Turmas cadastrados: " />
					<h:outputText value="#{turmaMB.numeroturmas}" />
				</h:panelGroup>
			</f:facet>


		</h:dataTable>
	</h:form>
	</body>
	</html>

</f:view>