package entity;

//todo m�todo � abstrato, e ser� programado.
//quando interface for implementa��o
//extends errado, implements, certo.
public interface IArquivo {

	public abstract void open() throws Exception;

	// throws Eception me obriga no futuro (na hora de rodar a classe e a mesma
	// virar objeto) a tratar
	// a exception.

	public abstract void close() throws Exception;

	public void gravaArquivoTxt(String texto) throws Exception;
	// todo m�todo da interface � abstrato de uma forma impl�cita.
}
// Interface eu s� tenho cabe�alho do m�todo. N�o tenho a programa��o.
