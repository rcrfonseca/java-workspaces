<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Projeto 01 - Struts 1.0 Framework MVC </title>
</head>
<body>

<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<h2> Dados dos Alunos </h2>

Aluno: <br/>
<bean:write property="aluno" name="alunos"/>
<br/>Disciplina: <br/>
<bean:write property="disciplina" name="alunos"/>
<br/>Nota 1: <br/>
<bean:write property="nota1" name="alunos"/>
<br/>Nota 2: <br/>
<bean:write property="nota2" name="alunos"/>
<br/>Professor: <br/>
<bean:write property="professor" name="alunos"/>

<p/>
<html:link page="/index.jsp"> Voltar para página Inicial </html:link>

</body>
</html>