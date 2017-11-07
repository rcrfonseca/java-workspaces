package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.*;
import persistence.*;

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
		
		Login lo = new Login( 
				request.getParameter("login"), 
				request.getParameter("senha1")
				);
		/* Resgatei o login e a senha1. */
		
		try {
			
			LoginDao ld = new LoginDao();
			
			if(ld.isLogin(lo)){
				response.getWriter().print("Senha Válida ...: " + lo.getLogin());
			}else {
				response.getWriter().print("Senha Inválida ...: " + lo.getLogin());
			}
			
		} catch (Exception e) {
				response.getWriter().print(e.getMessage());		
		}
	}
}