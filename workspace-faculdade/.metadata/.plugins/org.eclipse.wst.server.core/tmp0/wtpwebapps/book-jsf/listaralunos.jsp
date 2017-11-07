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
	
	td{
		color:black;
	}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Alunos</title>
</head>
<body>
<h:form>
    <h:commandLink action="editaraluno"> Incluir Aluno </h:commandLink>
    <br>
	<h:commandLink action="exibirHome">Voltar para Home</h:commandLink>
	<h:outputText value=" - Usuário: #{sessaoMB.usuario.nome}" ></h:outputText>
  <hr>
  <h1>Alunos Cadastrados no Sistema</h1>     
  <br>
     <h:dataTable var="Aluno" value="#{AlunoMB.Alunos}"  
                                     border="1" cellspacing="0" width="80%" >
       <h:column>
          <f:facet name="header">
            <h:outputText value="Opções" />
          </f:facet>
		  <h:commandLink value="Alterar" action="#{AlunoMB.abrirAlteracao}">
		  	<f:param name="id" value="#{Aluno.id}" ></f:param>
		  </h:commandLink>
       </h:column>

   

       <h:column>
          <f:facet name="header">
            <h:outputText value="Nome" />
          </f:facet>
          <h:outputText value="#{Aluno.nome}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Serie" />
          </f:facet>
          <h:outputText value="#{Aluno.serie}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Idade" />
          </f:facet>
          <h:outputText value="#{Aluno.idade}" />
       </h:column>

       <h:column>
          <f:facet name="header">
            <h:outputText value="Responsavel" />
          </f:facet>
          <h:outputText value="#{Aluno.responsavel}" />
       </h:column>
       
      
       <f:facet name="footer">
        <h:outputText value="Total de Alunos: #{AlunoMB.numeroAlunos}" />
       </f:facet>

     </h:dataTable>
</h:form>
</body>
</html>

</f:view>
