package entity;

import javax.persistence.*;

@Entity
@Table
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer idpessoa;

	@Column(length = 35)
	private String nome;

	@Column(length = 1)
	private String sexo;

	public Pessoa(Integer idpessoa, String nome, String sexo) {
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Pessoa() {
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

}
