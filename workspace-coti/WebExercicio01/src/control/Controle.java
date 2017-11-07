package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.AlunoDao;
import entity.Aluno;

/**
 * Servlet implementation class Controle
 */
public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			/* Primeiro pegamos os valores passados por parametro na página do formulário, 
			 * convertemos para um valor do tipo numérico, aqui usamos Double.*/
			Double nota1 = new Double (request.getParameter("nota1"));
			Double nota2 = new Double (request.getParameter("nota2"));
			Double media = (nota1 + nota2) / 2.;
			
			Aluno a = new Aluno(null, nota1, nota2);

			AlunoDao ad = new AlunoDao();
			ad.open();
			ad.create(a);
			ad.close();

			request.setAttribute("mensagem", "<b>Média: </b>" + media);

		} catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());
		}
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);

	}
}
