import java.rmi.*;
import java.util.*;
import java.rmi.server.*;

interface Server extends Remote {
	public List<Client> getClients() throws RemoteException;
}
