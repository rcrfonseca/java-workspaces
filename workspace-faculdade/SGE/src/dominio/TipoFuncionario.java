package dominio;

public class TipoFuncionario {

	private String codTipo;

	private String descricao;

	private Funcionario funcionario;

	public TipoFuncionario() {
		super();

	}

	public TipoFuncionario(String codTipo, String descricao,
			Funcionario funcionario) {
		super();
		this.codTipo = codTipo;
		this.descricao = descricao;
		this.funcionario = funcionario;
	}

	public String getCodTipo() {
		return codTipo;
	}

	public void setCodTipo(String codTipo) {
		this.codTipo = codTipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
