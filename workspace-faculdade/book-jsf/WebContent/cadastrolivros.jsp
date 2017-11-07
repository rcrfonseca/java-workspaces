<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Livro</title>
</head>
<body>
  <h1>
     <h:outputText value="Cadastro de Livro" />
  </h1>
     <br>
<hr>
  <h:form>
      <h:messages style="color: red" />
    <h:panelGrid columns="2" >
      <h:outputText value="Digite o T�tulo" />
      <h:inputText id="titulo" value="#{livroMB.livro.titulo}" required="true" requiredMessage="campo t�tulo obrigat�rio" />
      <h:outputText value="Digite o Autor" />
      <h:inputText id="autor" value="#{livroMB.livro.autor}" required="true" requiredMessage="campo autor obrigat�rio" />
      <h:outputText value="Digite o ISBN" />
      <h:inputText id="isbn" value="#{livroMB.livro.isbn}" required="true" requiredMessage="campo ISBN obrigat�rio" />
      <h:outputText  value="Digite o Pre�o" />
      <h:inputText id="preco" value="#{livroMB.livro.preco}"  required="true" requiredMessage="campo pre�o obrigat�rio"/>
      <h:outputText  value="Digite a Saldo" />
      <h:inputText id="estoque" value="#{livroMB.livro.estoque}"  required="true" requiredMessage="campo estoque obrigat�rio"/>
      <h:commandButton action="#{livroMB.salvar}"  value="Gravar" />
      <h:commandButton action="listar" immediate="true" value="Cancelar" />
    </h:panelGrid>
    <h:inputHidden id="id" value="#{livroMB.livro.id}" />
  </h:form>     
</body>
</html>

</f:view>