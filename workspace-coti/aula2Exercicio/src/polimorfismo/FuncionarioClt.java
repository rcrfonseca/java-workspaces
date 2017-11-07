package polimorfismo;

public class FuncionarioClt extends Funcionario {
	/*
	 * Subclasse de Funcion�rio, onde dever� ser implementado o m�todo abstrato
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
		 * Neste m�todo aplicamos um benef�cio ao FuncionarioClt, pois este
		 * recebe d�cimo terceiro.
		 */

		if (tempoTrabalho > 1)
			/*
			 * Esta condi��o est� relacionada ao tempo de trabalho do
			 * Funcion�rio na empresa (em anos).
			 */

			decimoTerceiro = getSalarioBase();
		/*
		 * Se o tempo de trabalho for maior que 1 ano, o Funcionario recebe o
		 * d�cimo terceiro completo.
		 */

		else
			decimoTerceiro = getSalarioBase() / 2;
		/*
		 * Se o tempo de trabalho na empresa for menor que 1 ano, o funcion�rio
		 * recebe metade do d�cimo terceiro.
		 */

		return decimoTerceiro;
	}

	public Double salarioTotal() {

		/*
		 * O sal�rio total do Funcionario dever� ser calculado atrav�s da soma
		 * do sal�rio base com o benef�cio recebido por ele.
		 */
		return getSalarioBase() + getBeneficio();
	}
}
