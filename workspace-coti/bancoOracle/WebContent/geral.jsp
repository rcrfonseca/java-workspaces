<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="estilo.css" rel="stylesheet" type="text/css" />
<title>Aula 2011-02-23 - Projeto com Oracle</title>
</head>
<body>
<%@ page import="java.util.*"%>
<%@ page import="entity.*"%>

	<h2> Projeto com Oracle</h2>
	<% 
		if(request.getAttribute("lista") != null){
			
			double soma = 0;
			
			List<Vendedor> lista = (List<Vendedor>) request.getAttribute("lista");
			
			out.print("<table border><tr><td>IdVendedor</td>");
			out.print("<td>Nome</td><td>Mês</td><td>Ano</td><td>Preço</td>");
			
			for(Vendedor v : lista){
				out.print("<tr>");
				out.print("<td>" + v.getIdvendedor() + "</td>");
				out.print("<td>" + v.getVendedor() + "</td>");
				out.print("<td>" + v.getMes() + "</td>");
				out.print("<td>" + v.getAno() + "</td>");
				out.print("<td>" + v.getPreco() + "</td>");
				out.print("</tr>");
				soma = soma + v.getPreco(); //Acumulando o preço de cada venda.
			}
			out.print("<tr><td> Soma: </td><td colspan=4>" + soma + "</td></tr>");
			out.print("</table>");
		}
		else{
			out.print("<p>Acesso Negado!</p>");		
		}
	%>

</body>
</html>