package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Vendedor;

public class VendedorDao extends Dao {
	
	public List<Vendedor> findAll() throws Exception {
		
		open();
		stmt = con.prepareStatement("SELECT * FROM VENDEDOR");
		rs = stmt.executeQuery();
		List<Vendedor> resp = new ArrayList<Vendedor>();
		while(rs.next()){
			Vendedor v = new Vendedor(
					rs.getInt("idvendedor"),
					rs.getString("vendedor"),
					rs.getString("mes"),
					rs.getInt("ano"),
					rs.getDouble("preco"));
			resp.add(v);
		}
		con.close();		
		close();
		return resp;	
	}
	
	
	public List<String> findNomes() throws Exception {
		
		open();
		stmt = con.prepareStatement("SELECT DISTINCT(VENDEDOR) FROM VENDEDOR");
		rs = stmt.executeQuery();
		List<String> resp = new ArrayList<String>();
		while(rs.next()){
			Vendedor v = new Vendedor();
			v.setVendedor(rs.getString("vendedor"));
			resp.add(v.getVendedor());
		}
		con.close();		
		close();
		return resp;	
	}// Para retornar os nomes dos vendedores.

}
