package entity;

//Subclasse com obrigação de implementar o método getDesconto().

public class ProdutoVarejo extends Produto {

	// Classe ProdutoVarejo herda de produto, obrigada a implementar o método
	// getDesconto().
	@Override
	public Double getDesconto() {
		return 0.;
	}

	// getDesconto trabalha de outra forma (polimorfismo: quando um método herdado
	// é reprogamado).
}
