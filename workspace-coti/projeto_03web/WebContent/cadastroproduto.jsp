<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Projeto 03 Web - Aula 2011-01-24</title>
</head>
<body>

<h2><b> Cadastro de Produto: </b></h2>
<hr />

<!--  Envio dos dados. -->
<form method="Post" action="Controle" name="form1">

<p />Produto: <br />
<input type="text" name="produto" value="" size="35" />

<p />Quantidade: <br />
<input type="text" name="quantidade" value="" size="5" />

<p />Preço: <br />
<input type="text" name="preco" value="" size="5" />

<p /><input type="submit" value="Enviar Dados" />

</form>


<!-- Saída dos dados.  -->
<p />
${msg}

<!--  %@ significa importação. -->
<%@ page import="entity.*,persistence.*" %>

<!-- Data GRID -->
<table border="1">
	<tr>
		<td>Idproduto</td>
		<td>Produto</td>
		<td>Quantidade</td>
		<td>Preco</td>
		<td>Deleção</td>
		<td>Alteração</td>
	</tr> 
	<% // Na parte de cima, imprimi-se o cabeçalho.
		try {
			ProdutoDao pd = new ProdutoDao();

			for (entity.Produto p : pd.findByAll()) {
				/* As linhas serão do BD, busca do findByAll(). */
				out.print("<tr>");
				out.print("<td>" + p.getIdproduto() + "</td>");
				out.print("<td>" + p.getProduto() + "</td>");
				out.print("<td>" + p.getQuantidade() + "</td>");
				out.print("<td>" + p.getPreco() + "</td>");
				out.print("<td><a href=Controle?action=delecao&cod="+p.getIdproduto()+"> Deleção </a></td>");
				/* action = variavel, delecao = valor da variavel. 
				& = colocar outra variavel ao lado, 
				cod= outra variavel, */
				out.print("<td><a href=Controle?action=alteracao&cod="+p.getIdproduto()+"> Alteração </a></td>");
				out.print("</tr>");
			} // Imprime o conteúdo..., repetindo e vindo do banco dentro do for.
			
		} catch (Exception e) {
			out.print(e.getMessage());
		}
	%>
</table>
</body>
</html>