package persistence;

import entity.Usuario;

public class UsuarioDao extends Dao {

	public void create(Usuario u) throws Exception {

		stmt = con.prepareStatement("insert into usuario values(?,?,?)");
		stmt.setString(1, u.getNome());
		stmt.setString(2, u.getLogin());
		stmt.setString(3, u.getSenha());
		stmt.execute();
	}

	public boolean isLogin(Usuario u) throws Exception{
		open();
	    stmt = con.prepareStatement("select * from usuario where login=? and senha=?");
	    stmt.setString(1, u.getLogin());
		stmt.setString(2, u.getSenha());
	    rs = stmt.executeQuery();
	    //
		boolean resp = false;
		if (rs.next()){ // se estiver certo resp = true 
		 resp = true;
		}	
		close();
		return resp;
	}
}
