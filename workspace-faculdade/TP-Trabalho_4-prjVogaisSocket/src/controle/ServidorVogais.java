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
		// Verificando e atendendo as requsições. Cada requisição será tratada
		// por
		// Uma thread específica através da estratégia colocada na classe
		// AtenderRequisicao.
		for (;;) {
			Socket novaRequisicao = this.sckServidor.accept();
			new AtenderRequisicao(novaRequisicao);
		}
	}

	/**
	 * Classe interna para tratar uma determinada requisição
	 */
	public class AtenderRequisicao extends Thread {
		/**
		 * Socket que está será o canal de comunicação com o cliente que enviou
		 * a requisição
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
		 * Método que executado na nova Thread.
		 */
		public void run() {
			InputStream canalDeEntrada;
			OutputStream canalDeSaida;
			BufferedReader entrada;
			PrintWriter saida;

			try {
				// Recuperando os canais de comunicação do socket
				canalDeEntrada = requisicao.getInputStream();
				canalDeSaida = requisicao.getOutputStream();

				// Para facilitar o processo de leitura e escrita dos canais de
				// entrada e saída
				// Criamos os objetos BufferedReader (para leitura) e
				// PrintWriter (para saída)
				entrada = new BufferedReader(new InputStreamReader(canalDeEntrada));
				saida = new PrintWriter(canalDeSaida, true);

				/* até aqui é tudo igual em qualquer programa. */

				// A partir deste ponto começa a parte modificada.

				String linhaEnviada = entrada.readLine();

				int numVogais = 0;
				for (int i = 0; i < linhaEnviada.length(); i++) {
					char c = linhaEnviada.charAt(i); 
					//Funcao charAt() serve para capturar o caracter na posicao desejada.
					if (c == 'a' || c == 'e' || c == 'i' || c == 'o'|| c == 'u')
						numVogais++;
				}

				saida.println("O numero de vogais é:" + numVogais);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
