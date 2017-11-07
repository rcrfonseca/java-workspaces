package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoSaida {

	public static void salvar(String arquivo, String conteudo, boolean adicionar)
			throws IOException {

		FileWriter fw = new FileWriter(arquivo, adicionar);
		BufferedWriter bw = new BufferedWriter(fw); 
		// BufferedWriter torna o processo de escrita no arquivo mais eficiente.
		
		bw.write(conteudo);
		bw.newLine();
		bw.close();
	}

	public static String carregar(String arquivo) throws FileNotFoundException,
			IOException {

		File file = new File(arquivo);

		if (!file.exists()) {
			return null;
		}

		BufferedReader br = new BufferedReader(new FileReader(arquivo));
		StringBuffer bufSaida = new StringBuffer();

		String linha;
		while ((linha = br.readLine()) != null) {
			bufSaida.append(linha + "\r\n"); 
			/* Separador de linha em unix/linux: LF (Line Feed) = '\n' - hexa 0A
			 * Separador de linha em dos/windows: CR+LF (Carriage Return / Line Feed) = '\r\n' - hexa 0D0A
			 * Opcionalmente, arquivos texto tem CTRL-Z no final de arquivo (End Of File). 
			 */
		}
		br.close();
		return bufSaida.toString();
	}
}
