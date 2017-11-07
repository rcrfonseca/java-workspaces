package polimorfismo;

public class FuncionarioClt extends Funcionario {
	/*
	 * Subclasse de Funcionário, onde deverá ser implementado o método abstrato
	 * salarioTotal(), presente em Funcionario.
	 */

	private Integer tempoTrabalho; // Em anos.
	private Double decimoTerceiro;

	public void setTempoTrabalho(Integer tempoTrabalho) {
		this.tempoTrabalho = tempoTrabalho;
	}

	public Integer getTempoTrabalho() {
		return tempoTrabalho;
	}

	public void setDecimoTerceiro(Double decimoTerceiro) {
		this.decimoTerceiro = decimoTerceiro;
	}

	public Double getDecimoTerceiro() {
		return decimoTerceiro;

	}

	public Double getBeneficio() {
		/*
		 * Neste método aplicamos um benefício ao FuncionarioClt, pois este
		 * recebe décimo terceiro.
		 */

		if (tempoTrabalho > 1)
			/*
			 * Esta condição está relacionada ao tempo de trabalho do
			 * Funcionário na empresa (em anos).
			 */

			decimoTerceiro = getSalarioBase();
		/*
		 * Se o tempo de trabalho for maior que 1 ano, o Funcionario recebe o
		 * décimo terceiro completo.
		 */

		else
			decimoTerceiro = getSalarioBase() / 2;
		/*
		 * Se o tempo de trabalho na empresa for menor que 1 ano, o funcionário
		 * recebe metade do décimo terceiro.
		 */

		return decimoTerceiro;
	}

	public Double salarioTotal() {

		/*
		 * O salário total do Funcionario deverá ser calculado através da soma
		 * do salário base com o benefício recebido por ele.
		 */
		return getSalarioBase() + getBeneficio();
	}
}
