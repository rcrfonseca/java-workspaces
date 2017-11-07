package entity;

public class Vendedor {
	private Integer idvendedor;
	private String vendedor;
	private Double vendas[];

	// se colocasse private Double vendas[] = new Double[3] n�o adiantaria nada.
	// O vetor aceitaria atribui�ao de valores em novas posi�oes.
	// A forma correta � definir no m�todo set().
	// Se declarar dentro do construtor vazio:
	// public Vendedor() {
	// vendas = new Double[3];
	// }
	// N�o adiantaria para colocar limite no vetor.

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

		this.vendas = new Double[3];// tamanho do vetor � 3 posi�oes.
		// especifiquei o tamanho
		// O n�mero de vendas tem que ser igual ao n�mero atribu�do ao array
		// sen�o dar� erro.
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
		v.setVendas(new Double[] { 1., 1., 6. });// O n�mero de vendas tem que
		// ser igual ao n�mero
		// atribu�do ao array.

		System.out.println(v.getVendedor());
		System.out.println(v.getVendas()[0] + v.getVendas()[1]
				+ v.getVendas()[2]);

	}

}
