package controle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ProgramaCliente {
	public static void main(String[] args) {
		Socket sckCliente;
		InputStream canalDeEntrada;
		OutputStream canalDeSaida;
		PrintWriter saida;
		BufferedReader entrada;
		try {
			// Instancio um Socket ao localhost porta 3999
			sckCliente = new Socket("127.0.0.1", 3999);
			// Recuperando os canais de comunicação do socket
			canalDeEntrada = sckCliente.getInputStream();
			canalDeSaida = sckCliente.getOutputStream();
			// Para facilitar o processo de leitura e escrita dos canais
			// de entrada e saída criamos os objetos BufferedReader
			// (para leitura) e PrintWriter (para saída)
			entrada = new BufferedReader(new InputStreamReader(canalDeEntrada));
			saida = new PrintWriter(canalDeSaida, true); // Até aqui é padrão.

			// A partir daqui é específico de cada programa.

			Scanner teclado = new Scanner(System.in);
			System.out.println("Entre com a linha : ");
			String linha = teclado.nextLine();
			saida.println(linha);

			String resposta = entrada.readLine();
			System.out.println(resposta);
			sckCliente.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
