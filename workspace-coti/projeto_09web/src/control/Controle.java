package control;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.*;
import facade.*;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Pessoa p = new Pessoa (null,
				request.getParameter("nome"),
				request.getParameter("sexo"));
		
		response.getWriter().print("<br/><b> Nome: " + p.getNome());
		response.getWriter().print("<br/><b> Sexo: " + p.getSexo());
		
		try {
			//import javax.naming.*;
			Context ctx = new InitialContext();
			
			//chamando a interface
			//lookup chama a classe
			//quando a interface foi feita, colocamos a anotação @Remote
			//dentro de lookup, em PessoaFacade/repetimos a anotação que foi usada, se fosse local na interface, aqui também seria.
			PessoaFacadeRemote ejb = (PessoaFacadeRemote) ctx.lookup("PessoaFacade/remote");
			
			ejb.create(p);
			response.getWriter().print("<br/><b> Dados gravados!");
			
		} catch (Exception e) {
		}
		
		response.getWriter().print("<br/> <a href='index.jsp'> Voltar </a>");
	}

}
