package belem;

public class Pessoa {
	private Integer idpessoa;
	private String nome;
	private String sexo;

	private Endereco endereco;

	// Só pessoa visualiza endereco
	// relacionamento unidimensional

	public Pessoa(Integer idpessoa, String nome, String sexo) {
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Pessoa() {
	}

	public String toString() {
		return idpessoa + ", " + nome + ", " + sexo;
	}

	// toString é o valor do objeto

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public static void main(String[] args) {
		Pessoa p = new Pessoa(10, "Alexandre", "f");
		// chamando o endereco por Pessoa
		p.setEndereco(new Endereco(1, "Centro", "RJ"));
		// acesso os dados por Pessoa

		System.out.println("Pessoa: " + p);
		// p imprime o toString de Pessoa
		System.out.println("Endereço: " + p.getEndereco());
		// p.getEndereco(), imprime o toString de Endereco
		// saída em endereço
	}
}
