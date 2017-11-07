package entity;

public class Pessoa {

	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String toString() {
		return "Nome: " + nome + ", " + "CPF: " + cpf;
	}

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Raphael Carlos", "111.111.111/11");

		System.out.println(p.toString());

		// p.setCpf("111.111.111/11");
		// p.setNome("Raphael Carlos");

		// System.out.println("Nome: " + p.getNome() + ", " + "CPF: " +
		// p.getCpf());
	}

}
