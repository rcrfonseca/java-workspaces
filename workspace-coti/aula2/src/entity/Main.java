package entity;

public class Main {
	public static void main(String[] args) {
		// pv é objeto.
		ProdutoVarejo pv = new ProdutoVarejo();
		pv.setProduto("bala de café");
		pv.setQuantidade(10);
		pv.setPreco(2.);

		System.out.println("Produto: " + pv.getProduto());
		System.out.println("total: "
				+ ((pv.getQuantidade() * pv.getPreco()) - pv.getDesconto()));

		ProdutoAtacado pa = new ProdutoAtacado();

		pa.setProduto("bala de café");
		pa.setQuantidade(400);
		pa.setPreco(2.);

		System.out.println("Produto: " + pa.getProduto());
		System.out.println("Total: " + (pa.getDesconto()));
		/* Temos o total da compra com desconto. */

	}
}
