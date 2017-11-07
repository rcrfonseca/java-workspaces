<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aula 2011-02-22 - Upload Arquivo</title>
</head>
<body>

<form method="post" enctype="multipart/form-data"  action="Controle?action=imagem "name="form1">

<input type="file" name="arquivo">
<p/>
<input type="submit" value="Upload da Imagem">

</form>
<p/>
<hr/>
<p/>
<a href="cadastrodados.jsp"> Cadastrar dados </a>

</body>
</html>