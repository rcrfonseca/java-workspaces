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
<title>P�gina Manter Cliente</title>
</head>
<body>

<form action="gravar_cliente.jsp" method="post">

<fieldset><legend>Manter Cliente</legend>

<table style="width: 805px">
	<tr>
		<td>Nome:</td>

		<td><input type="text" value="" name="nome" size="60"></td>

	</tr>
	<tr>
		<td>CPF:</td>

		<td><input type="text" value="" name="cpf" size="30"></td>

	</tr>
	<tr>
		<td>Logradouro:</td>

		<td><input type="text" value="" name="logradouro" size="50"></td>

	</tr>
	<tr>
		<td>N�mero:</td>
		<td><input type="text" value="" name="numero" size="6"></td>


	</tr>
	<tr>
		<td>Complemento:</td>
		<td><input type="text" value="" name="login" size="30"></td>
	</tr>
	<tr>
		<td>UF:</td>
		<td><select></select></td>
	</tr>
	<tr>
		<td>Bairro:</td>

		<td><input type="text" value="" name="bairro" size="30"></td>

	</tr>
	<tr>
		<td>Cidade:</td>
		<td><input type="text" value="" name="cidade" size="30"></td>
	</tr>
	<tr>
		<td>Situa��o do cliente:</td>
		<td><input type="radio"> Em dia<br>
		<input type="radio"> Bloqueado</td>
	</tr>
	<tr>
		<td></td>
		<td><input type="button" value="Incluir" onclick="submit()">
		<input type="button" value="Alterar" onclick="submit()"> <input
			type="button" value="Excluir" onclick="submit()"> <input
			type="button" value="Consultar" onclick="submit()"></td>



	</tr>
</table>
<br>
<a href="menu.jsp"> Voltar ao Menu</a></fieldset>



</form>


</body>
</html>