package controle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class ValidadorEmail implements Validator {

	@Override
	public void validate(FacesContext contexto, UIComponent componente, Object valor)
			throws ValidatorException {
		
		String email = (String) valor;
		if (!email.contains("@"))
		{
			throw new ValidatorException (new FacesMessage("Validador de Email: O email é inválido"));
		}
		// TODO Auto-generated method stub

	}
}
