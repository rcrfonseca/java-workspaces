package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.PessoaDao;
import entity.Pessoa;

public class Controle3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controle3() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PessoaDao pd = new PessoaDao();
			response.getWriter().print("<table border=1>");
			response.getWriter().print("<tr><td>Idpessoa</td>");
			response.getWriter().print("<td>Nome</td>");
			response.getWriter().print("<td>Sexo</td>");
			response.getWriter().print("<td>Foto</td></tr>");
			for(Pessoa p : pd.findAll()){
				response.getWriter().print("<tr>");
				response.getWriter().print("<td>" + p.getIdpessoa() + "</td>");
				response.getWriter().print("<td>" + p.getNome() + "</td>");
				response.getWriter().print("<td>" + p.getSexo() + "</td>");
				response.getWriter().print("<td> <img src='c:/fotos/" + p.getFoto() + "' width=150 height=150></td>");
				response.getWriter().print("</tr>");
			}
			response.getWriter().print("</table>");
		} catch (Exception e) {
		}
	}

}
