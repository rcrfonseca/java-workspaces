package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.ProdutoDao;

import entity.Produto;

/**
 * Servlet implementation class Controle2
 */

public class Controle2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Produto p = new Produto(
				new Integer(request.getParameter("idproduto")),
				request.getParameter("produto"), 
				new Integer(request.getParameter("quantidade")), 
				new Double(request.getParameter("preco"))
				);

		try {

			ProdutoDao pd = new ProdutoDao();

			pd.update(p);
			/* Grava os dados de produto pela chave primária. */
			request.setAttribute("msg", "Dados Alterados.");

		} catch (Exception e) {

			request.setAttribute("msg", e.getMessage());

		}
		request.getRequestDispatcher("cadastroproduto.jsp").forward(request, response);
	}
}