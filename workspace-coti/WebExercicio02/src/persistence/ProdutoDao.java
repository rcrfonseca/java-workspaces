package persistence;

import entity.Produto;

public class ProdutoDao extends Dao {

	public void create(Produto p) throws Exception {

		stmt = con.prepareStatement("insert into produto values (null,?,?,?)");
		stmt.setString(1, p.getNome());
		stmt.setDouble(2, p.getPreco());
		stmt.setInt(3, p.getQuantidade());
		stmt.execute();
		stmt.close();
		close();
	}

}
