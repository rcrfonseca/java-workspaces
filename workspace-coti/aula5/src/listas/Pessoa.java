package listas;

import java.util.*; /* Usado para Lista, ArrayList, Set). 
Ordenar uma classe. 
 * Ordenação por lista, implementar Comparable.
 * Comparable traz o método: compareTo().*/

public class Pessoa implements Comparable {
	/* Comparable: Ordenar em crescente ou decrescente. */

	private Integer idpessoa;
	private String nome;
	private String email;

	public Pessoa(Integer idpessoa, String nome, String email) {
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.email = email;
	}

	public Pessoa() {

	}

	public int hashCode() {
		return idpessoa;
		/* Retorna o idpessoa. 
		 * HashSet() depende do hashCode().*/
	}

	public boolean equals(Object obj) {
		return ((Pessoa) obj).getIdpessoa().equals(this.idpessoa);
		/*
		 * Programando a igualdade pelo idpessoa ou pelos campos que eu quiser.
		 * Critério de igualdade do objeto boolean.
		 */
	}

	// Um fator de ordenação.

	public String toString() {
		return idpessoa + ", " + nome + ", " + email;
		/* Representa o valor do objeto. Valor de retorno. */
	}

	public Integer getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(Integer idpessoa) {
		this.idpessoa = idpessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int compareTo(Object o) {
		// return ((Pessoa) o).getIdpessoa().compareTo(this.idpessoa); //ordem
		// decrescente.
		return this.idpessoa.compareTo(((Pessoa) o).getIdpessoa()); // ordem
		// crescente
		/*
		 * Critério de ordenação (quero ordenar, ao invés de equals(), inserir
		 * compareTo(). Ordem decrescente (porque o get() está na frente do
		 * this). get() na frente: ordem decrescente.
		 */

		/*
		 * compareTo = idpessoa; equals() = idpessoa; hasCode() = idpessoa.
		 */
	}

	public static void main(String[] args) {
		Set<Pessoa> lista1 = new HashSet<Pessoa>();
		/* Set com HashSet(): Objetivo é eliminar os duplicados. */
		// List<Pessoa> lista1 = new ArrayList<Pessoa>();
		/*
		 * É a forma mais comum de se armazenar Pessoa. Para armazenar um grupo
		 * de dados. Lista é tipada, o tipo de lista é Pessoa, só pode armazenar
		 * o objeto p1, p2, p3 de Pessoa.
		 */

		Pessoa p1 = new Pessoa(4, "Luis", "luis@gmail.com");
		Pessoa p2 = new Pessoa(2, "Carlos", "carlos@gmail.com");
		Pessoa p3 = new Pessoa(2, "Augusto", "augusto@gmail.com");

		lista1.add(p1);
		lista1.add(p2);
		lista1.add(p3);

		// Posso imprimir: System.out.println(lista1.add(p3)); para saber se
		// operação foi true ou false.
		/* Armazenando os 3 objetos. */

		/* Ordem */
		//Collections.sort(lista1);
		/*
		 * Tem que executar o método sort para ordenar e mesmo assim o syso para
		 * imprimir.
		 */

		System.out.println(lista1);

	}

}
