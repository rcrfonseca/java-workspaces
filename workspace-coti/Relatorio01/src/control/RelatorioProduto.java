package control;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import persistence.RelatorioDao;

/**
 * Servlet implementation class RelatorioProduto
 */
public class RelatorioProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RelatorioDao rd = new RelatorioDao();

		try {
			/* O JRResultSetDataSource pega a conex�o do BD e joga no relat�rio. */
			JRResultSetDataSource jrss = new JRResultSetDataSource(
					rd.getConsultaProduto(request.getParameter("produto")));

			// Carrega o relat�rio
			Map parametros = new HashMap(); // Para passar t�tulos. Parametros
											// aqui est�o vazios.
			JasperDesign jp = JRXmlLoader.load("c:/report/relatorio1.jrxml"); // Chama
																				// o
																				// arquivo
																				// relat�rio.

			JasperReport jasper = JasperCompileManager.compileReport(jp); // Compilando
																			// o
																			// arquivo.

			// JasperPrint � pra montar o relat�rio, juntando todos os
			// parametros.
			JasperPrint jasperprint = JasperFillManager.fillReport(jasper,
					parametros, jrss);

			response.reset();// Atualiza Servlet.
			response.setHeader("Content-disposition","blank"); //Black abre numa p�gina web, sem op��o de salvar.
			response.setContentType("application/pdf");
			OutputStream out = response.getOutputStream(); // sa�da padr�o pdf
			JasperExportManager.exportReportToPdfStream(jasperprint, out); // pdf
																			// vem
																			// no
																			// padr�o
																			// iReport.
			out.flush(); // atualiza a p�gina
			out.close(); // fecha o pdf.

		} catch (Exception e) {
			response.getWriter().print("<br> Erro: " + e.getMessage());
		}
	}

}