package entity;

//generaliza��o | Especializa��o na UML (heran�a no JAVA).
//superclasse n�o enxerga subclasse.

public class Pessoa {

	// private Integer idpessoa; est� certo, mas � um atributo muito espec�fico.
	private String nome;
	private String email;

	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	} // alterou o construtor, tem que criar um vazio.

	public Pessoa() {

	}

	@Override
	public String toString() {
		return nome + "," + email;
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

}
