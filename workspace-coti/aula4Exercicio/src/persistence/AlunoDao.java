package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Aluno;

public class AlunoDao extends Dao {

	public void create(Aluno a) throws Exception {
		open();
		stmt = con.prepareStatement("insert into aluno values (?,?,?)");
		stmt.setInt(1, a.getIdaluno());
		stmt.setString(2, a.getNome());
		stmt.setString(3, a.getSexo());
		stmt.execute();
		stmt.close();
		close();
	}

	public List<Aluno> findALL() throws Exception {
		open();

		List<Aluno> resp = new ArrayList<Aluno>();

		stmt = con.prepareStatement("select * from aluno");

		rs = stmt.executeQuery();

		while (rs.next()) {
			Aluno a = new Aluno(rs.getInt("idaluno"), rs.getString("nome"),
					rs.getString("sexo"));

			resp.add(a);

		}

		close();

		return resp;
	}

}
