import java.rmi.*;
import java.rmi.server.*;

public interface AddServerIntf extends Remote{
  public long powerOf(long number,long power) throws RemoteException;
}
