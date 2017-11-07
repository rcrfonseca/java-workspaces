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


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
          /* Resgatar as variáveis passadas por link. */
		
		String acao = request.getParameter("action");
		// action = delete ou altere.
		
		Integer cod = new Integer(request.getParameter("cod"));
		
		ProdutoDao pd = new ProdutoDao();
		
		if (acao.equalsIgnoreCase("delecao")){
			try {
				pd.delete(cod);
				request.setAttribute("msg", "Registro apagado com sucesso. ");
				
			} catch (Exception e) {
				request.setAttribute("msg", "Erro na deleção.");	
			}
			
			request.getRequestDispatcher("cadastroproduto.jsp").forward(request, response);
			
		}else if (acao.equalsIgnoreCase("alteracao")){
			try {
				
				Produto p = (Produto) pd.findById(cod);
				
				response.getWriter().print("<h2> Alteração dos Dados </h2> <p/> <hr/> <p/>");
				
				response.getWriter().print("<form method='Post' action='Controle2'>");
				
				response.getWriter().print("<p/>IdProduto:");
				response.getWriter().print("<br/><input type=text name=idproduto readonly value='"+p.getIdproduto()+"' size='35' />");
				/* readonly para somente mostrar o ID e não deixar ser alterado. */
				
				response.getWriter().print("<p/>Produto:");
				response.getWriter().print("<br/><input type=text name=produto value='"+p.getProduto()+"' size='35' />");
			
				response.getWriter().print("<p/>Preço:");
				response.getWriter().print("<br/><input type=text name=preco value='"+p.getPreco()+"' size='5' />");
				
				response.getWriter().print("<p/>Quantidade:");
				response.getWriter().print("<br/><input type=text name=quantidade value='"+p.getQuantidade()+"' size='5' />");
				
				response.getWriter().print("<p/><input type=submit value='Alterar Dados'>");
				
				response.getWriter().print("</form>");

			} catch (Exception e) {
				
			}
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Produto p = new Produto(
				null, 
				request.getParameter("produto"),
				new Integer(request.getParameter("quantidade")),
				new Double(request.getParameter("preco"))
				);

		ProdutoDao pd = new ProdutoDao();
		
		try {
			pd.open();
			pd.create(p);
			request.setAttribute("msg", "Gravação OK");

		} catch (Exception e) {
			request.setAttribute("msg", "Erro na gravação.");

		}
		request.getRequestDispatcher("cadastroproduto.jsp").forward(request, response);

	}
}