package controle;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ProgramaServidor {
	public static void main(String[] args) throws Exception {
		LocateRegistry.createRegistry(1099);
		ServidorCalculadora er = new ServidorCalculadora();
		Naming.rebind("MeuServidorCalculadora", er);
		System.out.println("Pronto para operação!");
	}

}
