package persistence;

import entity.*;//essa classe consegue ver tudo das classes desse pacote que n�o sejam private

public class PessoaDao extends Dao {

	public void create(Pessoa p) throws Exception {
		/*
		 * (Pessoa p) j� leva todos os atributos da classe Pessoa, a� l� embaixo
		 * poder� colocar p.getNome como no c�digo ao lado
		 * stmt.setString(1,p.getNome()); prepareStatement serve para executar
		 * opera��es(statements) no banco de dados (insert, delete, etc
		 */
		stmt = con.prepareStatement("insert into pessoa values(null,?,?)");
		stmt.setString(1, p.getNome());
		stmt.setString(2, p.getEmail());
		stmt.execute();// faz rodar no banco. SEM ISSO NADA RODA NO BANCO

	}
}
