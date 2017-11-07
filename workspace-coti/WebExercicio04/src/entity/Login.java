package entity;

public class Login {

	private Integer idlogin;
	private String login;
	private String senha;

	public Login() {
	}

	public Login(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public void setIdlogin(Integer idlogin) {
		this.idlogin = idlogin;
	}

	public Integer getIdlogin() {
		return idlogin;
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

	public String toString() {
		return idlogin + ", " + login + ", " + senha;
	}
}