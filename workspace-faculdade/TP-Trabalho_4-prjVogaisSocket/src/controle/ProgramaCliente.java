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
			// Recuperando os canais de comunica��o do socket
			canalDeEntrada = sckCliente.getInputStream();
			canalDeSaida = sckCliente.getOutputStream();
			// Para facilitar o processo de leitura e escrita dos canais
			// de entrada e sa�da criamos os objetos BufferedReader
			// (para leitura) e PrintWriter (para sa�da)
			entrada = new BufferedReader(new InputStreamReader(canalDeEntrada));
			saida = new PrintWriter(canalDeSaida, true); // At� aqui � padr�o.

			// A partir daqui � espec�fico de cada programa.

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
