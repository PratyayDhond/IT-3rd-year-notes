import java.rmi.*;
import java.rmi.server.*;

public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf{

  AddServerImpl() throws RemoteException{
    super();
  }

  public double add(double a, double b) throws RemoteException{
    return a+b;
  }

  public double subtract(double a,double b) throws RemoteException{
      return a-b;
  }

  public double multiply(double a, double b) throws RemoteException{
    return a*b;
  }

  public double divide(double a, double b) throws RemoteException{
    if(b == 0){
      System.out.println("Cannot divide by 0");
      return 0;
    }
    else
      return a/b;
  }

}
