package face;

public interface IProduto {
	/*
	 * Todo método de uma interface é abstrato por padrão. Interface apenas deve
	 * ter o cabeçalho do método. As classes que implementarem a interface devem
	 * codificar estes métodos abstratos.
	 */

	public void abrirArquivo() throws Exception;

	public void gravarArquivo(String texto) throws Exception;

	public void fecharArquivo() throws Exception;

}
