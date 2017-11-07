package entity;

public class Produto {

	private Integer idproduto;
	private String produto;
	private Integer quantidade;
	private Double preco;

	public Produto(Integer idproduto, String produto, Integer quantidade,
			Double preco) {
		this.idproduto = idproduto;
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Produto() {

	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String toString() {
		return idproduto + ", " + produto + ", " + quantidade + ", " + preco;
	}
	
	

}
