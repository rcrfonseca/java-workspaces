package control;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import entity.Pessoa;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controle() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		DiskFileItemFactory file1 = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(file1); //Para buscar o arquivo.
		
		String path = "c/fotos"; //onde será armazenado.
		Pessoa p = new Pessoa();
		String nomearquivo = null;
		
		try {
			sfu.setFileSizeMax(2 * 1024 * 1024); //o tamanho max da foto é de 2MB.
			List list = sfu.parseRequest(request); //Resgata tudo enviado.
			
			for(Iterator it = list.iterator(); it.hasNext();){
				FileItem item = (FileItem) it.next();
				if(!item.isFormField()){
					nomearquivo = item.getName();
					nomearquivo = (new File(nomearquivo)).getName();
					item.write(new File(path + "/" + nomearquivo));
					//Armazena o arquivo selecionado no diretório escolhido.
					
				}else{
					response.getWriter().print("Erro na gravação!");
				}
			}
		} catch (Exception e) {
		}
	}
}