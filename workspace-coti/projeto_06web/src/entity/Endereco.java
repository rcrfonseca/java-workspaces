package entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;

@Entity
@Table
public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer idendereco;
	@Column
	private String bairro;
	@Column
	private String cidade;
	//@OneToOne
	
	/*@ManyToOne
	@JoinColumn(name = "id_pessoa")
	/* JoinColumn = foreign_key. */
	/*private Pessoa pessoa;*/

	// O nome do Objeto aqui deve ser igual ao mappedBy
	
	@ManyToMany
	@JoinTable(/* Para relacionamentos N * N. */
				name="pessoa_endereco",
				joinColumns=@JoinColumn(name="idpessoa", nullable=false),
				inverseJoinColumns=@JoinColumn(name="idendereco", nullable=false)
				)
	private List <Pessoa> pessoa;
	

	public Endereco() {
	}

	public Endereco(Integer idendereco, String bairro, String cidade) {
		this.idendereco = idendereco;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	/*public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}*/

	public Integer getIdendereco() {
		return idendereco;
	}

	public void setIdendereco(Integer idendereco) {
		this.idendereco = idendereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}