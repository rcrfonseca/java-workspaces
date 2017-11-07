package excecao;

import java.util.*;

public class Cliente {
	private Integer idcliente;

	public Integer lerIdcliente() {
		/*
		 * Recursividade: Toda vez que o programa der erro, ele chama a si
		 * próprio. Só faz a recursividade quando ocorre um erro.
		 */
		try {
			System.out.println(" Digite o Idcliente .... : ");
			Scanner ler = new Scanner(System.in);
			idcliente = ler.nextInt();
			/* Se for digitado um valor do tipo Inteiro, OK. */
		} catch (Exception e) {
			lerIdcliente();
			/* Se digitar errado, ele repete até digitar o tipo certo. */
		}
		return idcliente;
	}

	public static void main(String[] args) {
		Cliente c = new Cliente();
		System.out.println("Número digitado foi: " + c.lerIdcliente());
	}
}
