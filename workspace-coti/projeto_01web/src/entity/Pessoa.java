package entity;

public class Pessoa {
	private Integer idpessoa;
	private String nome;
	private String email;

	public Pessoa() {
	}

	public Pessoa(Integer idpessoa, String nome, String email) {
		super();
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.email = email;
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
	public boolean equals(Object obj) {
		/*
		 * Object é referencia a qualquer coisa, por isso logo abaixo é preciso
		 * fazer um teste se o obj é da Classe Pessoa.
		 */
		if (obj instanceof Pessoa) {
			Pessoa p = (Pessoa) obj;
			return p.getIdpessoa() == this.idpessoa;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.idpessoa.hashCode();
	}

	@Override
	public String toString() {
		return this.nome + "," + this.email;
	}

}
