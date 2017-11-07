<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>

<f:view>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Usuarios</title>
</head>
<body>
  <h1>
     <h:outputText value="Cadastro de Alunos" />
  </h1>
     <br>
<hr>
  <h:form>
      <h:messages style="color: red" />
    <h:panelGrid columns="2" >
      <h:outputText value="Digite o Nome" />
      <h:inputText id="nome" value="#{alunoMB.aluno.nome}" required="true" requiredMessage="campo nome obrigatório" />
      <h:outputText value="Digite o Responsavel" />
      <h:inputText id="responsavel" value="#{alunoMB.aluno.responsavel}" required="true" requiredMessage="campo responsavel obrigatório" />
      <h:outputText value="Digite o serie" />
      <h:inputText id="serie" value="#{alunoMB.aluno.serie}" required="true" requiredMessage="campo serie obrigatório" />
      <h:outputText  value="Digite o idade" />
      <h:inputText id="preco" value="#{alunoMB.aluno.preco}"  required="true" requiredMessage="campo idade obrigatório"/>
    
      <h:commandButton action="#{alunoMB.salvar}"  value="Gravar" />
      <h:commandButton action="listar" immediate="true" value="Cancelar" />
    </h:panelGrid>
    <h:inputHidden id="id" value="#{alunoMB.aluno.id}" />
  </h:form>     
</body>
</html>

</f:view>