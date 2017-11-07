<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página Principal</title>
</head>
<body>
<img src="D:\learning.png" width="1500" height="100" border="0" align="top">
  <h:outputText value=" - Olá: #{sessaoMB.usuario.nome}" ></h:outputText>
  <h1 align="center" ><font size="5" color="Blue">Escolha uma opção</font></h1>

<table border>

  <h:form>
    <tr>
    <th><h:commandLink action="listaralunos">Cadastro de Alunos</h:commandLink></th>
    </tr>
    
    <tr>
    <th><h:commandLink action="listadeUsuarios">Cadastro de Material</h:commandLink></th>
    </tr>
    <br>
  <tr>
    
    <th><h:commandLink action="listaDeTurmas">Cadastro de Turmas</h:commandLink></th>
    
    </tr>
    <h:commandLink action="#{loginMB.logoff}">Sair</h:commandLink>
  </h:form>
</table>
</body>
</html>

</f:view>