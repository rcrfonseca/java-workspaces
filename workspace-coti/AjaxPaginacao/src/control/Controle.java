package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.PessoaDao;
import entity.Pessoa;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		try {
			PessoaDao pd = new PessoaDao();
			
			response.getWriter().print("<table border=1>");
			response.getWriter().print("<tr> <td>idpessoa</td> <td>Nome</td> <td>Sexo</td> </tr>");
			
			for(Pessoa p: pd.findByAll(nome)){
				response.getWriter().print("<tr>");
				response.getWriter().print("<td>" + p.getIdpessoa() + "</td>");
				response.getWriter().print("<td>" + p.getNome()+ "</td>");
				response.getWriter().print("<td>" + p.getSexo()+ "</td>");
				response.getWriter().print("</tr>");
			}
				
		} catch (Exception e) {
		}
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

}
