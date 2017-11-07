package entity;

public class Cliente {
	public final static Double PI = 3.14;

	/*
	 * Modificador 'static' indica atributo estático, já possui um valor
	 * pré-definido, mas pode ser alterado.
	 * 
	 * Para um atributo indicar que não pode ter seu valor alterado, usamos os
	 * modificadores 'final' e 'static'.
	 * 
	 * Atributo estático é declarado totalmente em caixa alta.
	 * 
	 * Atributo estático deve ser controlado devido a O.O. Static não necessita
	 * de objeto.
	 */

	public static void main(String[] args) {
		System.out.println(PI);
		// diferente do outro programa (obj)

	}

}
