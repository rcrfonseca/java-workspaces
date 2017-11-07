package persistence;

import entity.Aluno;

public class AlunoDao extends Dao {
	public void create(Aluno a) throws Exception {
		stmt = con.prepareStatement("insert into aluno values (null,?,?)");
		stmt.setDouble(1, a.getNota1());
		stmt.setDouble(2, a.getNota2());
		stmt.execute();
	}

}
