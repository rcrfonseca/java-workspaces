package entity;

public class Pessoa {
	// qualificador public

	// int Integer (classe do int c++ e no c: int)
	private Integer idpessoa;
	private String nome;
	private String sexo;

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

	public void setSexo(String sexo) { // void: sem retorno
		this.sexo = sexo;
		// alimentar o atributo da classe (this � objeto da pr�pria classe)
	}

	// Conceito de outra acessar os dados (alimenta_encapsulamento)
	// set _ atribui��o (alimento dos dados)
	// get _ retorno (dos dados)

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		// Classe vira objeto p e cria um espa�o de mem�ria (new).
		// Chama o construtor Pessoa ();
		// Classe Pessoa vira o objeto p/
		// new cria um espa�o de mem�ria.

		p.setIdpessoa(100);
		p.setNome("luan santana");
		p.setSexo("n�o sei");

		// p/ imprimir: syso + ctrl + espa�o.
		System.out.println(p.getIdpessoa() + "," + p.getNome() + ","
				+ p.getSexo());
		// getIdPessoa() - retorna o valor do idpessoa, (p) � o objeto.

	}
}
