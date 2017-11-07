package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.*;
import entity.*;

public class ControleCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Login lo = new Login(request.getParameter("login"),
				request.getParameter("senha1"));

		LoginDao ld = new LoginDao();

		try {
			ld.open();
			ld.create(lo);
			request.setAttribute("mensagem", "Usuário: " + lo.getLogin() + " gravado com sucesso!");
		} catch (Exception e) {
			request.setAttribute("mensagem", "Erro, O Usuário: " + lo.getLogin() + " não pode ser gravado.");
		}
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}
}