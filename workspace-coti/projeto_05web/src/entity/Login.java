package entity;

import java.io.Serializable;
import javax.persistence.*;

//Entidade
//Não é porque o pacote se chama entity que colocamos o nome da anotação de Entity.
@Entity
@Table
/*
 * JPA: Anotação, serve para criar uma tabela no BD a partir de uma classe. Para
 * isso é necessário a lib: ejb3-persistence.jar
 */
public class Login implements Serializable {

	/*
	 * Implementar Serializable é obrigatório no EJB, no Hibernate NÃO. Serve
	 * para criar objeto com a classe.
	 */

	private static final long serialVersionUID = 1L;
	// SerialVersionUID. Apenas para a classe, não será usado.

	//Chave primária.
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer idlogin;
	
	/* Usuario tamanho 25 e não pode duplicar, unique=true.*/
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
