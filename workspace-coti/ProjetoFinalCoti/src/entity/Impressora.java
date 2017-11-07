package entity;

public class Impressora {
	
	private String nome;
	private String marca;
	private String modelo;
	private String conexao;
	
	public Impressora() {
	}

	public Impressora(String nome, String marca, String modelo, String conexao) {
		this.nome = nome;
		this.marca = marca;
		this.modelo = modelo;
		this.conexao = conexao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getConexao() {
		return conexao;
	}

	public void setConexao(String conexao) {
		this.conexao = conexao;
	}

	public String toString() {
		return "Impressora: " + nome + ", Marca = " + marca + ", Modelo = "
				+ modelo + ", Conexao = " + conexao;
	}
}