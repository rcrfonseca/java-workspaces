package listagem;

import java.util.*;

public class Lista {

	// List (interface) ela só possui os métodos.
	// ArrayList armazena ou lista todos os dados.
	// <String> um tipo.
	// Toda vez que for trabalhar com lista deve-se colocar o tipo de lista. Se
	// for uma lista que trabalhe com nomes, terá que tipar para String, senão
	// ela será genérica (Object), ou seja, ela aceitará letra, número, etc
	List<String> lista1 = new ArrayList<String>();

	// Lista é de tamanho ilimitado, entre vetor e lista
	// o java fica com lista (94%)
	public void adicionarNomeLista(String nome) {
		lista1.add(nome);// adicionar
	}

	public List<String> retornaTodosNomes() {
		return lista1;// aparece todos os nomes
	}

	public void removerNomeLista(int pos) {
		lista1.remove(pos);// representa a posição. Ex. jose, daiana, kelly

	}

	public String retornaUmNome(int pos) {
		return lista1.get(pos);// retorna o nome pela posição. ex se no pos for
		// 1 será o daiana, 2 kelly e 0 jose
	}

	// add => adiciona uma posição
	// remove => remover pela posição
	// get => para buscar pela posição específica
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
		// retorna o nome da posição correspondente

		// Abaixo não precisou fazer os métodos pq está sendo feito no main
		// não é uma prática boa, mas só foi feito pra servir de teste
		List<Integer> numero1 = new ArrayList<Integer>();
		numero1.add(10);
		numero1.add(200);
		numero1.add(50);
		numero1.add(30);

		numero1.remove(2);// removeu o número correspondente a posição 2

		System.out.println(numero1);

		try {
			numero1.add(21);
			System.out.println(numero1);
			throw new Exception("Adicionado o número 21.");// essa linha força a dar a mensagem
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
														// lança uma exceção (vá
														// para)
			else if (media >= 40)
				throw new Exception("Aluno em recuperação");
			else
				throw new Exception("Aluno reprovado");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {// Depois do try e catch, ele sempre executará algo. No nosso
					// caso uma msg
			System.out.println("**** Fim de programa ****");
		}
	}
}
