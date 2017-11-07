package persistence;

import java.sql.*;

public class RelatorioDao extends Dao {

	public ResultSet getConsultaProduto(String produto) throws Exception {
		open();
		stmt = con.prepareStatement("select * from produto where produto=?");
		stmt.setString(1, produto);
		rs = stmt.executeQuery();
		return rs;
	}

	public ResultSet getConsultaGeral() throws Exception {
		open();
		stmt = con.prepareStatement("select * from produto");
		rs = stmt.executeQuery();
		return rs;
	}
}
