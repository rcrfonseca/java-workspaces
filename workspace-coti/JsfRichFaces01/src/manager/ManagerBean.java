package manager;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import persistence.PessoaDao;
import entity.*;

public class ManagerBean {
	
	private Pessoa pessoa;
	private List<Pessoa> listagem;
	
	public ManagerBean(){
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public List<Pessoa> getListagem() {
		PessoaDao pd = new PessoaDao();
		try {
			listagem = pd.findByAll();
		} catch (Exception e) {
		}
		return listagem;
	}
	
	public String cadastro(){
		FacesContext fc = FacesContext.getCurrentInstance();
		PessoaDao pd = new PessoaDao();
		String msg = "";
		try {
			pd.create(pessoa);
			pessoa = new Pessoa();
			msg = "Dados Gravados!";
		} catch (Exception e) {
			msg = "Erro: " + e.getMessage();
		}
		fc.addMessage("form1", new FacesMessage(msg));
		return null;
	}

	public void setListagem(List<Pessoa> listagem) {
		this.listagem = listagem;
	}
}