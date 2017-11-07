package polimorfismo;

public abstract class Funcionario {

	private String nome;
	private Double salarioBase;

	/* Esta classe não terá método construtor pois ela é do tipo 'ABSTRACT'. */

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public abstract Double salarioTotal();
	/*
	 * Método para calcular o salário do Funcionario, é abstrato pois deverá ser
	 * codificado nas subclasses de Funcionario.
	 */

}
