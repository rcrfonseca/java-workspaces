package dominio;

public class Veiculo {

	private String placa;

	private String entrada;

	private String saida;

	private ClienteEspecial clienteEspecial;

	public Veiculo() {
		super();

	}

	public Veiculo(String placa, String entrada, String saida,
			ClienteEspecial clienteEspecial) {
		super();
		this.placa = placa;
		this.entrada = entrada;
		this.saida = saida;
		this.clienteEspecial = clienteEspecial;
	}

	public void incluir() {

	}

	public void alterar() {

	}

	public void consultar() {

	}

	public void excluir() {

	}

	public ClienteEspecial getClienteEspecial() {
		return clienteEspecial;
	}

	public void setClienteEspecial(ClienteEspecial clienteEspecial) {
		this.clienteEspecial = clienteEspecial;
	}

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

}
