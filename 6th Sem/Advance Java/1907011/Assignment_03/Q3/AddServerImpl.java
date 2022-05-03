import java.rmi.*;
import java.rmi.server.*;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf{

  AddServerImpl() throws RemoteException{
    super();
  }

  public void helloThere() throws RemoteException{
	System.out.println("Hello there. This is Server!");
  }

}
