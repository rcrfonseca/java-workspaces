package entity;

public class Vendedor {
	private Integer idvendedor;
	private String vendedor;
	private Double vendas[];

	// se colocasse private Double vendas[] = new Double[3] não adiantaria nada.
	// O vetor aceitaria atribuiçao de valores em novas posiçoes.
	// A forma correta é definir no método set().
	// Se declarar dentro do construtor vazio:
	// public Vendedor() {
	// vendas = new Double[3];
	// }
	// Não adiantaria para colocar limite no vetor.

	public Integer getIdvendedor() {
		return idvendedor;
	}

	public void setIdvendedor(Integer idvendedor) {
		this.idvendedor = idvendedor;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Double[] getVendas() {
		return vendas;
	}

	public void setVendas(Double[] vendas) {

		this.vendas = new Double[3];// tamanho do vetor é 3 posiçoes.
		// especifiquei o tamanho
		// O número de vendas tem que ser igual ao número atribuído ao array
		// senão dará erro.
		if (this.vendas.length == vendas.length) {
			this.vendas = vendas; // atributo recebe o parametro dos valores
		} else {
			this.vendas = null;

		}
	}

	public static void main(String[] args) {
		Vendedor v = new Vendedor();
		v.setIdvendedor(24);
		v.setVendedor("Leo");
		v.setVendas(new Double[] { 1., 1., 6. });// O número de vendas tem que
		// ser igual ao número
		// atribuído ao array.

		System.out.println(v.getVendedor());
		System.out.println(v.getVendas()[0] + v.getVendas()[1]
				+ v.getVendas()[2]);

	}

}
