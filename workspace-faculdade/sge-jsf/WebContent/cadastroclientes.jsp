<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Cadastro de Clientes</title>
	</head>
	<body>
	<h1><h:outputText value="Cadastro de Clientes" /></h1>
	<br>
	<hr>
	<h:form>
		<h:messages style="color: red" />
		<h:panelGrid columns="2">

			<h:outputLabel for="nome" value="Digite o Nome" />
			<h:inputText id="nome" value="#{clienteMB.cliente.nome}"
				required="true" requiredMessage="campo nome obrigat�rio"
				validatorMessage="O tamanho do campo nome � inv�lido.">
				<f:validateLength minimum="8"></f:validateLength>
			</h:inputText>

			<h:outputLabel for="cpf" value="Digite o CPF (Sem o tra�o)" />
			<h:inputText id="cpf" value="#{clienteMB.cliente.cpf}"
				required="true" requiredMessage="campo CPF � obrigat�rio"
				validatorMessage="CPF: A quantidade de n�meros � inv�lida.">
				<f:validateLength minimum="11" maximum="11"></f:validateLength>

			</h:inputText>

			<h:outputLabel for="logradouro" value="Digite o Logradouro" />
			<h:inputText id="logradouro" value="#{clienteMB.cliente.logradouro}"
				required="true" requiredMessage="campo logradouro obrigat�rio" />

			<h:outputLabel for="numero" value="Digite o N�mero" />
			<h:inputText id="numero" value="#{clienteMB.cliente.numero}"
				required="true" requiredMessage="campo numero obrigat�rio" />

			<h:outputLabel for="complemento" value="Digite o Complemento" />
			<h:inputText id="complemento"
				value="#{clienteMB.cliente.complemento}" required="complemento"
				requiredMessage="campo complemento obrigat�rio" />

			<h:outputLabel for="bairro" value="Digite o Bairro" />
			<h:inputText id="bairro" value="#{clienteMB.cliente.bairro}"
				required="bairro" requiredMessage="campo bairro obrigat�rio" />

			<h:outputLabel for="cidade" value="Digite a Cidade" />
			<h:inputText id="cidade" value="#{clienteMB.cliente.cidade}"
				required="true" requiredMessage="campo cidade obrigat�rio" />

			<h:outputLabel for="cidade" value="Selecione a UF" />
			<h:selectOneListbox>
			</h:selectOneListbox>





			<h:commandButton action="#{clienteMB.salvar}" value="Gravar" />

			<h:commandButton action="#{clienteMB.cancelar}" immediate="true"
				value="Cancelar" />

		</h:panelGrid>
		<h:inputHidden id="id" value="#{clienteMB.cliente.id}" />
	</h:form>
	</body>
	</html>

</f:view>