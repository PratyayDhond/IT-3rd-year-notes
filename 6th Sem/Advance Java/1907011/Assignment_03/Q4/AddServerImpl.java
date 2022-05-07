 import java.rmi.*;
import java.rmi.server.*;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf{

  AddServerImpl() throws RemoteException{
    super();
  }

  public long powerOf(long number, long power) throws RemoteException{
    System.out.println("Power : "  + power);
    int no =(int) number;
    for(int i = 1; i < power; i++){
      number = number * no;
      System.out.println(number);
    }
    return number;
  }

}
