<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Ajax 01 - Aula 2011-02-15 </title>
</head>
<body>
<h2> Bem vindo ao Dojo </h2>
<p/>
<hr/>
<p/>
<script type="text/javascript" src="js/dojo/dojo.js"></script>
<script type="text/javascript" src="js/dojo/utils.js"></script>
Nome: <br/>
<input type ="text" name="nome" size="30" onKeyUp="ajax('Controle?nome='+this.value,'marca')"/>

<%@ page import="persistence.*, entity.*"%>
<%@ taglib uri="WEB-INF/taglib.tld" prefix="pg"%>
<p/><hr/><p/>
<pg:paging pageSize="4">
<div id="marca">
	<%
		try{
			PessoaDao pd = new PessoaDao();
			out.print("<table border=1>");
			out.print("<tr> <td>idpessoa</td> <td>Nome</td> <td>Sexo</td> </tr>");
			
			for(Pessoa p: pd.findAll()){
				%><pg:item><%
				out.print("<tr>");
				out.print("<td>" + p.getIdpessoa() + "</td>");
				out.print("<td>" + p.getNome()+ "</td>");
				out.print("<td>" + p.getSexo()+ "</td>");
				out.print("</tr>");
				%></pg:item><%
			}
			out.print("</table>");
		}catch(Exception e){
		}
	%>
</div>
<p/>
<pg:index>
<pg:page><%=thisPage%></pg:page>
</pg:index>
</pg:paging>
</body>
</html>