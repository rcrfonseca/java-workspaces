package persistence;
import java.sql.*;

public class Dao {
	
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	public void open() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco1", "root", "coti");
	}
	
	public void close() throws Exception{
		con.close();
	}

}
