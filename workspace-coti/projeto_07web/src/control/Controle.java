package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import actionform.*;
import entity.*;

public class Controle extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		//Resgatar e imprimir.
		
		AlunoForm af = (AlunoForm) form; //significa request.getParameter(ALL);
		
		//Passei o resgate para o objeto do aluno.
		
		Aluno aluno = af.getAluno(); //Os dados foram para o Aluno.
		
		request.setAttribute("alunos", aluno);//Nome do atributo é alunos.
		return mapping.findForward("fim");
	}

}
