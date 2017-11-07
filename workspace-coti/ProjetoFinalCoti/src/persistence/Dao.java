package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
	
	protected Connection con;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	public void open() throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetofinalcoti", "root", "coti");
	}
	
	public void close() throws Exception{
		
		try {
			if(con != null)
				con.close();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}