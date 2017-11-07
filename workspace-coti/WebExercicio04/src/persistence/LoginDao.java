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
		if(rs.next()){
			resp = true;
		}
		close();
		return resp;
	}
	
	public void create(Login lo) throws Exception{
		open();
		stmt = con.prepareStatement("insert into login values(null,?,?)");
		stmt.setString(1, lo.getLogin());
		stmt.setString(2, lo.getSenha());
		stmt.execute();
		stmt.close();
		close();
	}
}