package validacao;

import java.util.Scanner;
import java.util.regex.*;

public class Aluno {

	private String nome;
	Pattern p;
	Matcher m;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public Aluno() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean validaNome(String nome) {
		p = Pattern.compile("[a-z A-Z á-ú]{3,10}");
		m = p.matcher(nome);
		return m.matches();
	}

	public String obterNomeAluno() {
		System.out.println("Digite o nome do aluno: ");
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		return nome;
	}

	public static void main(String[] args) {

		Aluno a = new Aluno();

		a.obterNomeAluno();
		System.out.println(a.validaNome(a.nome));

	}
}
