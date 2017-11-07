package controle;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class ProgramaCliente {
	public static void main(String[] args) throws Exception {
		LocateRegistry.createRegistry(2000);
		String urlServidor = "127.0.0.1";
		String nomeObjRemoto = "MeuServidorCalculadora";
		InterfaceServidorCalculadora calc = (InterfaceServidorCalculadora) Naming
				.lookup("rmi://" + urlServidor + "/" + nomeObjRemoto);

		System.out.println(" Programa Cliente: ");

		while (true) {
			System.out.println(" Entre com o operação(+, -, *, /: ");
			Scanner teclado = new Scanner(System.in);
			String aux = teclado.nextLine();

			if (aux.length() == 0)
				System.exit(0);

			char op = aux.charAt(0);

			if (op != '+' && op != '-' && op != '*' && op != '/')
				System.exit(0);

			System.out.println("Entre com o primeiro número");
			aux = teclado.nextLine();
			int a = Integer.parseInt(aux);

			System.out.println("Entre com o segundo número");
			aux = teclado.nextLine();
			int b = Integer.parseInt(aux);

			int resultado = 0;

			switch (op) {
			case '+':
				resultado = calc.somar(a, b);
				break;

			case '-':
				resultado = calc.subtrair(a, b);
				break;

			case '*':
				resultado = calc.multiplicar(a, b);
				break;

			case '/':
				resultado = calc.dividir(a, b);
				break;
			}

			System.out.println("Resultado: " + resultado);

		}

	}
}
