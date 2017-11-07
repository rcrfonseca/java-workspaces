package controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.VendedorDao;
import entity.Vendedor;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controle() {
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String resp = request.getParameter("action");
		try {
			//se a consulta for geral.
			if(resp.equalsIgnoreCase("geral")){
				//resgato do banco.
				List <Vendedor> lista = new VendedorDao().findAll();
				//armazeno na lista.
				request.setAttribute("lista", lista);
				//gravo na lista.
				request.getRequestDispatcher("geral.jsp").forward(request, response);
				//enviando para o arquivo.
			}
		} catch (Exception e) {
		}
	}

}
