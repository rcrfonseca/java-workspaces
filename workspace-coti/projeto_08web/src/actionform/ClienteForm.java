package actionform;

import org.apache.struts.action.ActionForm;

public class ClienteForm extends ActionForm {
	
	/* Struts ActionForm bean*/

	private static final long serialVersionUID = 1L;
	private Integer idcliente;
	private String nome;
	private String email;
	private String datanasc;

	public ClienteForm() {
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
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

	public String getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
}