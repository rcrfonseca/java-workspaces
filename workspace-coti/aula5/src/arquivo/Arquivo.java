package arquivo;

import java.io.*;

public class Arquivo {

	public static void main(String[] args) {
		Arquivo a = new Arquivo();
		a.gravarArquivo();
		//a.lerArquivo();
	}

	public void gravarArquivo() {
		try {
			RandomAccessFile raf = new RandomAccessFile("c:/aula.txt", "rw");
			raf.writeBytes("\r\nSergio Mendes");
			raf.writeBytes("\r\nLeo Barroso");
			raf.writeBytes("\r\nLuan Santana");
			raf.close();

			System.out.println("Arquivo gravado com sucesso!");

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

	/* public void lerArquivo(){ 
		try { 
			RandomAccessFile raf = new RandomAccessFile ("c:/aula.txt","r"); 
			while (raf.)
				} catch (Exception e) {
	 System.out.println(e.getMessage()); 
	  }
	}*/
}
