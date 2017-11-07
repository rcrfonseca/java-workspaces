<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Livros</title>
</head>
<body>
<h:form>
    <h:commandLink action="editarLivro">Incluir Livro</h:commandLink>
    <br>
	<h:commandLink action="exibirHome">Voltar para Home</h:commandLink>
	<h:outputText value=" - Usuário: #{sessaoMB.usuario.nome}" ></h:outputText>
  <hr>
  <h1>Lista de Usuários</h1>     
  <br>
     <h:dataTable var="livro" value="#{livroMB.livros}"  
                                     border="1" cellspacing="0" width="80%" >
       <h:column>
          <f:facet name="header">
            <h:outputText value="Opções" />
          </f:facet>
		  <h:commandLink value="Alterar" action="#{livroMB.abrirAlteracao}">
		  	<f:param name="id" value="#{livro.id}" ></f:param>
		  </h:commandLink>
       </h:column>

      <h:column>
          <f:facet name="header">
            <h:outputText value="Opções" />
          </f:facet>
		  <h:commandLink value="Excluir" action="#{livroMB.excluir}">
		  	<f:param name="id" value="#{livro.id}" ></f:param>
		  </h:commandLink>
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Titulo" />
          </f:facet>
          <h:outputText value="#{livro.titulo}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Autor" />
          </f:facet>
          <h:outputText value="#{livro.autor}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="ISBN" />
          </f:facet>
          <h:outputText value="#{livro.isbn}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Preço" />
          </f:facet>
          <h:outputText value="#{livro.preco}" />
       </h:column>

       <f:facet name="footer">
        <h:outputText value="Total de livros: #{livroMB.numeroLivros}" />
       </f:facet>

     </h:dataTable>
</h:form>
</body>
</html>

</f:view>
