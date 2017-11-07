package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.PessoaDao;
import entity.Pessoa;

public class Controle2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controle2() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Pessoa p = new Pessoa(new Integer(request.getParameter("codigo")),
				request.getParameter("nome"), request.getParameter("sexo"),
				request.getParameter("foto"));
		
		PessoaDao pd = new PessoaDao();
		
		try {
			pd.create(p);
			response.getWriter().print("<br><b>Dados Gravados!");
			response.getWriter().print("<a href=index.jsp> Voltar </a>");
		} catch (Exception e) {
			response.getWriter().print(e.getMessage());
		}
	}
}