<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Web Exerc�cio 05 - Projeto Login com Hibernate + Relat�rio</title>
</head>
<body>
<h2> P�gina de Relat�rio de Login </h2>
<hr/>
<br/>
<h3> Relat�rio de Logins Cadastrados </h3>
<form name="form" method="post" action="ControleRelatorio">
<input name="enviar" type="submit" value="Gerar Relat�rio" />
</form>
<h3> Resultado</h3>
${mensagem}
<hr/>
<br/>
<br/>
<a href="index.jsp"> Voltar para a index </a>


</body>
</html>