<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aula 2011-02-23 - Projeto com Oracle</title>
</head>
<body>

	<h2> Projeto com Oracle</h2>
	<form method="post" name="form1" action="Controle?action=geral">
		<input type="submit" value="Mostra os Dados do Vendedor"/>
	</form>
	<!-- Estou passando para o Servlet Controle a variável action com conteúdo geral. -->
	
	<h4>Nomes dos Vendedores:</h4>
	<%@ page import="java.util.*"%>
	<%@ page import="entity.*"%>
	<%@ page import="persistence.*"%>
	
	<form name="form2" method="post">
		<select name="nome">
			<%
				try{
					for(String nome : new VendedorDao().findNomes()){
						out.print("<option value=" + nome + ">" + nome);
						//O que está fora do value é para o usuário ver.
						//O que está dentro do value é para enviar.
					}
				}catch(Exception e){
				}			
			%>
		</select>
	</form>

</body>
</html>