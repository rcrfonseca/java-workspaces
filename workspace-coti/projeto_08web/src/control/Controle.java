package control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import actionform.ClienteForm;

public class Controle extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ClienteForm cf = (ClienteForm) form; // request.getParameterALL

		response.getWriter().print("<br/>Nome: " + cf.getNome());
		response.getWriter().print("<br/>Email: " + cf.getEmail());
		response.getWriter().print("<br/>Data de Nascimento: " + cf.getDatanasc());

		return null;
		/*
		 * Quando se retorna NULL é porque não irá redirecionar para outra
		 * página.
		 */

	}

}
