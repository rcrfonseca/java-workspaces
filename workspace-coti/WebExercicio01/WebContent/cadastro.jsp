<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercício 01 Web - Cadastro</title>
</head>
<body>

<h2><b>Digite as duas notas do aluno:</b></h2>
<hr/>
<form name="f" method="post" action="Controle">
<p/>
Digite a Nota 01:
<input type="text" name="nota1"/>
<p/>

Digite a Nota 02: 
<input type="text" name="nota2"/> 
<p>
<input type="submit" value="Enviar"/>
<input type="reset"	value="Apagar"/>
</form>

</body>
</html>