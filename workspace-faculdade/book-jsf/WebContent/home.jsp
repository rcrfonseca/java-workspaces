<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bookstore - Página Principal</title>
</head>
<body>
  <h:outputText value=" - Usuário: #{sessaoMB.usuario.nome}" ></h:outputText>
  <h1>Escolha uma opção</h1>

  <h:form>
    <h:commandLink action="listaDeLivros">Cadastro de Livros</h:commandLink>
    <br>
    <h:commandLink action="listaDeUsuarios">Cadastro de Usuários</h:commandLink>
    <br>
    <h:commandLink action="#{loginMB.logoff}">Sair</h:commandLink>
  </h:form>

</body>
</html>

</f:view>