package excecao;

/* Criar Classe de Exception. */

public class ErroAula extends Exception {
	public ErroAula(String mensagemerro) {
		/* Passando o par�metro mensagemerro para a superclasse(Exception). */
		super(mensagemerro);
	}

}
