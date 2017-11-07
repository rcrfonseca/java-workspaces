package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Impressora;

public class ImpressoraDao extends Dao {

	/* Método para armazenar dados na tabela IMPRESSORA. */
	public void create(Impressora i) throws Exception {

		stmt = con.prepareStatement("INSERT INTO IMPRESSORA VALUES(?,?,?,?)");
		stmt.setString(1, i.getNome());
		stmt.setString(2, i.getMarca());
		stmt.setString(3, i.getModelo());
		stmt.setString(4, i.getConexao());
		stmt.execute();
	}
	/* Fim do método. */

	/* Método para listar todas as tuplas da tabela IMPRESSORA. */
	public List<Impressora> findByAll() throws Exception {

		open();

		List<Impressora> listaimp = new ArrayList<Impressora>();

		stmt = con.prepareStatement("SELECT * FROM IMPRESSORA");

		rs = stmt.executeQuery();

		while (rs.next()) {
			Impressora i = new Impressora(rs.getString("nome"),
					rs.getString("marca"), rs.getString("modelo"),
					rs.getString("conexao"));

			listaimp.add(i);
		}

		close();

		return listaimp;
	}
	/* Fim do método. */

	/* Método para apagar uma tupla da tabela IMPRESSORA. */
	public void delete(String nome) throws Exception {

		open();

		stmt = con.prepareStatement("DELETE FROM IMPRESSORA WHERE NOME=?");

		stmt.setString(1, nome);
		stmt.execute();
		stmt.close();
		close();
	}
	/* Fim do método. */

	/* Método para pesquisar uma tupla atavés do Nome da IMPRESSORA. */
	public Impressora findByNome(String nome) throws Exception {

		open();

		stmt = con.prepareStatement("SELECT * FROM IMPRESSORA WHERE NOME=?");
		stmt.setString(1, nome);

		Impressora i = null;

		rs = stmt.executeQuery();

		if (rs.next()) {
			i = new Impressora(rs.getString("nome"),
					rs.getString("marca"), rs.getString("modelo"),
					rs.getString("conexao"));
		}
		close();
		return i;
	}
	/* Fim do método. */

	/* Método para atualizar a tupla da tabela IMPRESSORA após uma alteração. */
	public void update(Impressora i) throws Exception {

		open();

		stmt = con.prepareStatement("UPDATE IMPRESSORA SET MARCA=?, MODELO=?, CONEXAO=? WHERE NOME=?");

		stmt.setString(1, i.getNome());
		stmt.setString(2, i.getModelo());
		stmt.setString(3, i.getConexao());
		stmt.setString(4, i.getNome());
		stmt.execute();
		stmt.close();
		close();
	}
	/* Fim do método. */

}
