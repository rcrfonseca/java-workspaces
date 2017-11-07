package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Endereco;
import entity.Pessoa;

public class Main {

	/*
	 * public static void main(String[] args) { / Método Main para
	 * relacionamento 1 1.
	 */

	/*
	 * Configuration cfg = new AnnotationConfiguration()
	 * .configure("cfg/mysql_hibernate.cfg.xml");
	 * 
	 * // Configuration
	 * 
	 * new SchemaExport(cfg).create(true, true); / Com este código, a tabela
	 * será criada fisicamente.
	 */

	/*
	 * Pessoa p = new Pessoa (null, "carlos"); Endereco e = new Endereco (null,
	 * "bela vista", "rj");
	 * 
	 * / emdereco busca pessoa, busca a chave estrangeira. busca a chave
	 * primária para gerar a estrangeira.
	 */
	/*
	 * e.setPessoa(p); /Quando a classe que tem foreign key busca a outra.
	 * Endereco busca Pessoa.
	 */

	/*
	 * try { PessoaDao pd = new PessoaDao(); pd.create(p);
	 * System.out.println("Dados de Pessoa gravados!");
	 * 
	 * EnderecoDao ed = new EnderecoDao(); ed.create(e);
	 * System.out.println("Dados de Endereço gravados!"); } catch (Exception e1)
	 * {
	 * 
	 * } }
	 */

	/* Main para relacionamento 1 N. */
	public static void main(String[] args) {

		Pessoa p = new Pessoa(null, "maria");

		Endereco e1 = new Endereco(null, "vila bela vista", "rj");
		Endereco e2 = new Endereco(null, "25 de agosto", "rj");
		Endereco e3 = new Endereco(null, "itatiaia", "rj");

		List<Endereco> listaendereco = new ArrayList<Endereco>();

		listaendereco.add(e1);
		listaendereco.add(e2);
		listaendereco.add(e3);
		
		try {
			PessoaDao pd = new PessoaDao();
			pd.create(p);
			System.out.println("Dados de pessoa gravados!");
			
			for (Endereco listae : listaendereco){
				listae.setPessoa(p);
				EnderecoDao ed = new EnderecoDao();
				ed.create(listae);
				System.out.println("Endereço gravado!");
			}
		} catch (Exception e) {
			
		}
	}
}
