import java.rmi.*;

public class MyServer{
	public static void main(String[] args) throws Exception{
		Remote r = new ServerImplementation();
		System.out.println("object created");
		Naming.rebind("rmi://127.0.0.1/AddServer",r);
		System.out.println("Exitting");		
	}
}
