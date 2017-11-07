package polimorfismo;

public abstract class Funcionario {

	private String nome;
	private Double salarioBase;

	/* Esta classe n�o ter� m�todo construtor pois ela � do tipo 'ABSTRACT'. */

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
	 * M�todo para calcular o sal�rio do Funcionario, � abstrato pois dever� ser
	 * codificado nas subclasses de Funcionario.
	 */

}
