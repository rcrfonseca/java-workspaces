package dominio;

import java.util.Date;

public class ClienteEspecial extends Pessoa {

	private String codCliente;

	private Date dataCadastro;

	private String situacao;

	private String cpf;

	private EnderecoCliente enderecoCliente;

	private Veiculo[] veiculo;

	public ClienteEspecial(String nome) {
		super(nome);

	}

	public ClienteEspecial(String codCliente, Date dataCadastro,
			String situacao, String cpf, EnderecoCliente enderecoCliente,
			Veiculo[] veiculo) {
		super();
		this.codCliente = codCliente;
		this.dataCadastro = dataCadastro;
		this.situacao = situacao;
		this.cpf = cpf;
		this.enderecoCliente = enderecoCliente;
		this.veiculo = veiculo;
	}

	public void incluir() {

	}

	public void alterar() {

	}

	public void consultar() {

	}

	public void excluir() {

	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public EnderecoCliente getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(EnderecoCliente enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Veiculo[] getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo[] veiculo) {
		this.veiculo = veiculo;
	}

}
