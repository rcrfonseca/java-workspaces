package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.LoginDao;
import entity.Login;

public class ControleLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Login lo = new Login(request.getParameter("login"), request.getParameter("senha1"));
		
		LoginDao ld = new LoginDao();
		
		try {
			if (ld.isLogin(lo)){
				request.setAttribute("mensagem", "Login: " + lo.getLogin() + " foi encontrado com sucesso!");
			}else{
				request.setAttribute("mensagem", "O Login: " + lo.getLogin() + " não foi encontrado.");
			}
		} catch (Exception e) {
			request.setAttribute("mensagem", "A operação não pode ser realizada.");
		}
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
}