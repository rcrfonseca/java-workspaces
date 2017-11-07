package listagem;

import java.util.regex.*;

public class ValidacaoCliente {
	Pattern p;
	Matcher m;

	public Boolean isValidaNome(String nome) {

		p = Pattern.compile("[A-Z a-z�-�]{3,35}");// Pattern � para criar a
													// regra
		// vai aceitar letras mai�sculas, vai aceitar espa�o e letras
		// min�sculas. �� aceitar� letras com acentos
		// vai colocar um limite de no m�nimo 3 letras e no m�ximo 35 letras
		// N�o se pode ter espa�o entre os colchetes e as chaves.
		m = p.matcher(nome);// aplicar a regra
		return m.matches();// regra verdadeiro ou falso
		// se tiver certo true, se tiver errado false
	}

	public Boolean isValidaSexo(String sexo) {

		p = Pattern.compile("[M|F|m|f]{1}");// Pattern � para criar a regra
		// o | significa OU
		// vai aceitar letras M F m f
		// vai colocar um limite de no m�nimo e no m�ximo 1 letra
		m = p.matcher(sexo);// aplicar a regra
		return m.matches();// reagra verdadeiro ou falso
		// se tiver certo true, se tiver errado false
	}

	public static void main(String[] args) {
		ValidacaoCliente v = new ValidacaoCliente();
		System.out.println(v.isValidaNome("Thiago Santos"));
		System.out.println(v.isValidaSexo("m"));
	}
}