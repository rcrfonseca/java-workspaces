package controle;

public class Programa {

	public static void main(String[] args) {

		try {
			int[] par = new int[50]; //Cria o vetor para armazenar os numeros pares.
			int i, j = 0;

			for (i = 1; i < 101; i++) //Loop para contar os numeros pares de 1 a 100.
			{

				if (i % 2 == 0) //Checa se o resto da divisão é = 0, incrementando o numero de pares.
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
				/* Aqui é onde se escolhe como e onde salvar o arquivo.
				 * 
				 * Primeiro parametro do método salvar é o caminho onde salva o arquivo.
				 * Se nao for dito o caminho como exemplo: c:/saida.txt, 
				 * o arquivo é salvo na pasta do projeto criado.
				 * 
				 * Segundo argumento é o que será escrito no arquivo, 
				 * neste caso o conteúdo para onde o ponteiro texto está apontando.
				 * 
				 * Terceiro argumento é como a gravacao será feita.
				 * 		-> False significa que o arquivo será sobreposto cada vez que criado.
				 * 
				 * 		-> True indica que o arquivo será criado uma vez 
				 * e cada vez que for iniciado o programa, será acrescentado novos valores.
				 */
				
				texto = ArquivoSaida.carregar("saida.txt");
				System.out.println(texto); //Apenas para aparecer o resultado no eclipse.
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}