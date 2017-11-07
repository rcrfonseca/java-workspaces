package persistence;

import entity.Computador;

public class ComputadorDao extends Dao {

	public void create(Computador c) throws Exception {

		stmt = con.prepareStatement("insert into computador values(?,?,?,?,?,?,?,?,?)");
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getCpu());
		stmt.setInt(3, c.getRam());
		stmt.setString(4, c.getVideo());
		stmt.setString(5, c.getDrivemidia());
		stmt.setString(6, c.getHd());
		stmt.setString(7, c.getPlacamae());
		stmt.setString(8, c.getMonitor());
		stmt.setString(9, c.getSo());
		stmt.execute();
	}

}
