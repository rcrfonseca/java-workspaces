<%@ page import="entity.*"%>
<%
	//scriptlet

	if (!request.getMethod().equalsIgnoreCase("post")) {
		request.setAttribute("msg", "<b> Digite os dados pelo formul�rio.");
		request.getRequestDispatcher("cadastro.jsp").forward(request,
				response);
	} else {
		Pessoa p = (Pessoa) request.getAttribute("pessoa");

		out.print("<br> Sa�da dos dados: <br> ");
		out.print("<br><b> Idpessoa: " + p.getIdpessoa());
		out.print("<br><b> Nome: " + p.getFirstname());
		out.print("<br><b> Sobrenome: " + p.getLastname());
		out.print("<br><b> Email: " + p.getEmail());
	}
%>

<p /><a href="index.jsp"> Voltar </a>