package listagem;

import java.util.regex.*;

public class ValidacaoCliente {
	Pattern p;
	Matcher m;

	public Boolean isValidaNome(String nome) {

		p = Pattern.compile("[A-Z a-zá-ú]{3,35}");// Pattern é para criar a
													// regra
		// vai aceitar letras maiúsculas, vai aceitar espaço e letras
		// minúsculas. áú aceitará letras com acentos
		// vai colocar um limite de no mínimo 3 letras e no máximo 35 letras
		// Não se pode ter espaço entre os colchetes e as chaves.
		m = p.matcher(nome);// aplicar a regra
		return m.matches();// regra verdadeiro ou falso
		// se tiver certo true, se tiver errado false
	}

	public Boolean isValidaSexo(String sexo) {

		p = Pattern.compile("[M|F|m|f]{1}");// Pattern é para criar a regra
		// o | significa OU
		// vai aceitar letras M F m f
		// vai colocar um limite de no mínimo e no máximo 1 letra
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