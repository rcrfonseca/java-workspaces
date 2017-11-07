package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.*;

/**
 * Servlet implementation class Controle
 */
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controle() {

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/* Via Link */
		/* Gravando temporariamente */
		request.setAttribute("msg", "<b> Digite os dados pelo formulário.");
		request.getRequestDispatcher("cadastro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		/* Via Formulário */
		Pessoa p = new Pessoa(null, request.getParameter("firstname"), request
				.getParameter("lastname"), request.getParameter("email"));

		// response.getWriter().print("<br><b> " + p);
		/*
		 * Resgatei e imprimi. Imprimindo p, não é certo, apenas teste.
		 * Proibir a navegação do site na mão.
		 */

		/* Gravação temporária. Pessoa armazena p, passo 2. */
		request.setAttribute("pessoa", p);

		// redirecionar.
		request.getRequestDispatcher("fim.jsp").forward(request, response);

		/*
		 * view index,jsp, cadastro.jsp (envia para Controle). Pessoa
		 * Model(Modelo) é uma classe que representa os dados de entrada.
		 * PessoaVO no passado era o nome de Pessoa. PessoaVO significa
		 * trasferencia de dados. control.Controle(servlet). no Servlet eu
		 * preencho o Modelo(Pessoa). redirecionei do controle para a View,
		 * fim.jsp.
		 */

	}
}
