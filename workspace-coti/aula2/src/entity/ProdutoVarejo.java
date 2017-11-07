package entity;

//Subclasse com obriga��o de implementar o m�todo getDesconto().

public class ProdutoVarejo extends Produto {

	// Classe ProdutoVarejo herda de produto, obrigada a implementar o m�todo
	// getDesconto().
	@Override
	public Double getDesconto() {
		return 0.;
	}

	// getDesconto trabalha de outra forma (polimorfismo: quando um m�todo herdado
	// � reprogamado).
}
