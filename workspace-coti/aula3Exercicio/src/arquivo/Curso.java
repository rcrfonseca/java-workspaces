package arquivo;

import java.io.*;

public class Curso {

	private PrintWriter gravar;

	public void criarArquivo() throws Exception {
		gravar = new PrintWriter(new FileWriter("d:/Curso.txt"));
	}

	public void gravarDados(String texto) throws Exception {
		gravar.append(texto);
	}

	public void fecharArquivo() {
		gravar.flush();
		gravar.close();
	}

	public static void main(String[] args) {
		Curso c = new Curso();

		try {
			c.criarArquivo();
			c.gravarDados("Coti Informática");
			c.fecharArquivo();
			throw new Exception("Dados gravados!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
