package polimorfismo;

public class FuncionarioPj extends Funcionario {

	public Double salarioTotal() {
		/*
		 * Este m�todo s� retornar� o sal�rio base porque o funcion�rio do tipo
		 * Pessoa Jur�dica ou Aut�nomo n�o recebe benef�cios.
		 */
		
		return getSalarioBase();
	}

}
