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
<title>P�gina Manter Ve�culo</title>
</head>
<body>

<form action="gravar_veiculo.jsp" method="post">

<fieldset><legend>Manter Ve�culo</legend>

<table>
	<tr>
		<td>Placa:</td>


		<td> <input type="text" value="" name="placa" size="20"></td>

	</tr>
	<tr>
		<td> Modelo:</td>


		<td> <input type="text" value="" name="modelo" size="20"></td>

	</tr>
	<tr>
		<td>Cor:</td>


		<td><input type="text" value="" name="cor" size="10"></td>

	</tr>


	<tr>
		<td></td>
		<td>
		<input type="button" value="Registrar" onclick="submit()">
		<input type="button" value="Consultar" onclick="submit()"></td>
	</tr>
</table>
<br>
<a href="menu.jsp"> Voltar ao Menu</a></fieldset>



</form>


</body>
</html>