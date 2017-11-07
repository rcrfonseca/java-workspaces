package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Login implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idlogin;
	
	@Column(length=35, unique=true, nullable=false)
	private String login;
	
	@Column(length=100, nullable=false)
	private String senha;

	public Login(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Login(){
	}
	
	public String toString(){
		return idlogin + ", " + login + ", " + senha;
	}

	public Integer getIdlogin() {
		return idlogin;
	}

	public void setIdlogin(Integer idlogin) {
		this.idlogin = idlogin;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}