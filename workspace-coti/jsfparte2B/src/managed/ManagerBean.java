package managed;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import persistencejdbc.PessoaDao;
import entity.Endereco;
import entity.Pessoa;

public class ManagerBean {

	private Pessoa pessoa;
	private Endereco endereco;
	private List<Pessoa> listagem;

	public ManagerBean() {
		pessoa = new Pessoa();
		pessoa.setEndereco(new Endereco());
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Pessoa> getListagem() {
		List<Pessoa> resp = new ArrayList<Pessoa>();
		try {
			PessoaDao pd = new PessoaDao();
			resp = pd.findByAll();

		} catch (Exception e) {

		}

		return resp;
	}

	public void setListagem(List<Pessoa> listagem) {
		this.listagem = listagem;
	}

	public String gravaDados() {
		// .jar reconheceu
		FacesContext fc = FacesContext.getCurrentInstance();
		// é para mensagem para jsp cadastro ...
		String msg = "";

		try {
			PessoaDao pd = new PessoaDao();
			pd.create(pessoa);
			pessoa = new Pessoa();

			msg = "dados gravados";
		} catch (Exception e) {

			msg = "erro :" + e.getMessage();
		}

		// duas mensagens ele passa ou dados gravados ou erro
		fc.addMessage("form1", new FacesMessage(msg));
		return null;
	}

}
