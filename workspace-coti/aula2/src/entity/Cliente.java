//ordem: atributos, construtor, toString(), set, get. 
package entity;

public class Cliente extends Pessoa {
	// Cliente é uma Pessoa.
	// setNome(), setEmail(), getNome(), getEmail().
	// cliente já possui 4 métodos.

	private Integer idcliente;
	private String cpf;

	// Construtor diferente na herança

	public Cliente(String nome, String email, Integer idcliente, String cpf) {
		super(nome, email); // super(), leva o nome e email para a classe
		// principal, Pessoa.
		this.idcliente = idcliente;
		this.cpf = cpf;
	}

	// Nome e Email herdados de pessoa.

	public Cliente() {

	}

	public String toString() {
		return idcliente + "," + cpf + "," + getNome() + "," + getEmail();
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	// testar a classe: usar o main.

	public static void main(String[] args) {
		Cliente c = new Cliente(); // como está executando o construtor vazio,
		// deve-se usar o set() para definir os dados de Cliente e Pessoa.
		// Também poderia se usar o método construtor para definir os mesmos.
		c.setCpf("33333333333");
		c.setEmail("abc@gmail.com");
		c.setNome("Fernanda");
		c.setIdcliente(1);

		System.out.println(c);
	}

}
