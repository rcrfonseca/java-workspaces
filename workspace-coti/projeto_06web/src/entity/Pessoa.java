package entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;

@Entity /* Início de anotação. É porque vai virar uma tabela. */
@Table
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer idpessoa;
	@Column(length = 35, nullable = false)
	/* (nullable=false) = not null. */
	private String nome;

	//@OneToOne(mappedBy = "pessoa")
	/* Relacionamento 1 * 1
	/* o nome do mappedBy deve ser igual ao atributo que estiver na classe Endereco. */
	//private Endereco endereco;
	
	/*@OneToMany(mappedBy = "pessoa") /* Um para muitos. 1 * N. */
	/*private List<Endereco> endereco;*/
	
	@ManyToMany(mappedBy = "pessoa")
	private List<Endereco> endereco;
	
	public Pessoa(Integer idpessoa, String nome) {
		this.idpessoa = idpessoa;
		this.nome = nome;
	}
	
	public Pessoa() {
	}

	public String toString() {
		return idpessoa + "," + nome;
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

	/*public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}*/

	public List<Endereco> getEndereco() {
		return endereco;
	}
	
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
}