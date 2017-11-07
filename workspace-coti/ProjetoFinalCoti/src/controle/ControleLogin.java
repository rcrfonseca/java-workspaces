package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.UsuarioDao;
import entity.Usuario;

public class ControleLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ControleLogin() {
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Usuario u = new Usuario(request.getParameter("nome"),
				request.getParameter("login"), request.getParameter("senha"));

		try {
			UsuarioDao ud = new UsuarioDao();
			if (ud.isLogin(u)) {
				request.setAttribute("mensagem", "Usuário: " + u.getLogin());
				request.getRequestDispatcher("home.jsp").forward(request,response);

			} else {
				request.setAttribute("mensagem", "Dados incorretos");
				request.getRequestDispatcher("login.jsp").forward(request,response);
			}

		} catch (Exception e) {
			response.getWriter().print(e.getMessage());
		}

	}

}