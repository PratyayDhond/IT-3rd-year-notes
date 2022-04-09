import java.rmi.*;
import java.rmi.server.*;

public interface AddServerIntf extends Remote{
  public double add(double a, double b) throws RemoteException;
  public double subtract(double a,double b) throws RemoteException;
  public double multiply(double a, double b) throws RemoteException;
  public double divide(double a, double b) throws RemoteException;
}
