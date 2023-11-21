import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {
	protected HelloImpl() throws RemoteException{
		super();
	}
	
	
	public String sayHello() throws RemoteException{
		return"Welcome to RMI Programing..";
	}
}
