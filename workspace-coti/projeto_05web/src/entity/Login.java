package entity;

import java.io.Serializable;
import javax.persistence.*;

//Entidade
//N�o � porque o pacote se chama entity que colocamos o nome da anota��o de Entity.
@Entity
@Table
/*
 * JPA: Anota��o, serve para criar uma tabela no BD a partir de uma classe. Para
 * isso � necess�rio a lib: ejb3-persistence.jar
 */
public class Login implements Serializable {

	/*
	 * Implementar Serializable � obrigat�rio no EJB, no Hibernate N�O. Serve
	 * para criar objeto com a classe.
	 */

	private static final long serialVersionUID = 1L;
	// SerialVersionUID. Apenas para a classe, n�o ser� usado.

	//Chave prim�ria.
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idlogin;
	
	/* Usuario tamanho 25 e n�o pode duplicar, unique=true.*/
	@Column(length=25, unique=true)
	private String usuario;
	
	@Column(length=100)
	private String senha;

	public Login(Integer idlogin, String usuario, String senha) {
		this.idlogin = idlogin;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Login() {
	}

	public String toString() {
		return idlogin + ", " + usuario + ", " + senha;
	}

	public Integer getIdlogin() {
		return idlogin;
	}

	public void setIdlogin(Integer idlogin) {
		this.idlogin = idlogin;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
