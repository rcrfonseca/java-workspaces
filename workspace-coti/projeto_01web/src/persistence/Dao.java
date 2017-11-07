package persistence;

import java.sql.*;

public class Dao {

	protected Connection con;
	protected PreparedStatement stmt;
	protected ResultSet rs;

	// protected serve para que só o pacote veja ou quem herda

	public void open() throws Exception {
		// Carregar o caminho do driver de conexão com MySql
		Class.forName("com.mysql.jdbc.Driver");
		// realizo a conexão e armazeno no atributo 'con'
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula",
				"root", "coti");
	}

	public void close() {
		try {
			if (con != null) {// faço o teste para saber se tem uma conexão
				// aberta para depois mandar fechar
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			// ele joga o erro no console e não no programa
			// rodando
		}

	}
}
