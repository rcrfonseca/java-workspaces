package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entity.*;
import persistence.*;
public class ControleUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			
			Usuario u = new Usuario(request.getParameter("nome"), request.getParameter("login"),
					request.getParameter("senha"));
			
			UsuarioDao ud = new UsuarioDao();
			
			ud.open();
			ud.create(u);
			ud.close();
			
			request.setAttribute("mensagem", "Usuário cadastrado com sucesso.");
		}
		catch(Exception e){
			e.printStackTrace();
			request.setAttribute("mensagem", "Ocorreu um erro ao cadastrar o Usuário.");
		}
		request.getRequestDispatcher("cadastrousuario.jsp").forward(request, response);
	}
}
