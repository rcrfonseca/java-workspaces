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
			/* O JRResultSetDataSource pega a conexão do BD e joga no relatório. */
			JRResultSetDataSource jrss = new JRResultSetDataSource(
					rd.getConsultaProduto(request.getParameter("produto")));

			// Carrega o relatório
			Map parametros = new HashMap(); // Para passar títulos. Parametros
											// aqui estão vazios.
			JasperDesign jp = JRXmlLoader.load("c:/report/relatorio1.jrxml"); // Chama
																				// o
																				// arquivo
																				// relatório.

			JasperReport jasper = JasperCompileManager.compileReport(jp); // Compilando
																			// o
																			// arquivo.

			// JasperPrint é pra montar o relatório, juntando todos os
			// parametros.
			JasperPrint jasperprint = JasperFillManager.fillReport(jasper,
					parametros, jrss);

			response.reset();// Atualiza Servlet.
			response.setHeader("Content-disposition","blank"); //Black abre numa página web, sem opção de salvar.
			response.setContentType("application/pdf");
			OutputStream out = response.getOutputStream(); // saída padrão pdf
			JasperExportManager.exportReportToPdfStream(jasperprint, out); // pdf
																			// vem
																			// no
																			// padrão
																			// iReport.
			out.flush(); // atualiza a página
			out.close(); // fecha o pdf.

		} catch (Exception e) {
			response.getWriter().print("<br> Erro: " + e.getMessage());
		}
	}

}