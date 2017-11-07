package controle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorVogais {

	/**
	 * ServerSocket utilizado pelo Servidor
	 */
	private ServerSocket sckServidor;

	public ServidorVogais() throws IOException {
		// Criando o ServerSocket
		this.sckServidor = new ServerSocket(3999);
		// Verificando e atendendo as requsi��es. Cada requisi��o ser� tratada
		// por
		// Uma thread espec�fica atrav�s da estrat�gia colocada na classe
		// AtenderRequisicao.
		for (;;) {
			Socket novaRequisicao = this.sckServidor.accept();
			new AtenderRequisicao(novaRequisicao);
		}
	}

	/**
	 * Classe interna para tratar uma determinada requisi��o
	 */
	public class AtenderRequisicao extends Thread {
		/**
		 * Socket que est� ser� o canal de comunica��o com o cliente que enviou
		 * a requisi��o
		 */
		private Socket requisicao;

		/**
		 * Construtor
		 * 
		 * @param requisicao
		 */
		public AtenderRequisicao(Socket requisicao) {
			this.requisicao = requisicao;
			this.start();
		}

		/**
		 * M�todo que executado na nova Thread.
		 */
		public void run() {
			InputStream canalDeEntrada;
			OutputStream canalDeSaida;
			BufferedReader entrada;
			PrintWriter saida;

			try {
				// Recuperando os canais de comunica��o do socket
				canalDeEntrada = requisicao.getInputStream();
				canalDeSaida = requisicao.getOutputStream();

				// Para facilitar o processo de leitura e escrita dos canais de
				// entrada e sa�da
				// Criamos os objetos BufferedReader (para leitura) e
				// PrintWriter (para sa�da)
				entrada = new BufferedReader(new InputStreamReader(canalDeEntrada));
				saida = new PrintWriter(canalDeSaida, true);

				/* at� aqui � tudo igual em qualquer programa. */

				// A partir deste ponto come�a a parte modificada.

				String linhaEnviada = entrada.readLine();

				int numVogais = 0;
				for (int i = 0; i < linhaEnviada.length(); i++) {
					char c = linhaEnviada.charAt(i); 
					//Funcao charAt() serve para capturar o caracter na posicao desejada.
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u')
						numVogais++;
				}

				saida.println("O numero de vogais �:" + numVogais);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
