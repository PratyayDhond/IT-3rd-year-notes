 import java.rmi.*;
import java.rmi.server.*;

public interface AddServerIntf extends Remote{
  public void helloThere() throws RemoteException;
}
