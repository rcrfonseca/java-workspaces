package controle;

public class Programa {

	public static void main(String[] args) {

		try {
			int[] par = new int[50]; //Cria o vetor para armazenar os numeros pares.
			int i, j = 0;

			for (i = 1; i < 101; i++) //Loop para contar os numeros pares de 1 a 100.
			{

				if (i % 2 == 0) //Checa se o resto da divis�o � = 0, incrementando o numero de pares.
				{
					par[j] = i;
					j++;
				}
			}

			for (i = 0; i < 50; i++) //Loop para mostrar o resultado.
			{

				String texto = String.valueOf(par[i]);
				/* ponteiro texto criado para mostrar o resultado
				Funcao valueOf() usada para converter o tipo int do vetor par[] 
				para String para ser mostrado na tela.				
				*/
				
				ArquivoSaida.salvar("saida.txt", texto, true);
				/* Aqui � onde se escolhe como e onde salvar o arquivo.
				 * 
				 * Primeiro parametro do m�todo salvar � o caminho onde salva o arquivo.
				 * Se nao for dito o caminho como exemplo: c:/saida.txt, 
				 * o arquivo � salvo na pasta do projeto criado.
				 * 
				 * Segundo argumento � o que ser� escrito no arquivo, 
				 * neste caso o conte�do para onde o ponteiro texto est� apontando.
				 * 
				 * Terceiro argumento � como a gravacao ser� feita.
				 * 		-> False significa que o arquivo ser� sobreposto cada vez que criado.
				 * 
				 * 		-> True indica que o arquivo ser� criado uma vez 
				 * e cada vez que for iniciado o programa, ser� acrescentado novos valores.
				 */
				
				texto = ArquivoSaida.carregar("saida.txt");
				System.out.println(texto); //Apenas para aparecer o resultado no eclipse.
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}