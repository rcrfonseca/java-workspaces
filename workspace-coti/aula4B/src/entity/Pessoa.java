package entity;

public class Pessoa {
	private Integer idpessoa;
	private String nome;
	private Endereco endereco;

	public Pessoa(Integer idpessoa, String nome, Endereco endereco) {

		this.idpessoa = idpessoa;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Pessoa() {

	}

	public String toString() {
		return idpessoa + ", " + nome + ", " + endereco;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
