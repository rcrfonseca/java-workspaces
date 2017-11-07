package persistencia;

import java.util.*; // Utilizada para os LIST. (para consulta)
import entity.Pessoa; //Porque est� trabalhando com a classe pessoa.

public class PessoaDao extends Dao {

	// p � instancia do Objeto, resgata todos os dados de Pessoa.
	// Pessoa j� est� preenchido antes de executar esse m�todo.

	public void create(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa values (?,?,?)");
		// n�mero de interroga��es � o n�mero de parametros que ele deve gravar
		// no banco.
		// 3 par�metros, na ordem que foram declarados.
		stmt.setInt(1, p.getIdpessoa());// Os n�meros antes do get() indicam
		// qual posi�ao da tabela deve-se
		// gavar o dado.
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getSexo());
		stmt.execute();// gravar.
		stmt.close();// fecho a tabela.

		close();// fecho o banco de dados.

	}

	public List<Pessoa> findALL() throws Exception {
		open();

		List<Pessoa> resp = new ArrayList<Pessoa>();

		stmt = con.prepareStatement("Select * from pessoa"); // n�o teve
		// parametro.
		// stmt Prepared Statement

		rs = stmt.executeQuery(); // executando a consulta.
		// ResultSet

		while (rs.next()) {
			Pessoa p = new Pessoa(
					rs.getInt("idpessoa"), 
					rs.getString("nome"),
					rs.getString("sexo")
					);
			resp.add(p); // Percorendo e armazenando cada item do banco de
			// dados.
		}
		close();

		return resp;

	}

}
