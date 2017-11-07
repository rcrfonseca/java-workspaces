package pacote3;

import java.util.ArrayList;
import java.util.List;

public class Oraculo {

	private List<String> nomes = new ArrayList<String>();
	private List<String> atributos = new ArrayList<String>();
	private Integer quantosNomes;
	private Integer quantosAtributos;

	// Java Code Convention.

	public Integer getQuantosNomes() {
		return quantosNomes;
	}

	public void setQuantosNomes(Integer quantosNomes) {
		this.quantosNomes = quantosNomes;
	}

	public Integer getQuantosAtributos() {
		return quantosAtributos;
	}

	public void setQuantosAtributos(Integer quantosAtributos) {
		this.quantosAtributos = quantosAtributos;
	}

	public void imprimir() {

		nomes.add("Belém");
		nomes.add("Sergio");
		nomes.add("Raphael");
		nomes.add("Carlos");
		nomes.add("Maria");

		setQuantosNomes(nomes.size());

		atributos.add("Inteligente");
		atributos.add("Devagar");
		atributos.add("Esforçada");
		atributos.add("Ignorante");
		atributos.add("Delicada");

		setQuantosAtributos(atributos.size());

		int i = (int) (Math.random() * getQuantosNomes()); /*
															 * Número de ponto
															 * flutuante, tem
															 * que converter
															 * para int para
															 * multiplicar para
															 * achar um número
															 * da lista.
															 */
		System.out.print(nomes.get(i));
		System.out.print(" é uma pessoa: ");
		i = (int) (Math.random() * getQuantosAtributos());
		System.out.println(atributos.get(i));
	}

}
