package entity;

public class Cliente {
	public final static Double PI = 3.14;

	/*
	 * Modificador 'static' indica atributo est�tico, j� possui um valor
	 * pr�-definido, mas pode ser alterado.
	 * 
	 * Para um atributo indicar que n�o pode ter seu valor alterado, usamos os
	 * modificadores 'final' e 'static'.
	 * 
	 * Atributo est�tico � declarado totalmente em caixa alta.
	 * 
	 * Atributo est�tico deve ser controlado devido a O.O. Static n�o necessita
	 * de objeto.
	 */

	public static void main(String[] args) {
		System.out.println(PI);
		// diferente do outro programa (obj)

	}

}
