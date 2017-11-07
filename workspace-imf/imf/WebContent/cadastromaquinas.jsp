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
	<h1><h:outputText value="Cadastro de Máquinas" /></h1>
	<br>
	<hr>
	<h:form>
		<h:messages style="color: red" />
		<h:panelGrid columns="2">

			<h:outputLabel value="Digite o Nome" />
			<h:inputText id="nome" value="#{maquinaMB.maquina.nome}"
				required="true" requiredMessage="Campo nome é obrigatório." />

			<h:outputLabel value="Digite o modelo da CPU" />
			<h:inputText id="cpu" value="#{maquinaMB.maquina.cpu}"
				required="true" requiredMessage="Campo CPU é obrigatório." />

			<h:outputLabel value="Digite a Potência da CPU" />
			<h:inputText id="potencia" value="#{maquinaMB.maquina.potencia}"
				required="true" requiredMessage="Campo potência é obrigatório." />

			<h:outputLabel value="Digite a quantidade de memória RAM" />
			<h:inputText id="ram" value="#{maquinaMB.maquina.ram}"
				required="true" requiredMessage="Campo memória RAM é obrigatório." />

			<h:outputLabel value="Digite a quantidade de memória de vídeo" />
			<h:inputText id="video" value="#{maquinaMB.maquina.video}"
				required="true"
				requiredMessage="Campo memória de vídeo é obrigatório." />

			<h:outputLabel value="Digite a quantidade de espaço do HD" />
			<h:inputText id="hd" value="#{maquinaMB.maquina.hd}" required="true"
				requiredMessage="Campo quantidade de espaço do HD é obrigatório." />

			<h:outputLabel value="Digite o tipo de drive da máquina." />
			<h:inputText id="drive" value="#{maquinaMB.maquina.drive}"
				required="true" requiredMessage="Campo tipo de drive é obrigatório." />

			<h:outputLabel value="Digite o nome da placa-mãe da máquina." />
			<h:inputText id="placamae" value="#{maquinaMB.maquina.placamae}"
				required="true"
				requiredMessage="Campo o nome da placa-mãe é obrigatório." />

			<h:commandButton action="#{maquinaMB.salvar}" value="Gravar" />
			<h:commandButton action="listar" immediate="true" value="Cancelar" />
		</h:panelGrid>
		<h:inputHidden id="id" value="#{maquinaMB.maquina.id}" />
	</h:form>
	</body>
	</html>

</f:view>