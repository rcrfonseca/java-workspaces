package uni.jsf.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuario", uniqueConstraints = { @UniqueConstraint(columnNames = { "login" }) })
public class Usuario
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen_usuario")
	@SequenceGenerator(name = "gen_usuario", sequenceName = "seq_usuario")
	private Long	id;

	private String	login	= "";
	private String	senha	= "";
	private String	nome	= "";
	private String	email	= "";


	public boolean validarSenha(String senhaDigitada)
	{
		if (this.senha.equals(senhaDigitada))
			return true;
		else
			return false;
	}


	public Long getId()
	{
		return id;
	}


	public void setId(Long id)
	{
		this.id = id;
	}


	public String getLogin()
	{
		return login;
	}


	public void setLogin(String login)
	{
		this.login = login;
	}


	public String getSenha()
	{
		return senha;
	}


	public void setSenha(String senha)
	{
		this.senha = senha;
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


	@Override
	public boolean equals(Object usuario)
	{
		return this.login.equals(((Usuario) usuario).login);
	}
}
