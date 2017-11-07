package entity;

public class Pessoa {

	private Integer idpessoa;

	private String nome;

	private String sexo;

	public Pessoa(Integer idpessoa, String nome, String sexo) {

		this.idpessoa = idpessoa;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Pessoa() {

	}

	public String toString() {
		return idpessoa + "," + nome + "," + sexo;
	}// toString insiro todos os atributos no encapsulamento

	// o valor do objeto é retirado do toString();

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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
