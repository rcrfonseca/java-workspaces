<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
body {
	font-family: verdana;
	font-size: 9pt;
	padding: 30pt;
}

fieldset {
	padding: 20px;
	background-color: #eaeaea;
	border: 1px solid #0000aa;
}

legend {
	background: #fff;
	font-weight: bold;
	color: #0000aa;
}
</style>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>P�gina Exibir Vagas</title>
</head>
<body>

<form action="gravar_usuario.jsp" method="post">

<fieldset><legend>Exibir Vagas</legend>

<table>
	<tr>
		<td>Total de Vagas:</td>
		<td><input type="text" value="" name="nome" size="10"></td>
	</tr>
	<tr>
		<td>Vagas Especiais:</td>
		<td><input type="text" value="" name="email" size="10"></td>
	</tr>
	<tr>
		<td>Vagas Ocupadas:</td>
		<td><input type="text" value="" name="login" size="10"></td>
	</tr>
	<tr>
		<td>Vagas Dispon�veis:</td>
		<td><input type="text" value="" name="login" size="10"></td>
	</tr>
	<tr>
		<td><input type="button" value="Listar Vagas" onclick="submit()"></td>


	</tr>
</table>
<br>
<a href="menu.jsp"> Voltar ao Menu</a></fieldset>



</form>


</body>
</html>