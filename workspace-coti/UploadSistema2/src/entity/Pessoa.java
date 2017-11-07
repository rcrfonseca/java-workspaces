package entity;

public class Pessoa {

	private Integer idpessoa;

	private String nome;

	private String sexo;

	private String foto;

	public Pessoa() {
	}

	public Pessoa(Integer idpessoa, String nome, String sexo, String foto) {
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.sexo = sexo;
		this.foto = foto;
	}

	public Integer getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(Integer idpessoa) {
		this.idpessoa = idpessoa;
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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}