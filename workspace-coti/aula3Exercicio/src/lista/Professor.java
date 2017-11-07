package lista;

import java.util.*;

public class Professor {
	
	public Professor(){
		
	}

	List<String> listaMaterias = new ArrayList<String>();

	public void adicionarMateria(String texto) {
		listaMaterias.add(texto);
	}

	public void removerMateria(int pos) {
		listaMaterias.remove(pos);
	}

	public List<String> retornarLista() {
		return listaMaterias;
	}

	public String retornaPosicao(int pos) {
		return listaMaterias.get(pos);
	}
	
	public static void main(String[] args) {
		Professor p = new Professor();
		
		p.adicionarMateria("Português");
		p.adicionarMateria("Matemática");
		p.adicionarMateria("Geografia");
		
		System.out.println(p.listaMaterias);
		
		p.removerMateria(2);
		
		System.out.println(p.listaMaterias);
		
		System.out.println(p.retornaPosicao(1));
	}
	
	

}
