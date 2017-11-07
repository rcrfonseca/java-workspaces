package control;

import entity.*;
import persistence.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Login lo = new Login(null, request.getParameter("login"), request
				.getParameter("senha"));

		try {
			LoginDao ld = new LoginDao();
			ld.create(lo);
			request.setAttribute("msg", "Dados gravados!");

		} catch (Exception e) {
			request.setAttribute("msg", e.getMessage());
		}
		request.getRequestDispatcher("fim.jsp").forward(request, response);

	}

}
