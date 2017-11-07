package persistence;

import entity.Numero;

public class NumeroDao extends Dao {

	public void create(Numero n) throws Exception {
		stmt = con.prepareStatement("insert into numero values (null,?)");

		stmt.setDouble(1, n.getValor());
		stmt.execute();
		stmt.close();
		close();
	}

}
