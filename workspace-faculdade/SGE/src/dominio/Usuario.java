package dominio;

public class Usuario extends Pessoa {

	private String login;

	private String senha;

	private Funcionario funcionario;

	public Usuario(String nome) {
		super(nome);

	}

	public Usuario(String login, String senha, Funcionario funcionario) {
		super();
		this.login = login;
		this.senha = senha;
		this.funcionario = funcionario;
	}

	public void incluir() {

	}

	public void alterar() {

	}

	public void consultar() {

	}

	public void excluir() {

	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
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
