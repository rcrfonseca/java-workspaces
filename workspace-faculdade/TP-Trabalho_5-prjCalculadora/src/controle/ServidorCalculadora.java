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
				entrada = new BufferedReader(new InputStreamReader(
						canalDeEntrada));
				saida = new PrintWriter(canalDeSaida, true); // até aqui é tudo
				// igual em
				// qualquer
				// programa.

				// A partir deste ponto começa a parte modificada.

				String linha = entrada.readLine();//Cria e inicia o ponteiro, pegando o conteudo digitado.
				double a = Double.parseDouble(linha); 
				//funcao parseDouble() para converter String em Double
				
				linha = entrada.readLine();
				double b = Double.parseDouble(linha);
				
				linha = entrada.readLine();
				double resultado = 0;//Variável que vai armazenar o resultado da operacao.
				
				char op = linha.charAt(0);//charAt(0) pois o operador só tem uma posicao.
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

				saida.println("O resultado é : " + resultado);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
