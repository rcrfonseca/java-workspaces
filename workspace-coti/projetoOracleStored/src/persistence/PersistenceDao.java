package persistence;

import entity.*;

public class PersistenceDao extends Dao {
	
	public void create(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa values(?,?,?)");
		stmt.setInt(1, p.getIdpessoa());
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getSexo());
		stmt.execute();
		stmt.close();
		close();		
	}
	
	public void grava(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa values(?,?,?)");
		stmt.setInt(1, p.getIdpessoa());
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getSexo());
		stmt.execute();
		stmt.close();
		close();		
	}
	
	public static void main(String[] args) {
		PersistenceDao pd = new PersistenceDao();
		Pessoa p = new Pessoa(10, "beto barbosa", "i");
		
		try {
			pd.create(p);
			System.out.println("Dados Gravados!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}