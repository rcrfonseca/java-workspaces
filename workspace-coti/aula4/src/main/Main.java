package main;

import persistencia.*;
import entity.*;

public class Main {
	public static void main(String[] args) {
		// Pessoa p = new Pessoa(7, "Obama", "f"); //grava apenas devido a
		// chave.

		try {
			PessoaDao pd = new PessoaDao();// grava apenas uma vez devido a
			// execução.
			// pd.create(p); - para gravação.

			for (Pessoa p : pd.findALL())// os dois pontos servem para indicar
			// que a contagem vai ser automática. Não precisa indicar para
			// quanto deve rodar o for.
			{
				System.out.println("Dados do banco: ");
				System.out.println("Id: " + p.getIdpessoa());
				System.out.println("Nome: " + p.getNome());
				System.out.println("Sexo: " + p.getSexo());
				System.out.println("----------------------------");
			}

			// System.out.println("Dados Gravados!");

		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());

		}

	}

}
