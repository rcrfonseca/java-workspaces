package control;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRQuery;
import net.sf.jasperreports.engine.JRQueryChunk;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.query.JRQueryExecuter;
import net.sf.jasperreports.engine.query.JRQueryExecuterFactory;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import persistence.RelatorioDao;
import entity.Login;

public class ControleRelatorio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Login lo = new Login();
		RelatorioDao rd = new RelatorioDao();
		
		try {
			JRResultSetDataSource jrds = new JRResultSetDataSource(rd.getConsultaLogin(lo));
			Map parametros = new HashMap();
			JasperDesign jd = JRXmlLoader.load("c:/report/relatorioLogin.jrxml");
			JasperReport jasper = JasperCompileManager.compileReport(jd);
			JasperPrint jasperprint = JasperFillManager.fillReport(jasper, parametros, jrds);
			response.reset();
			response.setHeader("Content-disposition", "attachment; filename=relatoriologin.pdf");
			response.setContentType("application/pdf");
			OutputStream out = response.getOutputStream();
			JasperExportManager.exportReportToPdfStream(jasperprint, out);
			out.flush();
			out.close();
			request.setAttribute("mensagem", "Relatório gerado com sucesso!");
		} catch (Exception e) {
			request.setAttribute("mensagem", "Erro ao gerar o relatório.");
			e.printStackTrace();
		}
		request.getRequestDispatcher("relatorio.jsp").forward(request, response);
		
	}

}