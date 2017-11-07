package control;

import java.io.IOException;
import entity.*;
import persistence.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controle2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Login lo = new Login(
				null, 
				request.getParameter("login"), 
				request.getParameter("senha")
				);
		
		try {
			
			LoginDao ld = new LoginDao();
			response.getWriter().print(
					"Acesso: " + ld.isLogin(lo) + " Usuário: " + lo.getUsuario());
			
		} catch (Exception e) {
			
		}

	}

}
