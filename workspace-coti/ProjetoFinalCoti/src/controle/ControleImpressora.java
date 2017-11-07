package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.ImpressoraDao;
import entity.Impressora;

public class ControleImpressora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String acao = request.getParameter("action");
		
		String nome = request.getParameter("nome");
		
		ImpressoraDao id = new ImpressoraDao();
		
		if (acao.equalsIgnoreCase("delecao")){
			try {
				id.delete(nome);
				request.setAttribute("mensagem", "Registro apagado com sucesso. ");
				
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("mensagem", "Erro na deleção.");	
			}
			
			request.getRequestDispatcher("cadastroimpressora.jsp").forward(request, response);
			
		} else if (acao.equalsIgnoreCase("alteracao")){
			try {				
				Impressora i = (Impressora) id.findByNome(nome);
				request.getRequestDispatcher("alterarimpressora.jsp").forward(request, response);
				
				/* response.getWriter().print("<h2> Alteração dos Dados </h2> <p/> <hr/> <p/>");
				
				response.getWriter().print("<form method='Post' action='Controle2'>");
				
				response.getWriter().print("<p/>IdProduto:");
				response.getWriter().print("<br/><input type=text name=idproduto readonly value='"+p.getIdproduto()+"' size='35' />");
				
				response.getWriter().print("<p/>Produto:");
				response.getWriter().print("<br/><input type=text name=produto value='"+p.getProduto()+"' size='35' />");
			
				response.getWriter().print("<p/>Preço:");
				response.getWriter().print("<br/><input type=text name=preco value='"+p.getPreco()+"' size='5' />");
				
				response.getWriter().print("<p/>Quantidade:");
				response.getWriter().print("<br/><input type=text name=quantidade value='"+p.getQuantidade()+"' size='5' />");
				
				response.getWriter().print("<p/><input type=submit value='Alterar Dados'>");
				
				response.getWriter().print("</form>"); */

			} catch (Exception e) {
				
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try{
			
			Impressora i = new Impressora(request.getParameter("nome"), request.getParameter("marca"),
					request.getParameter("modelo"),request.getParameter("conexaoImpressora"));
			
			ImpressoraDao id = new ImpressoraDao();
			
			id.open();
			id.create(i);
			id.close();
			
			request.setAttribute("mensagem", "Impressora cadastrada com sucesso.");
		}
		catch(Exception e){
			e.printStackTrace();
			request.setAttribute("mensagem", "Ocorreu um erro ao cadastrar a Impressora.");
		}
		request.getRequestDispatcher("cadastroimpressora.jsp").forward(request, response);
	}
}