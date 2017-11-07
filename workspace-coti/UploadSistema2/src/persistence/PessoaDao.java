package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Pessoa;

public class PessoaDao extends Dao {
	
	public void create(Pessoa p) throws Exception{
		open();
		stmt = con.prepareStatement("insert into pessoa values(?,?,?,?)");
		stmt.setInt(1, p.getIdpessoa());
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getSexo());
		stmt.setString(4, p.getFoto());
		stmt.execute();
		stmt.close();
		close();
	}
	
	public List<Pessoa> findAll() throws Exception {
		open();
		List <Pessoa> lista = new ArrayList<Pessoa>();
		stmt = con.prepareStatement("select * from pessoa");
		rs = stmt.executeQuery();
		while(rs.next()){
			Pessoa p = new Pessoa(
			rs.getInt("idpessoa"),
			rs.getString("nome"),		
			rs.getString("sexo"),
			rs.getString("foto")
			);
			lista.add(p);
		}
		close();
		return lista;
	}

}
