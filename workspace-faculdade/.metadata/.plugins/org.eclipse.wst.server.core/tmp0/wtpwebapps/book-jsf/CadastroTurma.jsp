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
<title>Cadastro de Turmas</title>
</head>
<body>
  <h1>
     <h:outputText value="Cadastro de Turmas" />
  </h1>
     <br>
<hr>
  <h:form>
      <h:messages style="color: red" />
    <h:panelGrid columns="2" >
      <h:outputText value="Horario" />
      <h:inputText id="horario" value="#{turmaMB.turma.horario}" required="true" requiredMessage="Campo de preenchimento obrigatório" />
      <h:outputText value="Tuno:" />
      <h:inputText id="turno" value="#{turmaMB.turma.turno}" required="true" requiredMessage="Campo de preenchimento obrigatório" />
      <h:outputText value="Quantidade de Alunos" />
      <h:inputText id="qtdalunos" value="#{turmaMB.turma.qtdalunos}" required="true" requiredMessage="Campo de preenchimento obrigatório" />
      <h:commandButton action="#{turmaMB.salvar}"  value="Gravar" /> 
      <h:commandButton action="#{turmaMB.cancelar}" immediate="true" value="Cancelar" /> 
      </h:panelGrid>
    <h:inputHidden id="id" value="#{turmaMB.turma.id}" />
  </h:form>     
</body>
</html>

</f:view>