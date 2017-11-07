package entity;

public class Produto {

	// métodos necessários de uma classe.
	// declarei 4 atributos.

	private Integer idproduto;
	private String produto;
	private Double preco;
	private Integer quantidade;

	public Produto(Integer idproduto, String produto, Double preco,
			Integer quantidade) {
		this.idproduto = idproduto;
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
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

	@Override
	public boolean equals(Object obj) {

		return ((Produto) obj).getIdproduto().equals(this.idproduto);
	}

	@Override
	public int hashCode() {

		return idproduto;
	}

	public String toString() {
		return idproduto + "," + produto + "," + preco + "," + quantidade;
	};

	public static void main(String[] args) {
		Produto p = new Produto(10, "maca", 2., 7);// alimentado pelo
		// construtor.
		Produto p2 = new Produto(10, "pera", 3., 21);
		// passei o id, produto, preço r a quantidade.
		// classe vira o Objeto p
		// = new (espaço de mem) Produto() construtor... implícito.

		// p.setIdproduto(100);
		// p.setProduto("ipad");
		// p.setPreco(2000.);// Double: tem que ter ponto.
		// p.setQuantidade(2);

		// set: entrada, atribuir.
		// encapsular de 2 formas (set ou posso encapsular com construtor).
		// toString: valor do objeto.

		System.out.println(p.toString());
		System.out.println(p.equals(p2));
		System.out.println(p.hashCode()); // o id do produto é 10 (resp = 10).

	}

}
