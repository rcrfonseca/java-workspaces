package entity;

public abstract class Produto {
	// n�o poder� se transformar em "objeto".
	// toda classe com abstract n�o pode ter m�todo construtor, pois s� serve
	// para promover heran�a.

	private String produto;
	private Double preco;
	private Integer quantidade;

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public abstract Double getDesconto();
	// Para criar m�todo abstract, a classe tem que ser abstrata, mas n�o
	// necessariamente tem que possuir um m�todo abstrato se a classe for
	// abstrata.
	// Quem herdar tem que implementar o m�todo.
	// A programa��o para quem herda � obrigat�ria.

}
