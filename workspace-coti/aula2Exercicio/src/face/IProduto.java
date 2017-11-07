package face;

public interface IProduto {
	/*
	 * Todo m�todo de uma interface � abstrato por padr�o. Interface apenas deve
	 * ter o cabe�alho do m�todo. As classes que implementarem a interface devem
	 * codificar estes m�todos abstratos.
	 */

	public void abrirArquivo() throws Exception;

	public void gravarArquivo(String texto) throws Exception;

	public void fecharArquivo() throws Exception;

}
