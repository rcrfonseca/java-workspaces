package entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column	
	private Integer idpessoa;
	
	@Column (length=35)
	private String nome;
	
	@Column (length=35, unique=true)
	private String email;

	public Pessoa(Integer idpessoa, String nome, String email) {
		this.idpessoa = idpessoa;
		this.nome = nome;
		this.email = email;
	}

	public Pessoa() {
	}

	public String toString() {
		return idpessoa + ", " + nome + ", " + email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}