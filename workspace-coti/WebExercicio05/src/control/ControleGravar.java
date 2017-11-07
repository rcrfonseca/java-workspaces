package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.LoginDao;
import entity.Login;

public class ControleGravar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Login lo = new Login(request.getParameter("login"), request.getParameter("senha1"));
		
		LoginDao ld = new LoginDao();
		
		try {
			ld.create(lo);
			request.setAttribute("mensagem", "Login: " + lo.getLogin() + " gravado com sucesso!");
		} catch (Exception e) {
			request.setAttribute("mensagem", "Erro: " + e.getMessage() + " ao gravar o Login: " + lo.getLogin());
		}
		request.getRequestDispatcher("cadastrologin.jsp").forward(request, response);
	}
}