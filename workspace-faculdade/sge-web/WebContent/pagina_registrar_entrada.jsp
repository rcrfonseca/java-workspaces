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
<title>Página Registrar Entrada</title>
</head>
<body>

<form action="registrar_entrada.jsp" method="post">

<fieldset><legend>Registrar Entrada</legend>

<table>
	<tr>
		<td>Horário de Entrada:</td>

		<td><input type="text" value="" name="horario_entrada" size="20"></td>

	</tr>
	<tr>
		<td>Placa:</td>

		<td><input type="text" value="" name="placa" size="20"></td>

	</tr>
	<tr>
		<td>Quantidade de Vagas Restantes:</td>

		<td><input type="text" value="" name="qtd_vagas_restantes"
			size="10"></td>

	</tr>

	<tr>
		<td></td>

		<td><input type="button" value="Registrar" onclick="submit()">
		<input type="button" value="Consultar" onclick="submit()"></td>



	</tr>
</table>
<br>
<a href="menu.jsp"> Voltar ao Menu</a></fieldset>



</form>


</body>
</html>