package main;

import persistence.AlunoDao;
import entity.Aluno;

public class Main {

	public static void main(String[] args) {

		try {
			AlunoDao ad = new AlunoDao();

			for (Aluno a : ad.findALL()) {
				System.out.println("Dados do Banco:");
				System.out.println("Id Aluno: " + a.getIdaluno());
				System.out.println("Nome: " + a.getNome());
				System.out.println("Sexo: " + a.getSexo());
				System.out.println("=============================");
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
