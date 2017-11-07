package actionform;

import org.apache.struts.action.ActionForm;
import entity.*;

public class AlunoForm extends ActionForm {
	/* ActionForm é o gerenciador de classes. */

	private static final long serialVersionUID = 1L;
	
	private Aluno aluno;

	public AlunoForm() {
		aluno = new Aluno();
	}

	/*
	 * Construtor aqui é obrigatório, e é vazio. Obrigatório chamar a classe do
	 * entity. Qunado chamar o ActionForm, o Aluno já estará instanciado.
	 */

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	//Gerenciar outras classes.
}
