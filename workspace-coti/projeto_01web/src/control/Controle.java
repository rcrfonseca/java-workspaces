package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistence.*;
import entity.*;

public class Controle extends HttpServlet {

	/*
	 * doGet() e doPost() servem para executar os m�todos de passagem de
	 * par�metros definidos no formul�rio.
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			Pessoa p = new Pessoa(null, request.getParameter("nome"), request
					.getParameter("email"));// O request.getParameter est�
			// resgatando os dados que
			// foram declarados l� na index.jsp

			PessoaDao d = new PessoaDao();
			d.open();
			d.create(p);
			d.close();
			request.setAttribute("mensagem", "Pessoa cadastrada com sucesso.");
			// mandou gravar

		} catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());

		}
		request.getRequestDispatcher("resultado.jsp")
				.forward(request, response);// depois de pegar os dados, gravar,
		// dar a mensagem de dados gravados ou de erro, ele chama a
		// p�gina resultado.
	}

}
