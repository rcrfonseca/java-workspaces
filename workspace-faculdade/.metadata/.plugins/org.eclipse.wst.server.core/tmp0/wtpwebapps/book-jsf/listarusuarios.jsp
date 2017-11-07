<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Alunos</title>
</head>
<body>
<h:form>
	<h:commandLink action="exibirHome">Voltar para Home</h:commandLink>
	<h:outputText value=" - Usuário: #{sessaoMB.usuario.nome}" ></h:outputText>
  <hr>
  <h1>Lista de Alunos</h1>     
  <br>
     <h:dataTable var="user" value="#{userMB.usuarios}"  
                                     border="1" cellspacing="0" width="80%" >
       <h:column>
          <f:facet name="header">
            <h:outputText value="Opções" />
          </f:facet>
		  <h:commandLink value="Alterar" action="#{userMB.abrirAlteracao}">
		  	<f:param name="id" value="#{user.id}" ></f:param>
		  </h:commandLink>
       </h:column>

      <h:column>
          <f:facet name="header">
            <h:outputText value="Opções" />
          </f:facet>
		  <h:commandLink value="Excluir" action="#{userMB.excluir}">
		  	<f:param name="id" value="#{user.id}" ></f:param>
		  </h:commandLink>
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Nome" />
          </f:facet>
          <h:outputText value="#{user.nome}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="E-mail" />
          </f:facet>
          <h:outputText value="#{user.email}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Login" />
          </f:facet>
          <h:outputText value="#{user.login}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Senha" />
          </f:facet>
          <h:outputText value="#{user.senha}" />
       </h:column>

       <f:facet name="footer">
       <h:panelGroup>
        <h:outputText value="Usuários cadastrados: " />
        <h:outputText value="#{userMB.numeroUsuarios}" />
        </h:panelGroup>
       </f:facet>
 

     </h:dataTable>
</h:form>
</body>
</html>

</f:view>