<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Projeto 10 - iReport 2011-02-08 </title>
</head>
<body>
<p>
<h4> Relatório completo </h4>
<br/>
<form method="post" action="Relatorio" name="form1">
<input type="submit" value="Enviar os Dados" />

</form>

<h2> Relatório Criado no iReport</h2>
<p>
<h4> Relatório por produto </h4>
<br/>
<form method="post" action="RelatorioProduto" name="form2">
<input name="produto" type="text" value="" />
<input type="submit" value="Enviar os Dados" />
</form>

</body>
</html>