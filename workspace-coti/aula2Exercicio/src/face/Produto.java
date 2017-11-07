package face;

import java.io.*;

public class Produto implements IProduto {

	public static final String NOME = "Açúcar"; // Atributo o qual seu valor não
												// poderá ser alterado.
	private PrintWriter gravar;

	@Override
	public void abrirArquivo() throws Exception {
		gravar = new PrintWriter(new FileWriter("d:/teste.txt"));
	}

	@Override
	public void gravarArquivo(String texto) throws Exception {
		gravar.append(texto);

	}

	@Override
	public void fecharArquivo() throws Exception {
		gravar.flush();
		gravar.close();

	}

	public static void main(String[] args) {

		Produto p = new Produto();

		try {
			p.abrirArquivo();
			p.gravarArquivo(NOME);
			p.fecharArquivo();

			System.out.println("Dados gravados no arquivo!");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
