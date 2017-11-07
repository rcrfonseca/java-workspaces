package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.NumeroDao;
import entity.Numero;

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
		
		Double valor = new Double(request.getParameter("numero"));
		
		Numero n = new Numero(null, valor);
		
		NumeroDao nd = new NumeroDao();
		
		try {
			Double i = valor % 2.;
			String resultado = "";

			nd.open();
			nd.create(n);
			
			if(i == 0)
				resultado = "O número é PAR.";
				else
				resultado = "O número é ÍMPAR.";
			
			request.setAttribute("mensagem", resultado);
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);

	}

}
