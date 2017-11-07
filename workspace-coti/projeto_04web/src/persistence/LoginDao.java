package persistence;

import entity.*;

public class LoginDao extends Dao {
	
	public boolean isLogin(Login lo) throws Exception{
		
		open();
		
		stmt = con.prepareStatement("select * from login where login=? and senha=?");
		
		stmt.setString(1, lo.getLogin());
		stmt.setString(2, lo.getSenha());
		
		rs = stmt.executeQuery();
		
		boolean resp = false;
		
		if (rs.next()){
			resp = true;
		}
		/* Verifica se o login e a senha pertecem a mesma tupla. */
		
		close();
		return resp;
	}

}
