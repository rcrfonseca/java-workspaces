package persistence;

import java.sql.*;

public class Dao {

	Connection con;

	PreparedStatement stmt;

	ResultSet rs;

	CallableStatement call;

	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/intensivo", "root", "coti");

	}

	public void close() throws Exception {
		con.close();
	}
}
