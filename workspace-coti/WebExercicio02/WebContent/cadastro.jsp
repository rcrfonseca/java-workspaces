<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exercício 02 Web - Cadastro</title>
</head>
<body>

<h2> <b> Digite a descrição dos produtos: </b> </h2>
<hr/>

<form name="f" method="Post" action="Controle">
<p/><input type="radio" name="grupo" value="Geladeira"> <b> Geladeira </b>
<p/><input type="radio" name="grupo" value="Televisão"> <b> Televisão </b>


<p/>
<b> Preço: </b>
<p/><input type="text" name="preco" value="">

<p/>
<b> Quantidade: </b>
<p/><input type="text" name="quantidade" value="">

<p/>
<input type="submit" value="Enviar">
<input type="reset" value="Limpar">

</form>
</body>
</html>