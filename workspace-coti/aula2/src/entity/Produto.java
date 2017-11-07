package entity;

public abstract class Produto {
	// não poderá se transformar em "objeto".
	// toda classe com abstract não pode ter método construtor, pois só serve
	// para promover herança.

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
	// Para criar método abstract, a classe tem que ser abstrata, mas não
	// necessariamente tem que possuir um método abstrato se a classe for
	// abstrata.
	// Quem herdar tem que implementar o método.
	// A programação para quem herda é obrigatória.

}
