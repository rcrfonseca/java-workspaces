package entity;

import java.io.*; //API de entrada e saída para trabalhar com arquivos.

public class Arquivo implements IArquivo {

	private PrintWriter gravar;// trabalhar para criar o arquivo.

	@Override
	public void open() throws Exception {
		gravar = new PrintWriter(new FileWriter("d:/aula.txt"));
		// criar o arquivo aula.txt no c:, se existir ele reescreve o arquivo.

	}

	@Override
	public void close() throws Exception {
		gravar.flush();// atualizar o arquivo.
		gravar.close();// fechar o arquivo.

	}

	@Override
	public void gravaArquivoTxt(String texto) throws Exception {
		gravar.append(texto + "\n");
		// append significa adicionar o arquivo.

	}

	public static void main(String[] args) {
		Arquivo a = new Arquivo();
		try {
			a.open();
			a.gravaArquivoTxt("Teste de arquivo.");
			a.close();//fecha o arquivo.
			
			System.out.println("Dados Gravados!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		// open, gravaArquivoTxt e close, preciso do try, catch devido ao throws
		// Exception.

	}
}
