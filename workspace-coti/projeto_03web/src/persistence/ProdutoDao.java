package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Produto;

public class ProdutoDao extends Dao {

	public void create(Produto p) throws Exception {
		stmt = con.prepareStatement("insert into produto values (null,?,?,?)");
		stmt.setString(1, p.getProduto());
		stmt.setInt(2, p.getQuantidade());
		stmt.setDouble(3, p.getPreco());
		stmt.execute();
		stmt.close();
		close();
	}

	public List<Produto> findByAll() throws Exception {
		
		open();
		
		List<Produto> listapro = new ArrayList<Produto>();
		/* cada dado da tabela (registro) é armazenado em uma lista. */
		/* Lista parametrizada. */

		stmt = con.prepareStatement("select * from produto");
		/* Consulta */

		rs = stmt.executeQuery();
		/* busca os dados com rs(resultset) */

		while (rs.next()) {
			Produto p = new Produto(
					rs.getInt("idproduto"), 
					rs.getString("produto"), 
					rs.getInt("quantidade"), 
					rs.getDouble("preco")
					);

			/*
			 * Busco pelo construtor. Armazeno na lista.
			 */

			listapro.add(p);
			/* Armazenei o objeto produto. */
		}

		close();
		
		return listapro;
	}
	
	public void delete (Integer cod) throws Exception{
		
		open();
		
		stmt = con.prepareStatement("delete from produto where idproduto=?");
		/* Deleta a tupla da tabela produto pelo código. */
		
		stmt.setInt(1, cod);
		stmt.execute();
		stmt.close();
		close();
	}
	
	public Produto findById(Integer cod) throws Exception{
		
   	 open();
   	 
	 stmt = con.prepareStatement("select * from produto where idproduto=?");
	 stmt.setInt(1, cod);
	 
	 Produto p=null;
	 
	 rs = stmt.executeQuery();
	 
	 if(rs.next()){
		 p= new Produto(
				         rs.getInt("idproduto"), 
				         rs.getString("produto"),
				         rs.getInt("quantidade"),
		                 rs.getDouble("preco")
		               );
	 }
   	 close();
	 return p;
	}
	
	public void update(Produto p) throws Exception{
		
   	 open();
   	 
	 stmt = con.prepareStatement("update produto set produto=?, preco=?, quantidade=? where idproduto=?");
			 
	 stmt.setString(1, p.getProduto());
	 stmt.setDouble(2, p.getPreco());
	 stmt.setInt(3, p.getQuantidade());
	 stmt.setInt(4, p.getIdproduto());
	 stmt.execute();
     stmt.close();
	 close();
	}
}