package associacao;

public class Pessoa {

	private Integer idpessoa;
	private String nome;

	// Pessoa tem endereço.
	private Endereco Endereco;

	// Associação por agregação.
	//Unidirecional, Pessoa visualiza endereço.

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
