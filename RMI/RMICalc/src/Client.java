import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 Number ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try {
			Calc calc = (Calc) Naming.lookup("localhost");
			System.out.println("sum is "+calc.sum(a, b));
			System.out.println("sub is "+calc.sub(a, b));
			System.out.println("Multiplication  is "+calc.multi(a, b));
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
