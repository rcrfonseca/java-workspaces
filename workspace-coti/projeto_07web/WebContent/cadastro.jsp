<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Projeto 01 - Struts 1.0 Framework MVC </title>
</head>
<body>

<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%-- taglib tem sempre a extensão .tld. Não é necessário usar as 3 deste exemplo. --%>
<%-- Comentário no struts --%>
<%-- Primeira classe do struts é a Action Form --%>

<html:html>
	<html:form method="POST" action="Controle">
	
	Aluno: <br/>
	<html:text property="aluno.aluno" value="" size="35" /> <!-- Property vem sempre da classe. -->
	
	<br/> Disciplina: <br/>
	<html:text property="aluno.disciplina" value="" size="20" />
	
	<br/> Nota 1: <br/>
	<html:text property="aluno.nota1" value="" size="8" />
	
	<br/> Nota 2: <br/>
	<html:text property="aluno.nota2" value="" size="8" />
	
	<br/> Professor: <br/>
	<html:text property="aluno.professor" value="" size="20" />
	
	<p/>
	<html:submit>Enviar os Dados</html:submit>
	</html:form>

</html:html>

</body>
</html>