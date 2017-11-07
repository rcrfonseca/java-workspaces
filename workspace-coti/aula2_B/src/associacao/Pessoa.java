package associacao;

public class Pessoa {

	private Integer idpessoa;
	private String nome;

	// Pessoa tem endere�o.
	private Endereco Endereco;

	// Associa��o por agrega��o.
	//Unidirecional, Pessoa visualiza endere�o.

	public Endereco getEndereco() {
		return Endereco;
	}

	public void setEndereco(Endereco endereco) {
		Endereco = endereco;
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

}
