package controle;

import java.util.Scanner;

public class InputAluno {
	Scanner ler = new Scanner(System.in);// Scanner não é para leitura.

	// System.in que acrescentado ao Scanner dá permissão de leitura dos dados.

	public String lerNomeAluno() {
		System.out.println("Digite o Nome do Aluno: ");
		return ler.nextLine();// Apenas next, pega a primeira palavra, se for
		// nextLine(), pega a linha inteira.
	}

	public Double lerNota1Aluno() {
		System.out.println("Digite a Nota 1 do aluno: ");
		return ler.nextDouble(); // Retorna a nota 1 do aluno.
	}

	public Double lerNota2Aluno() {
		System.out.println("Digite a Nota 2 do aluno: ");
		return ler.nextDouble();// Retorna a nota 2 do aluno.
	}

	public static void main(String[] args) {
		Aluno a = new Aluno(); // set() e get().
		InputAluno ia = new InputAluno();// p/ digitar os dados.
		a.setNome(ia.lerNomeAluno()); // atribuição indefinida (usuário entrará
		// com os dados).
		a.setNota1(ia.lerNota1Aluno());
		a.setNota2(ia.lerNota2Aluno());

		System.out.println("Nome: " + a.getNome());
		System.out.println("Média: " + a.getMedia());
	}

}
