package entity;

//todo método é abstrato, e será programado.
//quando interface for implementação
//extends errado, implements, certo.
public interface IArquivo {

	public abstract void open() throws Exception;

	// throws Eception me obriga no futuro (na hora de rodar a classe e a mesma
	// virar objeto) a tratar
	// a exception.

	public abstract void close() throws Exception;

	public void gravaArquivoTxt(String texto) throws Exception;
	// todo método da interface é abstrato de uma forma implícita.
}
// Interface eu só tenho cabeçalho do método. Não tenho a programação.
