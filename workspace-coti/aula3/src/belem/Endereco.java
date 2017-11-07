package belem;

//associação verbo ter
public class Endereco {
	private Integer idendereco;
	private String bairro;
	private String cidade;

	public Endereco(Integer idendereco, String bairro, String cidade) {
		this.idendereco = idendereco;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public Endereco() {

	}

	public String toString() {
		return idendereco + ", " + bairro + ", " + cidade;
	}

	public Integer getIdendereco() {
		return idendereco;
	}

	public void setIdendereco(Integer idendereco) {
		this.idendereco = idendereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
