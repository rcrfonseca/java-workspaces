package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.ComputadorDao;
import entity.Computador;

public class ControleComputador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			Computador c = new Computador(
					request.getParameter("nome"),
					request.getParameter("cpu"), 
					new Integer(request.getParameter("ram")),
					request.getParameter("video"),
					request.getParameter("drivemidia"),
					request.getParameter("hd"),
					request.getParameter("placamae"),
					request.getParameter("monitor"), 
					request.getParameter("so"));

			ComputadorDao compd = new ComputadorDao();

			compd.open();
			compd.create(c);
			compd.close();
			request.setAttribute("mensagem","Computador cadastrado com sucesso.");
			
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("mensagem", "Ocorreu um erro ao cadastrar o Computador.");
		}
		request.getRequestDispatcher("cadastrocomputador.jsp").forward(request,response);
	}
}