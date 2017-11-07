package listagem;

import java.util.*;

public class Lista {

	// List (interface) ela s� possui os m�todos.
	// ArrayList armazena ou lista todos os dados.
	// <String> um tipo.
	// Toda vez que for trabalhar com lista deve-se colocar o tipo de lista. Se
	// for uma lista que trabalhe com nomes, ter� que tipar para String, sen�o
	// ela ser� gen�rica (Object), ou seja, ela aceitar� letra, n�mero, etc
	List<String> lista1 = new ArrayList<String>();

	// Lista � de tamanho ilimitado, entre vetor e lista
	// o java fica com lista (94%)
	public void adicionarNomeLista(String nome) {
		lista1.add(nome);// adicionar
	}

	public List<String> retornaTodosNomes() {
		return lista1;// aparece todos os nomes
	}

	public void removerNomeLista(int pos) {
		lista1.remove(pos);// representa a posi��o. Ex. jose, daiana, kelly

	}

	public String retornaUmNome(int pos) {
		return lista1.get(pos);// retorna o nome pela posi��o. ex se no pos for
		// 1 ser� o daiana, 2 kelly e 0 jose
	}

	// add => adiciona uma posi��o
	// remove => remover pela posi��o
	// get => para buscar pela posi��o espec�fica
	// return lista1 => retorno de todos os dados

	public static void main(String[] args) {
		Lista l = new Lista();
		l.adicionarNomeLista("Luan Santana");
		l.adicionarNomeLista("Priscila");
		l.adicionarNomeLista("Kelly");
		l.adicionarNomeLista("Dayana");
		l.adicionarNomeLista("n");
		System.out.println(l.retornaTodosNomes());
		// retorna todos
		System.out.println(l.retornaUmNome(2));
		// retorna o nome da posi��o correspondente

		// Abaixo n�o precisou fazer os m�todos pq est� sendo feito no main
		// n�o � uma pr�tica boa, mas s� foi feito pra servir de teste
		List<Integer> numero1 = new ArrayList<Integer>();
		numero1.add(10);
		numero1.add(200);
		numero1.add(50);
		numero1.add(30);

		numero1.remove(2);// removeu o n�mero correspondente a posi��o 2

		System.out.println(numero1);

		try {
			numero1.add(21);
			System.out.println(numero1);
			throw new Exception("Adicionado o n�mero 21.");// essa linha for�a a dar a mensagem
			// de erro
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println("Digite a primeira nota: ");
			Scanner sc = new Scanner(System.in);
			double nota1 = sc.nextDouble();
			System.out.println("Digite a segunda nota: ");
			double nota2 = sc.nextDouble();
			double media = (nota1 + nota2) / 2;
			if (media >= 70)
				throw new Exception("Aluno aprovado");// throw new Exception
														// lan�a uma exce��o (v�
														// para)
			else if (media >= 40)
				throw new Exception("Aluno em recupera��o");
			else
				throw new Exception("Aluno reprovado");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {// Depois do try e catch, ele sempre executar� algo. No nosso
					// caso uma msg
			System.out.println("**** Fim de programa ****");
		}
	}
}
