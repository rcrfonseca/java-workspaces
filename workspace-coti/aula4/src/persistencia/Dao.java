package persistencia;

import java.sql.*; //API (bibliotecas para serem utilizadas).

public class Dao {
	// Data Active Object;

	// friendly
	Connection con; // falar com o BD.

	PreparedStatement stmt; // DML (insert, atualizar) ddl (criar tabelas).

	ResultSet rs; // Consulta.

	CallableStatement call; // Para usar StoredProcedure.

	public void open() throws Exception {
		Class.forName("com.mysql.jdbc.Driver"); // Isto demonstra diretórios do
		// JAVA, não é um site.
		// Diretório com/mysql/jdbc/driver.
		// Definindo o BD.

		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/intensivo", "root", "coti");
		// definição do banco, definição do usuário, definição da senha.
	}

	public void close() throws Exception {
		con.close();
	}

}
