import java.rmi.*;

interface Intf extends Remote {
	    String[] showList() throws RemoteException;
}
