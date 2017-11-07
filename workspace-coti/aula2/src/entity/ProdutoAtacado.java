package entity;

public class ProdutoAtacado extends Produto {

	@Override
	public Double getDesconto() {
		if (getQuantidade() >= 100) {
			/*
			 * Declarado que para obter um desconto, a compra deve possuir pelo
			 * menos 100 itens.
			 */
			Double valorDescontoUnitario = getPreco() * 10 / 100;
			/*
			 * Obtemos o valor de desconto por pe�a.
			 */
			Double valorTotalDesconto = valorDescontoUnitario * getQuantidade();
			/*
			 * Dado o valor de desconto por pe�a (valorDescontoUnitario)
			 * multiplicado � quantidade comprada (getQuantidade()), obtemos o
			 * valor total de desconto (valorTotalDesconto) da compra.
			 */
			return (getQuantidade() * getPreco()) - valorTotalDesconto;
			/*
			 * Obtemos o valor total da compra atrav�s da quantidade de itens
			 * comprados (getQuantidade()) multiplicado pelo pre�o (getPreco())
			 * (isso representa o valor da compra sem desconto), e subtraindo
			 * pelo valor total de desconto dado.
			 */
		} else {
			return 0.0;
		}
	}

}
