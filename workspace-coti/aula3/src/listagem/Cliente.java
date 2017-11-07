package listagem;

public class Cliente {
	private Integer idcliente;
	private String nome;
	private String sexo;

	public Cliente(Integer idcliente, String nome, String sexo) {
		this.idcliente = idcliente;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Cliente() {

	}

	@Override
	public String toString() {
		return idcliente + "," + nome + "," + sexo;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
