package controle;

import java.rmi.*;

public interface InterfaceServidorCalculadora extends Remote 
{
	public int somar(int a, int b)throws RemoteException;
	public int subtrair(int a, int b)throws RemoteException;
	public int multiplicar(int a, int b)throws RemoteException;
	public int dividir(int a, int b)throws RemoteException;
}
