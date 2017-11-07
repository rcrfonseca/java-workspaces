package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.ProdutoDao;
import entity.Produto;

/**
 * Servlet implementation class Controle
 */

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Double valorTotal;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = new String (request.getParameter("grupo"));
		Double preco = new Double (request.getParameter("preco"));
		Integer quantidade = new Integer (request.getParameter("quantidade"));
		
		Double valorCompra = preco * quantidade;
		Double valorDesconto;

	
		Produto p = new Produto(null, nome, preco, quantidade);
		
		ProdutoDao pd = new ProdutoDao();
		
		try {
			pd.open();
			pd.create(p);
			
			if (nome == "Geladeira"){
				valorDesconto = valorCompra * 10. / 100.;
				valorTotal = (valorTotal * valorCompra) - valorDesconto;
			}				
			
			else if (nome == "Televisão"){
				preco = (preco * quantidade) * (double) (5./100.);
			}
			
			request.setAttribute("mensagem", "Produto: " + nome + "<br/>Valor com desconto: " + valorTotal);
			
		} catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());
		}
		
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
		
	}

}
