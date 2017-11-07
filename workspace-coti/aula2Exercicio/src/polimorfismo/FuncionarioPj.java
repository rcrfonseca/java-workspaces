package polimorfismo;

public class FuncionarioPj extends Funcionario {

	public Double salarioTotal() {
		/*
		 * Este método só retornará o salário base porque o funcionário do tipo
		 * Pessoa Jurídica ou Autônomo não recebe benefícios.
		 */
		
		return getSalarioBase();
	}

}
