package persistence;

import java.sql.*;

public class Dao {
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	CallableStatement call;
	
	public void open()throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "system", "coti");
	}
	
	public void close() throws Exception{
		con.close();
	}
	
	
	
	
}
