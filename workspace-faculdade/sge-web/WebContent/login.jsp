<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script type="text/javascript">
	function valida() {
		nome = document.f.login.value;
		senha = document.f.senha.value;

		if (nome == "") {
			document.getElementById("msgLogin").innerHTML = "<font color='red'>obrigatorio</font><br>";
		} else {
			document.getElementById("msgLogin").innerHTML = "";
		}

		if (senha == "") {
			document.getElementById("msgSenha").innerHTML = "<font color='red'>obrigatorio</font><br>";
		} else {
			document.getElementById("msgSenha").innerHTML = "";
		}
	}
</script>


<style type="text/css">
body {
	font-family: verdana;
	font-size: 9pt;
	padding: 30pt;
}

fieldset {
	padding: 20px;
	background-color: #eaeaea;
	width: 500px;
	border: 1px solid #0000aa;
}

legend {
	background: #fff;
	font-weight: bold;
	color: #0000aa;
}
</style>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>P�gina de login</title>
</head>

<body>
<center>

<form action="menu.jsp" method="post" name="f">
<fieldset><legend>Tela
de login</legend> Login: <input type="text" name="login"> <span
	id="msgLogin"></span> Senha: <input type="password" name="senha"> <span
	id="msgSenha"></span> <br><br>
<input type="button" value="Entrar" onclick=submit();><input
	type="reset" value="Apagar"></fieldset>

</form>


</center>
</body>
</html>








