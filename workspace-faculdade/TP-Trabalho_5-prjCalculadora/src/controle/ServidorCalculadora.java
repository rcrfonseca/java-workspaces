package controle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorCalculadora {

	/**
	 * ServerSocket utilizado pelo Servidor
	 */
	private ServerSocket sckServidor;

	public ServidorCalculadora() throws IOException {
		// Criando o ServerSocket
		this.sckServidor = new ServerSocket(4000);
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
				entrada = new BufferedReader(new InputStreamReader(
						canalDeEntrada));
				saida = new PrintWriter(canalDeSaida, true); // at� aqui � tudo
				// igual em
				// qualquer
				// programa.

				// A partir deste ponto come�a a parte modificada.

				String linha = entrada.readLine();//Cria e inicia o ponteiro, pegando o conteudo digitado.
				double a = Double.parseDouble(linha); 
				//funcao parseDouble() para converter String em Double
				
				linha = entrada.readLine();
				double b = Double.parseDouble(linha);
				
				linha = entrada.readLine();
				double resultado = 0;//Vari�vel que vai armazenar o resultado da operacao.
				
				char op = linha.charAt(0);//charAt(0) pois o operador s� tem uma posicao.
				switch (op) {
				case '+':
					resultado = a + b;
					break;

				case '-':
					resultado = a - b;
					break;

				case '/':
					resultado = a / b;
					break;

				case '*':
					resultado = a * b;
					break;

				}

				saida.println("O resultado � : " + resultado);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
