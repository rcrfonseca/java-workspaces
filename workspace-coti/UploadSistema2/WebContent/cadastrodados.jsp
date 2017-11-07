<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aula 2011-02-22 - Upload Arquivo</title>
</head>
<body>

<form method="post" action="Controle2">

Código<br/>
<input type="text" name="codigo" value="" size="5"/>

Nome<br/>
<input type="text" name="nome" value="" size="35"/>
<br/>
<br/>
Sexo<br/>
<select name="sexo">
<option value="m"> Masculino
<option value="f"> Feminino
</select>

<br/>Nome da Foto<br/>
<input type="text" name="foto" value="" size="35"/>
<p/>
<input type="submit" value="Gravar os Dados em Banco"/>
<p/>

</form>

<a href="cadastro.jsp"> Voltar para o cadastro de Foto </a>

</body>
</html>