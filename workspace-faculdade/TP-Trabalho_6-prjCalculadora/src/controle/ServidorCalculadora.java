package controle;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServidorCalculadora extends UnicastRemoteObject implements
		InterfaceServidorCalculadora {
	public ServidorCalculadora() throws RemoteException {
		super();
	}

	public int somar(int a, int b) throws RemoteException {
		return a + b;
	}

	public int subtrair(int a, int b) throws RemoteException {
		return a - b;
	}

	public int multiplicar(int a, int b) throws RemoteException {
		return a * b;
	}

	public int dividir(int a, int b) throws RemoteException {
		return a / b;
	}

}
