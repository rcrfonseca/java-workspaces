package dominio;

public class Funcionario {

	private String codFunc;

	private String tipo;

	private String descricao;

	private Usuario usuario;

	private TipoFuncionario tipoFuncionario;

	public Funcionario() {
		super();

	}

	public Funcionario(String codFunc, String tipo, String descricao,
			Usuario usuario, TipoFuncionario tipoFuncionario) {
		super();
		this.codFunc = codFunc;
		this.tipo = tipo;
		this.descricao = descricao;
		this.usuario = usuario;
		this.tipoFuncionario = tipoFuncionario;
	}

	public String getCodFunc() {
		return codFunc;
	}

	public void setCodFunc(String codFunc) {
		this.codFunc = codFunc;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public TipoFuncionario getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
