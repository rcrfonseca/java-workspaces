package dominio;

public class EnderecoCliente {

	private String logradouro;

	private String bairro;

	private String cidade;

	private String uf;

	private ClienteEspecial[] clienteEspecial;

	public EnderecoCliente() {
		super();

	}

	public EnderecoCliente(String logradouro, String bairro, String cidade,
			String uf, ClienteEspecial[] clienteEspecial) {
		super();
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.clienteEspecial = clienteEspecial;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public ClienteEspecial[] getClienteEspecial() {
		return clienteEspecial;
	}

	public void setClienteEspecial(ClienteEspecial[] clienteEspecial) {
		this.clienteEspecial = clienteEspecial;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
