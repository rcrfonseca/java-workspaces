package dominio;

public class VeiculoEspecial extends Veiculo {

	private String modelo;

	private String cor;

	public VeiculoEspecial(String placa, String entrada, String saida,
			ClienteEspecial clienteEspecial) {
		super(placa, entrada, saida, clienteEspecial);

	}

	public VeiculoEspecial(String modelo, String cor) {
		super();
		this.modelo = modelo;
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
